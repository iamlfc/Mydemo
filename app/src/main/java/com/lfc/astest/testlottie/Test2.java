package com.lfc.astest.testlottie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class Test2 extends AppCompatActivity {

    private LottieAnimationView mAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        mAnimationView = findViewById(R.id.animation_view);

    }
}
