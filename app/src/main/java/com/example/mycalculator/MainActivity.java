package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, addsub, equal, bs, dot, ce, c;
    TextView tv1;
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
        ce = findViewById(R.id.btnCE);
        bs = findViewById(R.id.btnBS);
        addsub = findViewById(R.id.btnAddSub);
        equal = findViewById(R.id.btnEqual);
        c = findViewById(R.id.btnC);
        dot = findViewById(R.id.btnDot);

        tv1 = findViewById(R.id.tvMath);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("1");
                }else
                tv1.setText(tv1.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("2");
                }else
                tv1.setText(tv1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("3");
                }else
                tv1.setText(tv1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("4");
                }else
                tv1.setText(tv1.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("5");
                }else
                tv1.setText(tv1.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("6");
                }else
                tv1.setText(tv1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("7");
                }else
                tv1.setText(tv1.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("8");
                }else
                tv1.setText(tv1.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("9");
                }else
                tv1.setText(tv1.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("0");
                }else
                tv1.setText(tv1.getText() + "0");
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv1.getText().toString().equals("")) {
                        tv1.setText("0");
                } else {
                    String s = tv1.getText().toString();
                    s = s.substring(0, s.length() - 1);
                    if(tv1.getText().toString().equals("0")){

                    }else
                    tv1.setText(s);
                }
            }
        });
        addsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                var1 = -var1;
                tv1.setText(var1.toString());
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                addition = true;
                tv1.setText("0");
            }
        });

        //To subtract
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                subtract = true;
                tv1.setText("0");
            }
        });

        //To multiply
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                multiply = true;
                tv1.setText("0");
            }
        });

        //To divide
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                divide = true;
                tv1.setText("0");
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("0");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = var1;
                var2 = Double.parseDouble(tv1.getText().toString());
                if(addition){
                    ans = var1 + var2;
                    addition = false;
                } else if (subtract){
                    ans = var1 - var2;
                    subtract = false;
                } else if (multiply){
                    ans = var1 * var2;
                    multiply = false;
                } else if (divide){
                    ans = var1 / var2;
                    divide = false;
                } else {
                    ans = var2;
                }

                tv1.setText(ans.toString());


            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("0");
                equal.setEnabled(true);
                sub.setEnabled(true);
                mul.setEnabled(true);
                div.setEnabled(true);
                add.setEnabled(true);
            }
        });
    }
//        public void buttonFalse(){
//
//            sub.setEnabled(false);
//            mul.setEnabled(false);
//            div.setEnabled(false);
//            add.setEnabled(false);
//            tv1.setText("0");
//        }
    public void setVar1(){
        var1 = Double.parseDouble(tv1.getText().toString());
    }


    }
