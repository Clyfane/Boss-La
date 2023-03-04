package com.clyfane.clyfanesflashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView questionText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inflate (
        questionText=findViewById(R.id.flashcard_question_textView);

        //ADD ACTION ON TEXTVIEW
        questionText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("Paulina","entered onClick method");
                Toast.makeText(MainActivity.this, "I CLICKED THE QUESTION!", Toast.LENGTH_SHORT).show();

            }
        });



    }
}