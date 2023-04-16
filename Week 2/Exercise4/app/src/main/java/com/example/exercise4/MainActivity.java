package com.example.exercise4;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button btn_finish;
    public EditText txt_Name,txt_Email,txt_Project;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Name = findViewById(R.id.edtxt_name);
        txt_Email = findViewById(R.id.edtxt_email);
        txt_Project = findViewById(R.id.edtxt_project);

        btn_finish = findViewById(R.id.finish);

        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ContactInformation.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", txt_Name.getText().toString());
                bundle.putString("email", txt_Email.getText().toString());
                bundle.putString("project", txt_Project.getText().toString());

                intent.putExtras(bundle);
                startActivities(new Intent[]{intent});
            }
        });
    }
}