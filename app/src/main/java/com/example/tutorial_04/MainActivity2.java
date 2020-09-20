package com.example.tutorial_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button button;
    TextView textUserName,textUserAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button2);
        textUserName = findViewById(R.id.txt1b);
        textUserAge = findViewById(R.id.txtc);


        Intent intent = getIntent();
       // String name = intent.getStringExtra("USER_NAME");
        //int age = intent.getIntExtra("USER_AGE", 0);

        Bundle extras = intent.getExtras();

        String name = extras.getString("USER_NAME");
        int age = extras.getInt("USER_AGE");

        textUserName.setText(name);
        textUserAge.setText(String.valueOf(age));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =  new Intent(getApplication(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}