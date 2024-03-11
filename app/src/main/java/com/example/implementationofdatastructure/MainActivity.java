package com.example.implementationofdatastructure;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    private StackDataStructure stackDataStructure;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stackDataStructure = new StackDataStructure();
        linearLayout = findViewById(R.id.linear_layout);

        stackDataStructure.push("Jimmy");
        stackDataStructure.push("Fiona");
        stackDataStructure.push("Phillip");

        displayNames();
    }

    private void displayNames()
    {
        while (!stackDataStructure.isEmpty())
        {
            String name = stackDataStructure.pop();
            TextView textView = new TextView(this);
            textView.setText(name);
            linearLayout.addView(textView);
        }
    }
}