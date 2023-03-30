package com.example.clppractice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button zero, one, two, three, four, five, six, seven, eight, nine, point, equal, reset, mod, div, mul, plus, minus, back;
    EditText et;
    boolean addition, subtraction, multiplication, division, modulus;
    float valueone, valuetwo, result;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et = findViewById(R.id.edit);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        point = findViewById(R.id.point);
        equal = findViewById(R.id.equal);
        reset = findViewById(R.id.ac);
        mod = findViewById(R.id.mod);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.multiply);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(back);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "9");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+ ".");
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(null);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueone = Float.parseFloat(et.getText().toString());
                addition = true;
                et.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueone = Float.parseFloat(et.getText().toString());
                subtraction = true;
                et.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueone = Float.parseFloat(et.getText().toString());
                multiplication = true;
                et.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueone = Float.parseFloat(et.getText().toString());
                division = true;
                et.setText(null);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueone = Float.parseFloat(et.getText().toString());
                modulus = true;
                et.setText(null);
            }
        });
       /* equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuetwo = Float.parseFloat(et.getText().toString());

                //plus
                if (addition == true) {
                    result = valueone + valuetwo;
                    et.setText(String.valueOf(result));
                    addition = false;
                }
                //minus
                if (subtraction == true) {
                    result = valueone - valuetwo;
                    et.setText(String.valueOf(result));
                    subtraction = false;
                }
                //multiply
                if (multiplication == true) {
                    result = valueone * valuetwo;
                    et.setText(String.valueOf(result));
                    multiplication = false;
                }
                //division
                if (division == true) {
                    result =valueone / valuetwo;
                    et.setText(String.valueOf(result));
                    division = false;
                }
                //modulus
                if (modulus == true) {
                    result = valueone % valuetwo;
                    et.setText(String.valueOf(result));
                    modulus = false;
                }
            }
        }); */
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuetwo = Float.parseFloat(et.getText().toString());

                if (addition == true) {
                    result = valueone + valuetwo;
                    et.setText(String.valueOf(result));
                    addition = false;
                }
                if (subtraction == true) {
                    result = valueone - valuetwo;
                    et.setText(String.valueOf(result));
                    subtraction = false;
                }
                if (multiplication == true) {
                    result = valueone * valuetwo;
                    et.setText(String.valueOf(result));
                    multiplication = false;
                }
                if (division == true) {
                    result = valueone / valuetwo;
                    et.setText(String.valueOf(result));
                    division = false;
                }
                if (modulus == true) {
                    result = valueone % valuetwo;
                    et.setText(String.valueOf(result));
                    modulus = false;
                }
            }
        });
    }
}