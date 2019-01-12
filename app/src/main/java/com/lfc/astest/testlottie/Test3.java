package com.lfc.astest.testlottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class Test3 extends AppCompatActivity {

    private LottieAnimationView mAnimationView;
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn1;
    private LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);

        mBtn2 = findViewById(R.id.btn2);
        mBtn3 = findViewById(R.id.btn3);
        mBtn1 = findViewById(R.id.btn1);
        animationView = findViewById(R.id.animation_view2);
        initLottie();


        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 播放动画
                animationView.playAnimation();
            }
        });
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 暂停动画：貌似有点不同
                animationView.cancelAnimation();
            }
        });
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }

    private void initLottie() {
        // 设置json文件
        animationView.setAnimation("Hosts.json");
// 设置是否循环播放
//        animationView.loop(true);

// 停止动画：我感觉两个效果顺序是颠倒的，使用到时候请测试看看吧
        animationView.pauseAnimation();
// 跳转进度（0.0-1.1）
//        animationView.setProgress( float f);
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                // 动画开始调用

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                // 如果设置loop为true，永远不会调用

            }

            @Override
            public void onAnimationCancel(Animator animation) {
                // 动画取消监听，监听的是Cancel方法，可是还是进度条暂停的状态。

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                // 动画重复，第一次播放不是重复，不包含在内，切换动画也一样。

            }
        });
        // 播放的文件更新的时候，也可以理解每一帧都调用，没想到应用场景，反正更一个动画就不停的调用。

        animationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {

            }
        });
    }
}
