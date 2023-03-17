package com.example.vk8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numInput1, numInput2;

    private TextView numAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numInput1 = findViewById(R.id.textNumber1);
        numInput2 = findViewById(R.id.textNumber2);

        numAnswer = findViewById(R.id.textAnswer);

    }

    public void add(View view){

        StringBuilder sb1 = new StringBuilder(numInput1.getText());
        StringBuilder sb2 = new StringBuilder(numInput2.getText());
        int i = Integer.parseInt(String.valueOf(sb1));
        int j = Integer.parseInt(String.valueOf(sb2));
        int sum = i + j;
        numAnswer.setText(Integer.toString(sum));

    }

    public void minus(View view){
        StringBuilder sb1 = new StringBuilder(numInput1.getText());
        StringBuilder sb2 = new StringBuilder(numInput2.getText());
        int i = Integer.parseInt(String.valueOf(sb1));
        int j = Integer.parseInt(String.valueOf(sb2));
        int diff = i - j;
        numAnswer.setText(Integer.toString(diff));
    }

    public void multiplication(View view){
        StringBuilder sb1 = new StringBuilder(numInput1.getText());
        StringBuilder sb2 = new StringBuilder(numInput2.getText());
        int i = Integer.parseInt(String.valueOf(sb1));
        int j = Integer.parseInt(String.valueOf(sb2));
        int multi = i * j;
        numAnswer.setText(Integer.toString(multi));
    }

    public void divide(View view){
        StringBuilder sb1 = new StringBuilder(numInput1.getText());
        StringBuilder sb2 = new StringBuilder(numInput2.getText());
        int i = Integer.parseInt(String.valueOf(sb1));
        int j = Integer.parseInt(String.valueOf(sb2));
        int divide = i / j;
        numAnswer.setText(Integer.toString(divide));
    }
}