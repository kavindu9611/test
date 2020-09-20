package com.example.tutorial_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Create button object
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link java btton with xml button
        button = findViewById(R.id.btnOne);


        //Create intent
        final Intent intent = new Intent(this,MainActivity2.class);
        String name = "Kavindu wickramasinghe";
        int age = 25;

        //intent.putExtra("USER_NAME",name);
        //intent.putExtra("USER_AGE",age);

        Bundle extras = new Bundle();
        extras.putString("USER_NAME",name);
        extras.putInt("USER_AGE",age);

        intent.putExtras(extras);

        //Set listener to the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Launch the activity2
                startActivity(intent);
            }
        });
    }
}