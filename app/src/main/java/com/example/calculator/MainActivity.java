package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    Button buttonEquals, buttonClearLast, buttonClear, buttonPlusMinus, buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonDecimalPoint;
    Button buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;
    TextView textViewResult;
    TextView textViewOp;
    String Result, minResult;
    String Set1 = null, Set2 = null;
    String flag, mark, dotFlag1, dotFlag2;

    float s1 = 0, s2 = 0, floatValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);
        textViewOp = findViewById(R.id.textViewOp);
        textViewResult.setText("0");
        Result = "0";
        flag = null;
        mark = null;
        dotFlag1 = null;
        dotFlag2 = null;

        buttonZero = findViewById(R.id.buttonZero);
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);

        buttonEquals = findViewById(R.id.buttonEquals);
        buttonClear = findViewById(R.id.buttonClear);
        buttonClearLast = findViewById(R.id.buttonClearLast);
        buttonDecimalPoint = findViewById(R.id.buttonDecimalPoint);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonPlusMinus = findViewById(R.id.buttonPlusMinus);

        //Numbers
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    textViewOp.setText("");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (!"0".equals(Result)) {
                    Result = Result + "1";
                } else
                    Result = "1";
                textViewResult.setText(Result);
            }

        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    textViewOp.setText("");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (!"0".equals(Result)) {
                    Result = Result + "2";
                } else
                    Result = "2";
                textViewResult.setText(Result);
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    textViewOp.setText("");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (!"0".equals(Result)) {
                    Result = Result + "3";
                } else
                    Result = "3";
                textViewResult.setText(Result);
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    textViewOp.setText("");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (!"0".equals(Result)) {
                    Result = Result + "4";
                } else
                    Result = "4";
                textViewResult.setText(Result);
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    textViewOp.setText("");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (!"0".equals(Result)) {
                    Result = Result + "5";
                } else
                    Result = "5";
                textViewResult.setText(Result);
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    textViewOp.setText("");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (!"0".equals(Result)) {
                    Result = Result + "6";
                } else
                    Result = "6";
                textViewResult.setText(Result);
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    textViewOp.setText("");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (!"0".equals(Result)) {
                    Result = Result + "7";
                } else
                    Result = "7";
                textViewResult.setText(Result);
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    textViewOp.setText("");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (!"0".equals(Result)) {
                    Result = Result + "8";
                } else
                    Result = "8";
                textViewResult.setText(Result);
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    textViewOp.setText("");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (!"0".equals(Result)) {
                    Result = Result + "9";
                } else
                    Result = "9";
                textViewResult.setText(Result);
            }
        });
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    textViewOp.setText("");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (!"0".equals(Result)) {
                    Result = Result + "0";
                } else
                    Result = "0";
                textViewResult.setText(Result);
            }
        });

        //Actions
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = textViewResult.getText().toString();
                minResult = textViewOp.getText().toString();
                if (!"0".equals(Result)) {
                    minResult = minResult + " = " + Result;
                    char checkFirst = minResult.charAt(1);
                    if (checkFirst != '=') {
                        textViewOp.setText(minResult);
                    } else {
                        textViewOp.setText(Result);
                    }
                }
                Result = "0";
                textViewResult.setText(Result);
                flag = null;
                mark = "clear";
                dotFlag1 = null;
                dotFlag2 = null;
            }
        });
        buttonClearLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textViewResult.getText().toString();

                char checkLast = Result.charAt(Result.length() - 1);

                if (checkLast == 'X' || checkLast == '+' || checkLast == '-' || checkLast == '/') {
                    flag = null;
                }
                if (flag == null && checkLast == '.') {
                    mark = "null";
                    dotFlag1 = null;
                }
                if (flag != null && checkLast == '.') {
                    mark = "null";
                    dotFlag2 = null;
                }
                Result = text.substring(0, text.length() - 1);
                textViewResult.setText(Result);
                if (textViewResult.length() == 0) {
                    Result = "0";
                    textViewResult.setText(Result);
                }
            }
        });
        buttonDecimalPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("clear".equals(mark)) {
                    textViewResult.setText("0");
                    mark = null;
                }
                Result = textViewResult.getText().toString();
                if (flag == null && dotFlag1 == null) {
                    dotFlag1 = "Taken";
                    Result = Result + ".";
                }
                if (flag != null && dotFlag2 == null) {
                    dotFlag2 = "Taken";
                    char checkLast = Result.charAt(Result.length() - 1);
                    if (checkLast == 'X' || checkLast == '+' || checkLast == '-' || checkLast == '/') {
                        Result = Result + "0.";
                    } else {
                        Result = Result + ".";
                    }
                }
                textViewResult.setText(Result);
            }
        });


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = textViewResult.getText().toString();
                if (flag == null) {
                    if (!"0".equals(Result)) {
                        flag = "Add";
                        Result = Result + "+";
                        textViewResult.setText(Result);
                    } else
                        Result = "0";
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = textViewResult.getText().toString();
                if (flag == null) {
                    if (!"0".equals(Result)) {
                        flag = "Sub";
                        Result = Result + "-";
                        textViewResult.setText(Result);
                    } else
                        Result = "0";
                }
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = textViewResult.getText().toString();
                if (flag == null) {
                    if (!"0".equals(Result)) {
                        flag = "Mul";
                        Result = Result + "X";
                        textViewResult.setText(Result);
                    } else
                        Result = "0";
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = textViewResult.getText().toString();
                if (flag == null) {
                    if (!"0".equals(Result)) {
                        flag = "Div";
                        Result = Result + "/";
                        textViewResult.setText(Result);
                    } else
                        Result = "0";
                }
            }
        });
        buttonPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mark == null) {
                    Result = textViewResult.getText().toString();
                    if (!"0".equals(Result)) {
                        Result = "-" + Result;
                        mark = "PM";
                    }
                } else if ("PM".equals(mark)) {
                    //Result = Result.rem( Result, "+");
                    Result = Result.replace("-", "");
                    mark = null;
                }
                textViewResult.setText(Result);
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = textViewResult.getText().toString();
                if (!"clear".equals(mark)) {
                    textViewOp.setText(Result);
                }
                if ("Add".equals(flag)) {
                    StringTokenizer tokens = new StringTokenizer(Result, "+");
                    if (tokens.countTokens() < 2) {
                        Result = tokens.nextToken();
                    } else {
                        Set1 = tokens.nextToken();
                        Set2 = tokens.nextToken();
                        s1 = Float.parseFloat(Set1);
                        s2 = Float.parseFloat(Set2);
                        floatValue = s1 + s2;
                        if (floatValue % 1 == 0) {
                            int answer = (int) floatValue;
                            Result = Integer.toString(answer);
                        } else {
                            Result = Float.toString(floatValue);
                        }
                    }
                    textViewResult.setText(Result);
                    flag = null;
                    mark = "clear";
                }
                if ("Sub".equals(flag)) {
                    StringTokenizer tokens = new StringTokenizer(Result, "-");
                    if (tokens.countTokens() < 2) {
                        Result = tokens.nextToken();
                    } else {
                        Set1 = tokens.nextToken();
                        Set2 = tokens.nextToken();
                        s1 = Float.parseFloat(Set1);
                        s2 = Float.parseFloat(Set2);
                        floatValue = s1 - s2;
                        if (floatValue % 1 == 0) {
                            int answer = (int) floatValue;
                            Result = Integer.toString(answer);
                        } else {
                            Result = Float.toString(floatValue);
                        }
                    }
                    textViewResult.setText(Result);
                    flag = null;
                    mark = "clear";
                    dotFlag1 = null;
                    dotFlag2 = null;
                }
                if ("Mul".equals(flag)) {
                    StringTokenizer tokens = new StringTokenizer(Result, "X");
                    if (tokens.countTokens() < 2) {
                        Result = tokens.nextToken();
                    } else {
                        Set1 = tokens.nextToken();
                        Set2 = tokens.nextToken();
                        s1 = Float.parseFloat(Set1);
                        s2 = Float.parseFloat(Set2);
                        floatValue = s1 * s2;
                        if (floatValue % 1 == 0) {
                            int answer = (int) floatValue;
                            Result = Integer.toString(answer);
                        } else {
                            Result = Float.toString(floatValue);
                        }
                    }
                    textViewResult.setText(Result);
                    flag = null;
                    mark = "clear";
                    dotFlag1 = null;
                    dotFlag2 = null;
                }
                if ("Div".equals(flag)) {
                    StringTokenizer tokens = new StringTokenizer(Result, "/");
                    if (tokens.countTokens() < 2) {
                        Result = tokens.nextToken();
                    } else {
                        Set1 = tokens.nextToken();
                        Set2 = tokens.nextToken();
                        s1 = Float.parseFloat(Set1);
                        s2 = Float.parseFloat(Set2);
                        floatValue = s1 / s2;
                        if (floatValue % 1 == 0) {
                            int answer = (int) floatValue;
                            Result = Integer.toString(answer);
                        } else {
                            Result = Float.toString(floatValue);
                        }
                    }
                    textViewResult.setText(Result);
                    flag = null;
                    mark = "clear";
                    dotFlag1 = null;
                    dotFlag2 = null;
                }
            }
        });
    }
}