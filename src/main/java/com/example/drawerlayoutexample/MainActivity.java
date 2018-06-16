package com.example.drawerlayoutexample;

import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
NavigationView navigationView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView=(NavigationView)findViewById(R.id.navigation_view);
        //下一行代码作用为使navigation_menu中菜单的图标显示自带的色彩
        navigationView.setItemIconTintList(null);
    }
}
