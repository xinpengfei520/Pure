package com.xpf.android.pure.ui.play;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.xpf.android.pure.databinding.ActivityPlayingBinding;
import com.xpf.android.pure.ui.base.BaseActivity;

public class PlayingActivity extends BaseActivity {

    private ActivityPlayingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPlayingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ImageView ivClose = binding.ivClose;
        ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
//                PlayingActivity.this.overridePendingTransition(R.anim.push_up_to_bottom_out,
//                        R.anim.push_bottom_to_up_in);
            }
        });
    }
}