package com.example.user.lab12bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextWeight, editTextHeight;
    private ImageView imageViewResult;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editTextHeight);

        imageViewResult = (ImageView)findViewById(R.id.imageViewResult);

        textViewResult = (TextView)findViewById(R.id.textViewBMI);
    }
    public void calculateBMI(View view)
    {
        double height, weight, BMI;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());

        BMI = weight / (height * height);
        if(BMI <= 18.5)
        {
            textViewResult.setText("Under Weight");
            imageViewResult.setImageResource(R.drawable.under);
        }
        else if(BMI > 18.5 && BMI < 21)
        {
            textViewResult.setText("Normal");
            imageViewResult.setImageResource(R.drawable.normal);
        }
        else if(BMI >= 21)
        {
            textViewResult.setText("Over Weight");
            imageViewResult.setImageResource(R.drawable.over);
        }
    }
    public void resetInput(View view)
    {
        editTextWeight.setText("");
        editTextHeight.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
        textViewResult.setText("");
    }
}
