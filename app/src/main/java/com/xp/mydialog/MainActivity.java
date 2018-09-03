package com.xp.mydialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AlertDialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.show_one).setOnClickListener(this);
        findViewById(R.id.show_two).setOnClickListener(this);
        findViewById(R.id.show_title).setOnClickListener(this);
        myDialog = new AlertDialog(this).builder();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.show_one:
                myDialog.setGone().setMsg("仿iOS的弹窗，看看实际效果如何呢，仿iOS的弹窗，仿iOS的弹窗").setNegativeButton("取消",R.color.colorAccent,null).setPositiveButton("确定",R.color.colorAccent,null).show();
                break;
            case R.id.show_two:
                myDialog.setGone().setMsg("仿iOS的弹窗").setPositiveButton("确定",null).show();
                break;
            case R.id.show_title:
                myDialog.setGone().setTitle("提示").setMsg("仿iOS的弹窗").setNegativeButton("取消",null).setPositiveButton("确定",null).show();
                break;
        }
    }
}
