package com.example.implementationofdatastructure;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    private StackDataStructure stackDataStructure;
    private LinearLayout linearLayout;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stackDataStructure = new StackDataStructure();
        linearLayout = findViewById(R.id.linear_layout);
        scrollView = findViewById(R.id.scroll_view);
        scrollView.setTextSize(20);

        stackDataStructure.push("Jimmy");
        stackDataStructure.push("Fiona");
        stackDataStructure.push("Phillip");
        stackDataStructure.push("Debbie");
        stackDataStructure.push("Ian");
        stackDataStructure.push("Frank");
        stackDataStructure.push("Monica");
        stackDataStructure.push("Carl");
        stackDataStructure.push("Liam");
        stackDataStructure.push("Veronica");
        stackDataStructure.push("Kevin");
        stackDataStructure.push("Karen");
        stackDataStructure.push("Mandy");
        stackDataStructure.push("Patrick");
        stackDataStructure.push("Kamala");
        stackDataStructure.push("Sheila");
        stackDataStructure.push("Jody");
        stackDataStructure.push("Mickey");
        stackDataStructure.push("Kermit");
        stackDataStructure.push("Amanda");
        stackDataStructure.push("Sierra");

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