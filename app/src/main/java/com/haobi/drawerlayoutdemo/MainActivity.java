package com.haobi.drawerlayoutdemo;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private DrawerLayout mDrawerLayout;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DrawerLayout实例
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        //Button实例
        button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //调用DrawerLayour的openDrawer()方法将滑动菜单展示出来
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
}
