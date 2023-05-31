package com.example.exercise_week5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExerciseList extends AppCompatActivity {

    Button btn_ex1;
    Button btn_ex2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);

        btn_ex1 = (Button) findViewById(R.id.btn_ex1);
        btn_ex2 = (Button) findViewById(R.id.btn_ex2);

        btn_ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ex1Intent = new Intent(ExerciseList.this, MainActivity.class);
                startActivity(ex1Intent);
            }
        });

        btn_ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ex2Intent = new Intent(ExerciseList.this, Exercise2.class);
                startActivity(ex2Intent);
            }
        });
    }
}