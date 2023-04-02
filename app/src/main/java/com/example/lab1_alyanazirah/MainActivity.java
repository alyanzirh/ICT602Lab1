package com.example.lab1_alyanazirah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //1st step
    TextView tvMessage;
    Button submitButton, resetButton;
    EditText etName;

    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2nd step
        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);
        resetButton = (Button) findViewById(R.id.resetbtn);
    }

    //3rd step
    public void displayText(View view) {
        String text = etName.getText().toString();
        tvMessage.setText("Welcome " + text);

        //Adding Toast
        Toast toast = Toast.makeText(this, "Welcome " + text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetText(View view) {
        etName.getText().clear();
        tvMessage.setText("Welcome");

        //Adding Toast
        Toast toast = Toast.makeText(this, "Name have been reset", Toast.LENGTH_SHORT);
        toast.show();
    }
}