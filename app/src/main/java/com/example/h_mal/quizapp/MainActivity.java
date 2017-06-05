package com.example.h_mal.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Initial score quantity set as public
     */
    int quantity = 0;
    boolean isCorrectQ1, isCorrectQ2, isCorrectQ3, isCorrectQ4, isCorrectQ5, isCorrectQ6, isCorrectQ7, isCorrectQ8, isCorrectQ9;

    /**
     * Radioboxes controls defined
     */
    public void QOne(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.QOneYes:
                if (checked) {
                    isCorrectQ1 = true;
                    Toast.makeText(MainActivity.this, "Correct",
                            Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.QOneNo:
                if (checked) {
                    isCorrectQ1 = false;
                    RadioGroup questionOneRG = (RadioGroup) findViewById(R.id.QOneGroup);
                    questionOneRG.clearCheck();
                    Toast.makeText(MainActivity.this, "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public void QTwo(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.QTwoYes:
                if (checked) {
                    isCorrectQ2 = false;
                    RadioGroup questionOneRG = (RadioGroup) findViewById(R.id.QTwoGroup);
                    questionOneRG.clearCheck();
                    Toast.makeText(MainActivity.this, "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.QTwoNo:
                if (checked) {
                    isCorrectQ2 = true;
                    Toast.makeText(MainActivity.this, "Correct",
                            Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public void QThree(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.QThreeYes:
                if (checked) {
                    isCorrectQ3 = true;
                    Toast.makeText(MainActivity.this, "Correct",
                            Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.QThreeNo:
                if (checked) {
                    isCorrectQ3 = false;
                    RadioGroup questionOneRG = (RadioGroup) findViewById(R.id.QThreeGroup);
                    questionOneRG.clearCheck();
                    Toast.makeText(MainActivity.this, "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public void QFour(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.QFourYes:
                if (checked) {
                    isCorrectQ4 = false;
                    RadioGroup questionOneRG = (RadioGroup) findViewById(R.id.QFourGroup);
                    questionOneRG.clearCheck();
                    Toast.makeText(MainActivity.this, "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.QFourNo:{
                isCorrectQ4 = true;
                Toast.makeText(MainActivity.this, "Correct",
                        Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public void QFive(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.QFiveYes:
                if (checked) {
                    isCorrectQ5 = true;
                    Toast.makeText(MainActivity.this, "Correct",
                            Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.QFiveNo:
                if (checked) {
                    isCorrectQ5 = false;
                    RadioGroup questionOneRG = (RadioGroup) findViewById(R.id.QFiveGroup);
                    questionOneRG.clearCheck();
                    Toast.makeText(MainActivity.this, "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public void QSix(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.QSixYes:
                if (checked) {
                    isCorrectQ6 = false;
                    RadioGroup questionOneRG = (RadioGroup) findViewById(R.id.QSixGroup);
                    questionOneRG.clearCheck();
                    Toast.makeText(MainActivity.this, "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.QSixNo:
                if (checked) {
                    isCorrectQ6 = true;
                    Toast.makeText(MainActivity.this, "Correct",
                            Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public void QSeven(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.QSevenYes:
                if (checked) {
                    isCorrectQ7 = true;
                    Toast.makeText(MainActivity.this, "Correct",
                            Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.QSevenNo:
                if (checked) {
                    isCorrectQ7 = false;
                    RadioGroup questionOneRG = (RadioGroup) findViewById(R.id.QSevenGroup);
                    questionOneRG.clearCheck();
                    Toast.makeText(MainActivity.this, "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public void QEight (View view) {
        EditText answerEight = (EditText) findViewById(R.id.QuestionEightAnswer);
        String QEightAnswer = answerEight.getText().toString();
        if (QEightAnswer.equals("Continent")) {
            Toast.makeText(MainActivity.this, "Correct",
                    Toast.LENGTH_LONG).show();
            isCorrectQ8 = true;
        }else{                    Toast.makeText(MainActivity.this, "INCORRECT",
                Toast.LENGTH_LONG).show();
            isCorrectQ8 = true;
            answerEight.setText("");}
    }

    public void QNine (View view){
        CheckBox checkboxA = (CheckBox) findViewById(R.id.checkboxA);
        boolean boxA = checkboxA.isChecked();

        CheckBox checkboxB = (CheckBox) findViewById(R.id.checkboxB);
        boolean boxB = checkboxB.isChecked();

        CheckBox checkboxC = (CheckBox) findViewById(R.id.checkboxC);
        boolean boxC = checkboxC.isChecked();

        CheckBox checkboxD = (CheckBox) findViewById(R.id.checkboxD);
        boolean boxD = checkboxD.isChecked();

        if (boxA & boxB & !boxC & !boxD) {Toast.makeText(MainActivity.this, "Correct",
              Toast.LENGTH_LONG).show();
            isCorrectQ9= true;


        } else {
                    Toast.makeText(MainActivity.this, "INCORRECT",
                            Toast.LENGTH_LONG).show();
            isCorrectQ9= false;
            CheckBox answerA = (CheckBox) findViewById(R.id.checkboxA);
            answerA.setChecked(false);
            CheckBox answerB = (CheckBox) findViewById(R.id.checkboxB);
            answerB.setChecked(false);
            CheckBox answerC = (CheckBox) findViewById(R.id.checkboxC);
            answerC.setChecked(false);
            CheckBox answerD = (CheckBox) findViewById(R.id.checkboxD);
            answerD.setChecked(false);
                }

            }

    public void submitScore(View view) {
        String review = createReviewSummary();
        Toast.makeText(MainActivity.this, review,
                Toast.LENGTH_LONG).show();
        /**
         Resetting score and checkboxes
         */
        quantity = 0;
        isCorrectQ1 = false;
        isCorrectQ2 = false;
        isCorrectQ3 = false;
        isCorrectQ4 = false;
        isCorrectQ5 = false;
        isCorrectQ6 = false;
        isCorrectQ7 = false;
        isCorrectQ8 = false;
        isCorrectQ9 = false;

        RadioGroup questionOneRG = (RadioGroup) findViewById(R.id.QOneGroup);
        questionOneRG.clearCheck();
        RadioGroup questionTwoRG = (RadioGroup) findViewById(R.id.QTwoGroup);
        questionTwoRG.clearCheck();
        RadioGroup questionThreeRG = (RadioGroup) findViewById(R.id.QThreeGroup);
        questionThreeRG.clearCheck();
        RadioGroup questionFourRG = (RadioGroup) findViewById(R.id.QFourGroup);
        questionFourRG.clearCheck();
        RadioGroup questionFiveRG = (RadioGroup) findViewById(R.id.QFiveGroup);
        questionFiveRG.clearCheck();
        RadioGroup questionSixRG = (RadioGroup) findViewById(R.id.QSixGroup);
        questionSixRG.clearCheck();
        RadioGroup questionSevenRG = (RadioGroup) findViewById(R.id.QSevenGroup);
        questionSevenRG.clearCheck();
        EditText answerEight = (EditText) findViewById(R.id.QuestionEightAnswer);
        answerEight.setText("");
        CheckBox answerA = (CheckBox) findViewById(R.id.checkboxA);
        answerA.setChecked(false);
        CheckBox answerB = (CheckBox) findViewById(R.id.checkboxB);
        answerB.setChecked(false);
        CheckBox answerC = (CheckBox) findViewById(R.id.checkboxC);
        answerC.setChecked(false);
        CheckBox answerD = (CheckBox) findViewById(R.id.checkboxD);
        answerD.setChecked(false);
    }


    private String createReviewSummary() {
        if(isCorrectQ1){quantity++;}
        if(isCorrectQ2){quantity++;}
        if(isCorrectQ3){quantity++;}
        if(isCorrectQ4){quantity++;}
        if(isCorrectQ5){quantity++;}
        if(isCorrectQ6){quantity++;}
        if(isCorrectQ7){quantity++;}
        if(isCorrectQ8){quantity++;}
        if(isCorrectQ9){quantity++;}
        String review = "Score = " + quantity + "/" + "9";
        return review;
    }

    private String createEmailContent() {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        String email = "I Just completed the Quiz on H's Quizapp \n \nYou should try it out yourself \nfrom " + name;
        return email;
    }

    public void shareEmail(View view) {
        String email = createEmailContent();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Quizapp");
        intent.putExtra(Intent.EXTRA_TEXT, email);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}





