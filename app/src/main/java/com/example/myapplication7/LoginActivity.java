package com.example.myapplication7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
private EditText EtUsername;
private EditText EtPassword;
private Button EtLogin,EtExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EtUsername = findViewById(R.id.username);
        EtPassword = findViewById(R.id.password);
        EtLogin = findViewById(R.id.login);
        EtExit = findViewById(R.id.exit);
        EtLogin.setOnClickListener(this);
        EtExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String username = EtUsername.getText().toString();
        String password = EtPassword.getText().toString();
        switch (view.getId()){
            case R.id.login:


                if (username.equals("Bruce")&&password.equals("123456")) {
                    Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, ExamActivity.class);
                    intent.putExtra("username",EtUsername.getText().toString());
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginActivity.this,"账号密码不能为空",Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.exit:
                finish();
        }
    }
}
