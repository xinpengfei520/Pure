package com.xpf.android.pure.ui.main;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.bumptech.glide.Glide;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.xpf.android.pure.App;
import com.xpf.android.pure.R;
import com.xpf.android.pure.constant.IntentExtra;
import com.xpf.android.pure.constant.SPKeys;
import com.xpf.android.pure.databinding.ActivityMainBinding;
import com.xpf.android.pure.utils.SPUtils;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private DrawerLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        rootLayout = binding.drawerLayout;
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        updateNavUi(navigationView);

        getIntentAndShowAnimation();

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_logout)
                .setDrawerLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    private void updateNavUi(NavigationView navigationView) {
        View headerView = navigationView.getHeaderView(0);
        ImageView ivAvatar = headerView.findViewById(R.id.ivAvatar);
        TextView tvNickname = headerView.findViewById(R.id.tvNickname);
        TextView tvSignature = headerView.findViewById(R.id.tvSignature);

        String nickname = (String) SPUtils.get(App.getContext(), SPKeys.NICKNAME, "");
        String signature = (String) SPUtils.get(App.getContext(), SPKeys.SIGNATURE, "");
        String avatarUrl = (String) SPUtils.get(App.getContext(), SPKeys.AVATAR_URL, "");

        tvNickname.setText(nickname);
        tvSignature.setText(signature);

        if (!TextUtils.isEmpty(avatarUrl)) {
            Glide.with(this).load(avatarUrl).into(ivAvatar);
        }
    }

    private void getIntentAndShowAnimation() {
        Intent intent = getIntent();
        if (intent.hasExtra(IntentExtra.CIRCULAR_REVEAL_X) && intent.hasExtra(IntentExtra.CIRCULAR_REVEAL_Y)) {
            rootLayout.setVisibility(View.INVISIBLE);
            int revealX = intent.getIntExtra(IntentExtra.CIRCULAR_REVEAL_X, 0);
            int revealY = intent.getIntExtra(IntentExtra.CIRCULAR_REVEAL_Y, 0);
            ViewTreeObserver viewTreeObserver = rootLayout.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {
                        revealActivity(revealX, revealY);
                        rootLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
            }
        } else {
            rootLayout.setVisibility(View.VISIBLE);
        }
    }

    protected void revealActivity(int x, int y) {
        float finalRadius = (float) (Math.max(rootLayout.getWidth(), rootLayout.getHeight()) * 1.1);
        // create the animator for this view (the start radius is zero)
        Animator circularReveal = ViewAnimationUtils.createCircularReveal(rootLayout, x, y, 0, finalRadius);
        circularReveal.setDuration(600);
        circularReveal.setInterpolator(new AccelerateInterpolator());
        // make the view visible and start the animation
        rootLayout.setVisibility(View.VISIBLE);
        circularReveal.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}