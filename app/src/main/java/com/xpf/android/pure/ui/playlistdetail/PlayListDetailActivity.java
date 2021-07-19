package com.xpf.android.pure.ui.playlistdetail;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.xpf.android.pure.adapter.PlayListDetailAdapter;
import com.xpf.android.pure.constant.IntentExtra;
import com.xpf.android.pure.databinding.ActivityPlayListDetailBinding;
import com.xpf.android.pure.ui.base.BaseActivity;

public class PlayListDetailActivity extends BaseActivity {

    private ActivityPlayListDetailBinding binding;
    private PlayListDetailViewModel playListDetailViewModel;
    private PlayListDetailAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlayListDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        playListDetailViewModel = new ViewModelProvider(this).get(PlayListDetailViewModel.class);

        final RecyclerView recyclerView = binding.rvList;

        playListDetailViewModel.getPlayListDetailResult().observe(this, list -> {
            mAdapter = new PlayListDetailAdapter(getApplicationContext(), list);
            recyclerView.setAdapter(mAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),
                    LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(linearLayoutManager);
        });

        String id = getIntent().getStringExtra(IntentExtra.PLAY_LIST_ID);
        playListDetailViewModel.getPlayListDetail(id);
    }
}