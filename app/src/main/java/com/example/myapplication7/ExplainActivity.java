package com.example.myapplication7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplainActivity extends AppCompatActivity {

    private TextView title,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title=findViewById(R.id.bt_title);
        content=findViewById(R.id.bt_content);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String name  = bundle.getString("text");
            String name2=bundle.getString("text2");
            title.setText(name);
            content.setText(name2);
        }

    }
    @Override
    public boolean onSupportNavigateUp()
    {
        finish();
        return super.onSupportNavigateUp();
    }
}
