package com.forzajuve.tool.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.forzajuve.tool.R;


public class MainActivity extends AppCompatActivity {
    //private static final String TAG = ToolApp.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
