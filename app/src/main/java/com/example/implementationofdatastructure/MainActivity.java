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
        stackDataStructure.push("Cody");
        stackDataStructure.push("Arlan");
        stackDataStructure.push("Asta");
        stackDataStructure.push("Acheron");
        stackDataStructure.push("Gallagher");
        stackDataStructure.push("Caelus");
        stackDataStructure.push("Stelle");
        stackDataStructure.push("Robin");
        stackDataStructure.push("Sunday");
        stackDataStructure.push("Sandra");
        stackDataStructure.push("Kawnepa");
        stackDataStructure.push("Oliver");
        stackDataStructure.push("Natasha");
        stackDataStructure.push("Seele");
        stackDataStructure.push("Billy");
        stackDataStructure.push("Lorem");
        stackDataStructure.push("Ipsum");
        stackDataStructure.push("Dolor");
        stackDataStructure.push("Sit");
        stackDataStructure.push("Amet");
        stackDataStructure.push("Julia");
        stackDataStructure.push("Julian");
        stackDataStructure.push("Tazzyronth");
        stackDataStructure.push("Adrien");
        stackDataStructure.push("Polly");
        stackDataStructure.push("Milo");
        stackDataStructure.push("Myla");
        stackDataStructure.push("Jasmine");
        stackDataStructure.push("Jonathan");
        stackDataStructure.push("Shawn");
        stackDataStructure.push("Rico");
        stackDataStructure.push("Dale");
        stackDataStructure.push("Danah");
        stackDataStructure.push("Evan");
        stackDataStructure.push("Janine");
        stackDataStructure.push("Rick");
        stackDataStructure.push("Sandrone");
        stackDataStructure.push("Lucas");
        stackDataStructure.push("John");
        stackDataStructure.push("Faith");
        stackDataStructure.push("Fely");
        stackDataStructure.push("Frank");
        stackDataStructure.push("Samantha");
        stackDataStructure.push("Ester");
        stackDataStructure.push("Bernie");

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