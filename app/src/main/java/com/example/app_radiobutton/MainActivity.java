package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView textView;
    private RadioButton radioButtonAdd, radioButtonSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.et_num1);
        editText2 = (EditText)findViewById(R.id.et_num2);
        textView = (TextView)findViewById(R.id.tv_Result);
        radioButtonAdd = (RadioButton)findViewById(R.id.rb_Addition);
        radioButtonSub = (RadioButton)findViewById(R.id.rb_Subtract);
    }

    public void calculate(View view){
        int result;
        String value1_String = editText1.getText().toString();
        String value2_String = editText2.getText().toString();

        int value1 = Integer.parseInt(value1_String);
        int value2 = Integer.parseInt(value2_String);

        if(radioButtonAdd.isChecked()){
            result = value1 + value2;
        }else{
            result = value1 - value2;
        }

        textView.setText(String.valueOf(result));
    }
}