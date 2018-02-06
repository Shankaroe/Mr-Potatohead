package com.example.shankara.myapplication;


import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    /** Create method with own toolbar */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(toolbar);
    }

    /** Save checkbox statuses in saveInstanceState */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        int[] checkBoxes = new int[10];
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.constraintLayout2);
        for (int i = 1; i < layout.getChildCount(); i++) {
            View v = layout.getChildAt(i);
            checkBoxes[i-1] = v.getVisibility();
        }
        outState.putIntArray("checkBoxes", checkBoxes);
    }

    /** Set checkboxes out of restoreInstanceState */
    @Override
    public void onRestoreInstanceState( Bundle inState) {
        super.onRestoreInstanceState(inState);
        int[] restoredCheckBoxes = inState.getIntArray("checkBoxes");
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.constraintLayout2);
        for (int i = 1; i < layout.getChildCount(); i++) {
            View v = layout.getChildAt(i);
            v.setVisibility(restoredCheckBoxes[i-1]);
        }
    }

    /** Event handler for when a checkbox is clicked */
    public void onCheckboxClicked(View view) {
        CheckBox checkBox = (CheckBox)view;
        boolean checked = checkBox.isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            // Checkbox for the arms
            case R.id.checkBox:
                if (checked)
                    findViewById(R.id.imageView2).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageView2).setVisibility(View.INVISIBLE);
                break;
            // Checkbox for the ears
            case R.id.checkBox2:
                if (checked)
                    findViewById(R.id.imageView3).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageView3).setVisibility(View.INVISIBLE);
                break;
            // Checkbox for the eyebrows
            case R.id.checkBox3:
                if (checked)
                    findViewById(R.id.imageView4).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageView4).setVisibility(View.INVISIBLE);
                break;
            // Checkbox for the eyes
            case R.id.checkBox4:
                if (checked)
                    findViewById(R.id.imageView5).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageView5).setVisibility(View.INVISIBLE);
                break;
            // Checkbox for the glasses
            case R.id.checkBox5:
                if (checked)
                    findViewById(R.id.imageView6).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageView6).setVisibility(View.INVISIBLE);
                break;
            // Checkbox for the hat
            case R.id.checkBox6:
                if (checked)
                    findViewById(R.id.imageView7).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageView7).setVisibility(View.INVISIBLE);
                break;
            // Checkbox for the mouth
            case R.id.checkBox7:
                if (checked)
                    findViewById(R.id.imageView8).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageView8).setVisibility(View.INVISIBLE);
                break;
            // Checkbox for the mustache
            case R.id.checkBox8:
                if (checked)
                    findViewById(R.id.imageView9).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageView9).setVisibility(View.INVISIBLE);
                break;
            // Checkbox for the nose
            case R.id.checkBox9:
                if (checked)
                    findViewById(R.id.imageView10).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageView10).setVisibility(View.INVISIBLE);
                break;
            // Checkbox for the shoes
            case R.id.checkBox10:
                if (checked)
                    findViewById(R.id.imageView11).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageView11).setVisibility(View.INVISIBLE);
                break;
        }
    }
}
