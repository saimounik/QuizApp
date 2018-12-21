package com.example.android.quizapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Instance variables for view elements
    private EditText editTextQ1 = null, editTextQ6 = null;
    private RadioGroup radioGroupQ2, radioGroupQ4, radioGroupQ5, radioGroupQ8, radioGroupQ9, radioGroupQ10;
    private CheckBox checkBoxQ3_1, checkBoxQ3_2, checkBoxQ3_3, checkBoxQ3_4 = null;
    private CheckBox checkBoxQ7_1, checkBoxQ7_2, checkBoxQ7_3, checkBoxQ7_4 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);

        editTextQ1 = (EditText) findViewById(R.id.Q1_answer);
        radioGroupQ2 = (RadioGroup) findViewById(R.id.radio_group_Q2);

        checkBoxQ3_1 = (CheckBox) findViewById(R.id.Q3_opt1_checkbox);
        checkBoxQ3_2 = (CheckBox) findViewById(R.id.Q3_opt2_checkbox);
        checkBoxQ3_3 = (CheckBox) findViewById(R.id.Q3_opt3_checkbox);
        checkBoxQ3_4 = (CheckBox) findViewById(R.id.Q3_opt4_checkbox);

        radioGroupQ4 = (RadioGroup) findViewById(R.id.radio_group_Q4);
        radioGroupQ5 = (RadioGroup) findViewById(R.id.radio_group_Q5);

        editTextQ6 = (EditText) findViewById(R.id.Q6_answer);

        checkBoxQ7_1 = (CheckBox) findViewById(R.id.Q7_opt1_checkbox);
        checkBoxQ7_2 = (CheckBox) findViewById(R.id.Q7_opt2_checkbox);
        checkBoxQ7_3 = (CheckBox) findViewById(R.id.Q7_opt3_checkbox);
        checkBoxQ7_4 = (CheckBox) findViewById(R.id.Q7_opt4_checkbox);

        radioGroupQ8 = (RadioGroup) findViewById(R.id.radio_group_Q8);
        radioGroupQ9 = (RadioGroup) findViewById(R.id.radio_group_Q9);
        radioGroupQ10 = (RadioGroup) findViewById(R.id.radio_group_Q10);
    }

    String Q1_solution1 = "Indirect Taxation";     //Question 1 Solution if user enters Indirect Taxation
    String Q1_solution2 = "indirect taxation";     //Question 1 Solution if user enters indirect taxation
    String Q1_solution3 = "Indirect tax";     //Question 1 Solution if user enters Indirect tax

    int Q2_solution = R.id.radio_button_Q2_opt3;  //Question 2 solution.
    int Q4_solution = R.id.radio_button_Q4_opt2;  //Question 4 solution.
    int Q5_solution = R.id.radio_button_Q5_opt2;  //Question 7 solution.
    int Q8_solution = R.id.radio_button_Q8_opt1;  //Question 8 solution.
    int Q9_solution = R.id.radio_button_Q9_opt1;  //Question 9 solution.
    int Q10_solution = R.id.radio_button_Q10_opt3;  //Question 10 solution.

    String Q6_solution1 = "Petrol";             //Question 6 Solution if user enters JAMES GOSLING.
    String Q6_solution2 = "petrol";             //Question 6 Solution if user enters James Gosling.
    String Q6_solution3 = "Petrolium Products"; //Question 6 Solution if user enters james gosling.
    int correctQuestions = 0;                   //Correct Ans Count
    int wrongQuestions = 0;                     //Wrong Ans Count

    private void Question1() {
        if (editTextQ1.getText().toString().equalsIgnoreCase(Q1_solution1) ||
                editTextQ1.getText().toString().equalsIgnoreCase(Q1_solution2) ||
                editTextQ1.getText().toString().equalsIgnoreCase(Q1_solution3)) {
            correctQuestions = correctQuestions + 1;
        } else {
            wrongQuestions = wrongQuestions + 1;
        }
    }


    private void Question2() {
        if (radioGroupQ2.getCheckedRadioButtonId() == Q2_solution) {
            correctQuestions = correctQuestions + 1;
        } else {
            wrongQuestions = wrongQuestions + 1;
        }
    }

    private void Question3() {
        if (checkBoxQ3_1.isChecked() && checkBoxQ3_2.isChecked() && checkBoxQ3_3.isChecked() && !checkBoxQ3_4.isChecked()) {
            correctQuestions = correctQuestions + 1;
        } else {
            wrongQuestions = wrongQuestions + 1;
        }
    }


    private void Question4() {
        if (radioGroupQ4.getCheckedRadioButtonId() == Q4_solution) {
            correctQuestions = correctQuestions + 1;
        } else {
            wrongQuestions = wrongQuestions + 1;
        }
    }

    private void Question5() {
        if (radioGroupQ5.getCheckedRadioButtonId() == Q5_solution) {
            correctQuestions = correctQuestions + 1;
        } else {
            wrongQuestions = wrongQuestions + 1;
        }
    }


    private void Question6() {
        if (editTextQ6.getText().toString().equalsIgnoreCase(Q6_solution1) ||
                editTextQ6.getText().toString().equalsIgnoreCase(Q6_solution2) ||
                editTextQ6.getText().toString().equalsIgnoreCase(Q6_solution3)) {
            correctQuestions = correctQuestions + 1;
        } else {
            wrongQuestions = wrongQuestions + 1;
        }
    }

    private void Question7() {
        if (checkBoxQ7_1.isChecked() && checkBoxQ7_2.isChecked() && checkBoxQ7_3.isChecked() && !checkBoxQ7_4.isChecked()) {
            correctQuestions = correctQuestions + 1;
        } else {
            wrongQuestions = wrongQuestions + 1;
        }
    }


    private void Question8() {
        if (radioGroupQ8.getCheckedRadioButtonId() == Q8_solution) {
            correctQuestions = correctQuestions + 1;
        } else {
            wrongQuestions = wrongQuestions + 1;
        }
    }

    private void Question9() {
        if (radioGroupQ9.getCheckedRadioButtonId() == Q9_solution) {
            correctQuestions = correctQuestions + 1;
        } else {
            wrongQuestions = wrongQuestions + 1;
        }
    }

    private void Question10() {
        if (radioGroupQ10.getCheckedRadioButtonId() == Q10_solution) {
            correctQuestions = correctQuestions + 1;
        } else {
            wrongQuestions = wrongQuestions + 1;
        }
    }


    public void submitQuiz(View view) {
        correctQuestions = 0;
        wrongQuestions = 0;
        Question1();
        Question2();
        Question3();
        Question4();
        Question5();
        Question6();
        Question7();
        Question8();
        Question9();
        Question10();
        if (wrongQuestions == 0) {
            Toast.makeText(getApplicationContext(), R.string.allCorrectAns, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), String.format(getString(R.string.quizResultText), correctQuestions, wrongQuestions), Toast.LENGTH_LONG).show();
        }
    }

    public void reset(View view) {
        editTextQ1.setText("");
        radioGroupQ2.clearCheck();

        checkBoxQ3_1.setChecked(false);
        checkBoxQ3_2.setChecked(false);
        checkBoxQ3_3.setChecked(false);
        checkBoxQ3_4.setChecked(false);

        radioGroupQ4.clearCheck();
        radioGroupQ5.clearCheck();
        editTextQ6.setText("");

        checkBoxQ7_1.setChecked(false);
        checkBoxQ7_2.setChecked(false);
        checkBoxQ7_3.setChecked(false);
        checkBoxQ7_4.setChecked(false);

        radioGroupQ8.clearCheck();
        radioGroupQ9.clearCheck();
        radioGroupQ10.clearCheck();


        Toast.makeText(getApplicationContext(), R.string.reset, Toast.LENGTH_LONG).show();
    }

}