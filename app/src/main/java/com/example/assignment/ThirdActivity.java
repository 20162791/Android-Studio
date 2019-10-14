package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.etResult);
    }

    public void onPlusButtonClicked(View v){
        String tmpEt1 = et1.getText().toString();
        String tmpEt2 = et2.getText().toString();

        int int_et1 = Integer.parseInt(tmpEt1);
        int int_et2 = Integer.parseInt(tmpEt2);

        int result = int_et1 + int_et2;
        String str_result = Integer.toString(result);
        et3.setText(str_result);

    }
    public void onMinusButtonClicked(View v){
        String tmpEt1 = et1.getText().toString();
        String tmpEt2 = et2.getText().toString();

        int int_et1 = Integer.parseInt(tmpEt1);
        int int_et2 = Integer.parseInt(tmpEt2);

        int result = int_et1 - int_et2;
        String str_result = Integer.toString(result);
        et3.setText(str_result);
    }
    public void onMultiButtonClicked(View v){
        String tmpEt1 = et1.getText().toString();
        String tmpEt2 = et2.getText().toString();

        int int_et1 = Integer.parseInt(tmpEt1);
        int int_et2 = Integer.parseInt(tmpEt2);

        int result = int_et1 * int_et2;
        String str_result = Integer.toString(result);
        et3.setText(str_result);
    }
    public void onDivButtonClicked(View v){
        String tmpEt1 = et1.getText().toString();
        String tmpEt2 = et2.getText().toString();

        int int_et1 = Integer.parseInt(tmpEt1);
        int int_et2 = Integer.parseInt(tmpEt2);

        int result = int_et1 / int_et2;
        String str_result = Integer.toString(result);
        et3.setText(str_result);

    }


}
