package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, AC, equal, sqrt, dot, open, close;
    TextView tv1, tv2;
    Double var1, var2, ans;
    Boolean addition = false, subtract = false, multiply = false, divide = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        b0 = findViewById(R.id.btn0);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);
        close = findViewById(R.id.btnClose);
        open = findViewById(R.id.btnOpen);
        AC = findViewById(R.id.btnAC);
        equal = findViewById(R.id.btnEqual);
        sqrt = findViewById(R.id.btnSQRT);
        dot = findViewById(R.id.btnDot);

        tv1 = findViewById(R.id.tvMath);
        tv2 = findViewById(R.id.tvResult);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                addition = true;
            }
        });

        //To subtract
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                subtract = true;
            }
        });

        //To multiply
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                multiply = true;
            }
        });

        //To divide
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                divide = true;
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                ans = Math.sqrt(var1);
                tv2.setText(ans.toString());
                equal.setEnabled(false);
                buttonFalse();
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2 = Double.parseDouble(tv1.getText().toString());
                if(addition){
                    ans = var1 + var2;
                } else if (subtract){
                    ans = var1 - var2;
                } else if (multiply){
                    ans = var1 * var2;
                } else if (divide){
                    ans = var1 / var2;
                } else {
                    ans = ans + 0;
                }

                tv2.setText(ans.toString());
                equal.setEnabled(false);

            }
        });
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
                tv2.setText("");
                equal.setEnabled(true);
                sub.setEnabled(true);
                mul.setEnabled(true);
                div.setEnabled(true);
                add.setEnabled(true);
            }
        });
    }
        public void buttonFalse(){

            sub.setEnabled(false);
            mul.setEnabled(false);
            div.setEnabled(false);
            add.setEnabled(false);
            tv1.setText("");
        }
    public void setVar1(){
        var1 = Double.parseDouble(tv1.getText().toString());
    }


    }
