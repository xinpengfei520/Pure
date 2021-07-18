package com.xpf.android.pure.ui.welcome;

import android.content.Intent;
import android.os.Bundle;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.xpf.android.pure.databinding.ActivityWelcomeBinding;
import com.xpf.android.pure.ui.base.BaseActivity;
import com.xpf.android.pure.ui.login.LoginActivity;

public class WelcomeActivity extends BaseActivity {

    private WelcomeViewModel welcomeViewModel;
    private ActivityWelcomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        welcomeViewModel = new ViewModelProvider(this, new WelcomeViewModelFactory())
                .get(WelcomeViewModel.class);

//        final EditText usernameEditText = binding.username;

        welcomeViewModel.getLoginStatusResult().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Intent intent = null;
//                if ("200".equals(s)) {
//                    intent = new Intent(WelcomeActivity.this, MainActivity.class);
//                } else {
//                    intent = new Intent(WelcomeActivity.this, LoginActivity.class);
//                }
                intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // TODO: 2021/7/17 刷新登陆
    }

    @Override
    protected void onResume() {
        super.onResume();
        welcomeViewModel.getLoginStatus();
    }
}