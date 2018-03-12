package com.example.darrow.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String str="";
    String str2="";
    String operator; //用來儲存+-*/
    boolean negative=false; //用來判斷負號

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bt0=(Button)findViewById(R.id.btn0);
        final Button bt1=(Button)findViewById(R.id.btn1);
        final Button bt2=(Button)findViewById(R.id.btn2);
        final Button bt3=(Button)findViewById(R.id.btn3);
        final Button bt4=(Button)findViewById(R.id.btn4);
        final Button bt5=(Button)findViewById(R.id.btn5);
        final Button bt6=(Button)findViewById(R.id.btn6);
        final Button bt7=(Button)findViewById(R.id.btn7);
        final Button bt8=(Button)findViewById(R.id.btn8);
        final Button bt9=(Button)findViewById(R.id.btn9);
        final Button btadd=(Button)findViewById(R.id.btnadd);
        final Button btsub=(Button)findViewById(R.id.btnsub);
        final Button btmul=(Button)findViewById(R.id.btnmut);
        final Button btdiv=(Button)findViewById(R.id.btndiv);
        final Button btequ=(Button)findViewById(R.id.btnequ);
        final Button btdot=(Button)findViewById(R.id.btndot);
        final Button btclear=(Button)findViewById(R.id.btnclear);

        final TextView textView=(TextView)findViewById(R.id.textView);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+bt0.getText().toString();
                textView.setText(str);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+bt1.getText().toString();
                textView.setText(str);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+bt2.getText().toString();
                textView.setText(str);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+bt3.getText().toString();
                textView.setText(str);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+bt4.getText().toString();
                textView.setText(str);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+bt5.getText().toString();
                textView.setText(str);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+bt6.getText().toString();
                textView.setText(str);
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+bt7.getText().toString();
                textView.setText(str);
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+bt8.getText().toString();
                textView.setText(str);
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+bt9.getText().toString();
                textView.setText(str);
            }
        });

        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().indexOf(".")<0) { //防止重複輸入小數點
                    str = str + btdot.getText().toString();
                    textView.setText(str);
                }
            }
        });

        btclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str="";
                str2="";
                operator="";
                textView.setText(str);
            }
        });

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator="+";
                str2=str;
                textView.setText(str);
                str="";
            }
        });

        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText()=="") {  //輸入負號
                    str="-";
                    textView.setText(str);
                }
                else {
                    operator = "-";
                    str2 = str;
                    textView.setText(str);
                    str = "";
                }
            }
        });

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator="*";
                str2=str;
                textView.setText(str);
                str="";
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator="/";
                str2=str;
                textView.setText(str);
                str="";
            }
        });

        btequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {
                    if ((str.indexOf(".") > -1) || (str2.indexOf(".") > -1)) { //判斷是否有小數點
                        if (operator == "+")
                            str = String.valueOf(Double.parseDouble(str2) + Double.parseDouble(str));
                            textView.setText(str);
                        if (operator == "-")
                            str = String.valueOf(Double.parseDouble(str2) - Double.parseDouble(str));
                            textView.setText(str);
                        if (operator == "*")
                            str = String.valueOf(Double.parseDouble(str2) * Double.parseDouble(str));
                            textView.setText(str);
                        if (operator == "/")
                            str = String.valueOf(Double.parseDouble(str2) / Double.parseDouble(str));
                            textView.setText(str);
                    }
                    else {
                        if (operator == "+")
                            str = String.valueOf(Integer.parseInt(str2) + Integer.parseInt(str));
                            textView.setText(str);
                        if (operator == "-")
                            str = String.valueOf(Integer.parseInt(str2) - Integer.parseInt(str));
                            textView.setText(str);
                        if (operator == "*")
                            str = String.valueOf(Integer.parseInt(str2) * Integer.parseInt(str));
                            textView.setText(str);
                        if (operator == "/")
                            if (Integer.parseInt(str2) % Integer.parseInt(str) == 0) {
                                str = String.valueOf(Integer.parseInt(str2) / Integer.parseInt(str));
                                textView.setText(str);
                            } else {
                                str = String.valueOf(Double.parseDouble(str2) / Double.parseDouble(str));
                                textView.setText(str);
                            }
                    }
                }
                catch (ArithmeticException e)
                {
                    textView.setText("低能兒別除以0");
                }
                catch (NumberFormatException e2)
                {
                    textView.setText("別亂按智障");
                }
            }
        });



    }
}
