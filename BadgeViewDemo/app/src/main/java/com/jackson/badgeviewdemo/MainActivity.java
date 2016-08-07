package com.jackson.badgeviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView= (TextView) findViewById(R.id.text_view);
        BadgeView badgeView=new BadgeView(this);
        badgeView.setTargetView(textView);
        badgeView.setBadgeCount(60);
        badgeView.setBadgeGravity(Gravity.TOP);

    }
}
