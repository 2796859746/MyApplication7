package com.example.myapplication7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ExamActivity extends AppCompatActivity implements View.OnClickListener {
private ImageView etProject,etFix;
private TextView btUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        etProject = findViewById(R.id.project);
        etFix = findViewById(R.id.fix);
        btUsername = findViewById(R.id.username1);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        btUsername.setText(username);

        etProject.setOnClickListener(this);
        etFix.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
switch (view.getId()){
    case R.id.project:
        Intent intent = new Intent(ExamActivity.this, CouseActivity.class);
        startActivity(intent);
        break;
    case R.id.fix:
        finish();
        break;
}

        }
    }


