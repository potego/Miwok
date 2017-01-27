package com.example.admin.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView)findViewById(R.id.numbers);
        //Set a clicklistener on the numbers view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //An intent for opening the numbers activity
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);//start the new activity

            }

        });

        TextView family = (TextView)findViewById(R.id.family);
        //Set a clicklistener on the family view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //An intent for opening the family activity
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);//start the new activity

            }

        });

        TextView phrases = (TextView)findViewById(R.id.phrases);
        //Set a clicklistener on the phrases view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //An intent for opening the phrases activity
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);//start the new activity

            }

        });

        TextView colors = (TextView)findViewById(R.id.colors);
        //Set a clicklistener on the colors view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //An intent for opening the colors activity
                Intent colorsIntent = new Intent(MainActivity.this, com.example.admin.miwok.ColorsActivity.class);
                startActivity(colorsIntent);//start the new activity

            }

        });
    }
}

