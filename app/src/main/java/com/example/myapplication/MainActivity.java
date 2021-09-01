package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("cdx", "MainActivity-dispatchTouchEvent--" + getName(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    public String getName(int flag) {
        String name = "";
        if (flag == MotionEvent.ACTION_DOWN) {
            name = "ACTION_DOWN";
        } else if (flag == MotionEvent.ACTION_MOVE) {
            name = "ACTION_MOVE";
        } else if (flag == MotionEvent.ACTION_UP) {
            name = "ACTION_UP";
        }
        return name;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("cdx", "MainActivity-onTouchEvent-" + getName(event.getAction()));
        return super.onTouchEvent(event);
    }
}