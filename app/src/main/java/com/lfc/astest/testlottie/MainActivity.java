package com.lfc.astest.testlottie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTv02;
    private TextView mTv01;
    private TextView mTv03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv02 = findViewById(R.id.tv_02);
        mTv01 = findViewById(R.id.tv_01);
        mTv03 = findViewById(R.id.tv_03);

        mTv01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Test2.class));
            }
        });
        mTv02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Test3.class));
            }
        });
    }
}
