package com.example.myapplication7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CouseActivity extends AppCompatActivity {
    private String[] data={"Android应用程序开发",
            "移动应用程序测试","高等数学","高职英语","Java程序设计语言","android游戏开发","" +
            "心理健康","体育"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couse);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayAdapter<String > adapter=new ArrayAdapter<String >(
                CouseActivity.this,android.R.layout.simple_list_item_1,data
        );
        ListView listView=findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data=(String) parent.getItemAtPosition(position);
                if("Android应用程序开发".equals(data)){
                    Intent intent = new Intent(CouseActivity.this, ExplainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("text","Android应用程序开发");
                    bundle.putString("text2","Android是一个优秀的开源手机平台。" +
                            "本课程由浅入深地介绍了Android应用程序的开发，内容共分11章，" +
                            "包括Android的简介，开发环境，应用程序、Android生命周期和用户界面，" +
                            "组件通信与广播消息，后台服务，数据存储与访问，" +
                            "位置服务与地图应用，Android NDK开发以及综合实例设计与开发");
                    intent.putExtras(bundle);
                    startActivityForResult(intent, 100);
                }
                else if("移动应用程序测试".equals(data)){
                    Intent intent = new Intent(CouseActivity.this, ExplainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("text","移动应用程序测试");
                    bundle.putString("text2","");
                    intent.putExtras(bundle);
                    startActivityForResult(intent, 100);
                }
                else if("高等数学".equals(data)){
                    Intent intent = new Intent(CouseActivity.this, ExplainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("text","高等数学");
                    bundle.putString("text2","");
                    intent.putExtras(bundle);
                    startActivityForResult(intent, 100);
                }
                else if("高职英语".equals(data)){
                    Intent intent = new Intent(CouseActivity.this, ExplainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("text","高职英语");
                    bundle.putString("text2","");
                    intent.putExtras(bundle);
                    startActivityForResult(intent, 100);
                }

                else if("Java程序设计语言".equals(data)){
                    Intent intent = new Intent(CouseActivity.this, ExplainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("text","Java程序设计语言");
                    bundle.putString("text2","");
                    intent.putExtras(bundle);
                    startActivityForResult(intent, 100);
                }
                else if("android游戏开发".equals(data)){
                    Intent intent = new Intent(CouseActivity.this, ExplainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("text","android游戏开发");
                    bundle.putString("text2","");
                    intent.putExtras(bundle);
                    startActivityForResult(intent, 100);
                }
                else if("心理健康".equals(data)){
                    Intent intent = new Intent(CouseActivity.this, ExplainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("text","心理健康");
                    bundle.putString("text2","");
                    intent.putExtras(bundle);
                    startActivityForResult(intent, 100);
                }
                else if("体育".equals(data)){
                    Intent intent = new Intent(CouseActivity.this, ExplainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("text","体育");
                    bundle.putString("text2","");
                    intent.putExtras(bundle);
                    startActivityForResult(intent, 100);
                }
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp()
    {
        finish();
        return super.onSupportNavigateUp();
    }
    }

