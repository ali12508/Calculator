package com.DataFlair.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//
//public class MainActivity extends AppCompatActivity {
//
//    double in1 = 0, i2 = 0;
//    TextView edittext1;
//    boolean Add, Sub, Multiply, Divide, Remainder, deci;
//    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_Add, button_Sub,
//            button_Mul, button_Div, button_Equ, button_Del, button_Dot, button_Remainder;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        button_0 = (Button) findViewById(R.id.b0);
//        button_1 = (Button) findViewById(R.id.b1);
//        button_2 = (Button) findViewById(R.id.b2);
//        button_3 = (Button) findViewById(R.id.b3);
//        button_4 = (Button) findViewById(R.id.b4);
//        button_5 = (Button) findViewById(R.id.b5);
//        button_6 = (Button) findViewById(R.id.b6);
//        button_7 = (Button) findViewById(R.id.b7);
//        button_8 = (Button) findViewById(R.id.b8);
//        button_9 = (Button) findViewById(R.id.b9);
//        button_Dot = (Button) findViewById(R.id.bDot);
//        button_Add = (Button) findViewById(R.id.badd);
//        button_Sub = (Button) findViewById(R.id.bsub);
//        button_Mul = (Button) findViewById(R.id.bmul);
//        button_Div = (Button) findViewById(R.id.biv);
//        button_Remainder = (Button) findViewById(R.id.BRemain);
//        button_Del = (Button) findViewById(R.id.buttonDel);
//        button_Equ = (Button) findViewById(R.id.buttoneql);
//
//        edittext1 = (TextView) findViewById(R.id.display);
//
//        button_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText(edittext1.getText() + "1");
//            }
//        });
//
//        button_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText(edittext1.getText() + "2");
//            }
//        });
//
//        button_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText(edittext1.getText() + "3");
//            }
//        });
//
//        button_4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText(edittext1.getText() + "4");
//            }
//        });
//
//        button_5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText(edittext1.getText() + "5");
//            }
//        });
//
//        button_6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText(edittext1.getText() + "6");
//            }
//        });
//
//        button_7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText(edittext1.getText() + "7");
//            }
//        });
//
//        button_8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText(edittext1.getText() + "8");
//            }
//        });
//
//        button_9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText(edittext1.getText() + "9");
//            }
//        });
//
//        button_0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText(edittext1.getText() + "0");
//            }
//        });
//
//        button_Add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (edittext1.getText().length() != 0) {
//                    in1 = Float.parseFloat(edittext1.getText() + "");
//                    Add = true;
//                    deci = false;
//                    edittext1.setText(null);
//                }
//            }
//        });
//
//        button_Sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (edittext1.getText().length() != 0) {
//                    in1 = Float.parseFloat(edittext1.getText() + "");
//                    Sub = true;
//                    deci = false;
//                    edittext1.setText(null);
//                }
//            }
//        });
//
//        button_Mul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (edittext1.getText().length() != 0) {
//                    in1 = Float.parseFloat(edittext1.getText() + "");
//                    Multiply = true;
//                    deci = false;
//                    edittext1.setText(null);
//                }
//            }
//        });
//
//        button_Div.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (edittext1.getText().length() != 0) {
//                    in1 = Float.parseFloat(edittext1.getText() + "");
//                    Divide = true;
//                    deci = false;
//                    edittext1.setText(null);
//                }
//            }
//        });
//
//        button_Remainder.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (edittext1.getText().length() != 0) {
//                    in1 = Float.parseFloat(edittext1.getText() + "");
//                    Remainder = true;
//                    deci = false;
//                    edittext1.setText(null);
//                }
//            }
//        });
//
//        button_Equ.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (Add || Sub || Multiply || Divide || Remainder) {
//                    i2 = Float.parseFloat(edittext1.getText() + "");
//                }
//
//                if (Add) {
//
//                    edittext1.setText(in1 + i2 + "");
//                    Add = false;
//                }
//
//                if (Sub) {
//
//                    edittext1.setText(in1 - i2 + "");
//                    Sub = false;
//                }
//
//                if (Multiply) {
//                    edittext1.setText(in1 * i2 + "");
//                    Multiply = false;
//                }
//
//                if (Divide) {
//                    edittext1.setText(in1 / i2 + "");
//                    Divide = false;
//                }
//                if (Remainder) {
//                    edittext1.setText(in1 % i2 + "");
//                    Remainder = false;
//                }
//            }
//        });
//
//        button_Del.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edittext1.setText("");
//                in1 = 0.0;
//                i2 = 0.0;
//            }
//        });
//
//        button_Dot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (deci) {
//                    //do nothing or you can show the error
//                } else {
//                    edittext1.setText(edittext1.getText() + ".");
//                    deci = true;
//                }
//
//            }
//        });
//    }
//}




import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Screen;
    private String input="",Answer;
    private boolean clearResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Screen=findViewById(R.id.screen);
    }
    public void ButtonClick(View view){
        Button button= (Button) view;
        String data=button.getText().toString();
        switch (data){
            case "AC":
                input="";
                break;
            case "Ans":
                clearResult=false;
                input+=Answer;
                break;
            case "x":
                clearResult=false;
                Solve();
                input+="*";
                break;
            case "^":
                clearResult=false;
                Solve();
                input+="^";
                break;
            case "=":
                clearResult=true;
                Solve();
                Answer=input;
                break;
            case "⬅":
                if(input.length()>0){
                    clearResult=false;
                    String newText=input.substring(0,input.length()-1);
                    input=newText;
                }
                break;
            default:
                if(input==null){
                    input="";
                }
                if(data.equals("+") || data.equals("-") || data.equals("/")){
                    clearResult=false;
                    Solve();
                }
                else if(clearResult==true){
                    input="";
                    clearResult=false;
                }
                input+=data;
        }
        Screen.setText(input);
    }
    public void Solve(){
        if(input.split("\\*").length==2){
            String numbers[]=input.split("\\*");
            try{
                double mul=Double.parseDouble(numbers[0])*Double.parseDouble(numbers[1]);
                input=mul+"";
            }
            catch (Exception e){
                //Display error
            }
        }
        else if(input.split("/").length==2){
            String numbers[]=input.split("/");
            try{
                double div=Double.parseDouble(numbers[0])/Double.parseDouble(numbers[1]);
                input=div+"";
            }
            catch (Exception e){
                //Display error
            }
        }
        else if(input.split("\\^").length==2){
            String numbers[]=input.split("\\^");
            try{
                double pow=Math.pow(Double.parseDouble(numbers[0]),Double.parseDouble(numbers[1]));
                input=pow+"";
            }
            catch (Exception e){
                //Display error
            }
        }
        else if(input.split("\\+").length==2){
            String numbers[]=input.split("\\+");
            try{
                double sum=Double.parseDouble(numbers[0])+Double.parseDouble(numbers[1]);
                input=sum+"";
            }
            catch (Exception e){
                //Display error
            }
        }
        else if(input.split("\\-").length>1){
            String numbers[]=input.split("\\-");
            if(numbers[0]=="" && numbers.length==2){
                numbers[0]=0+"";
            }
            try{
                double sub=0;
                if(numbers.length==2) {
                    sub = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
                }
                else if(numbers.length==3){
                    sub = -Double.parseDouble(numbers[1]) - Double.parseDouble(numbers[2]);
                }
                input=sub+"";
            }
            catch (Exception e){
                //Display error
            }
        }
        String n[]=input.split("\\.");
        if(n.length>1){
            if(n[1].equals("0")){
                input=n[0];
            }
        }
        Screen.setText(input);
    }
}
