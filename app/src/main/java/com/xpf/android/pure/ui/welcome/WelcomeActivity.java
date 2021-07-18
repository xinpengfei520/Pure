package com.xpf.android.pure.ui.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;

import com.xpf.android.pure.databinding.ActivityWelcomeBinding;
import com.xpf.android.pure.ui.base.BaseActivity;
import com.xpf.android.pure.ui.login.LoginActivity;
import com.xpf.android.pure.ui.main.MainActivity;

public class WelcomeActivity extends BaseActivity {

    private WelcomeViewModel welcomeViewModel;
    private ActivityWelcomeBinding binding;
    private ConstraintLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        welcomeViewModel = new ViewModelProvider(this, new WelcomeViewModelFactory())
                .get(WelcomeViewModel.class);

        rootLayout = binding.rootLayout;

        welcomeViewModel.getLoginStatusResult().observe(this, s -> {
            Intent intent = null;
            if ("200".equals(s)) {
                intent = new Intent(WelcomeActivity.this, MainActivity.class);
            } else {
                intent = new Intent(WelcomeActivity.this, LoginActivity.class);
            }
            startActivity(intent);
            finish();
        });

        startAnimation();

        // TODO: 2021/7/17 刷新登陆
    }

    private void startAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(2000);

        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
        alphaAnimation.setFillAfter(true);
        scaleAnimation.setDuration(2000);

        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setInterpolator(new DecelerateInterpolator());

        rootLayout.startAnimation(animationSet);

        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                welcomeViewModel.getLoginStatus();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}