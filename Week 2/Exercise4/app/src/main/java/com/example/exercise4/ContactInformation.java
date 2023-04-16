package com.example.exercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactInformation extends AppCompatActivity {

    TextView txt_Name;
    TextView txt_Email;
    TextView txt_Project;

    Button btn_Finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_information);

        txt_Name = (TextView) findViewById(R.id.nameKey);
        txt_Email = (TextView) findViewById(R.id.emailKey);
        txt_Project = (TextView) findViewById(R.id.projectKey);

        btn_Finish=(Button) findViewById(R.id.finish);
        btn_Finish.setOnClickListener(ClickOnFinishButton);

        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("name");
        String email=bundle.getString("email");
        String project=bundle.getString("project");

        txt_Name.setText(name);
        txt_Email.setText(email);
        txt_Project.setText(project);
    }

    private View.OnClickListener ClickOnFinishButton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}