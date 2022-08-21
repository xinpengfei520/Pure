package com.xpf.android.pure.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.xpf.android.pure.R;
import com.xpf.android.pure.adapter.HomeAdapter;
import com.xpf.android.pure.databinding.FragmentHomeBinding;
import com.xpf.android.pure.ui.base.BaseFragment;
import com.xpf.android.pure.ui.play.PlayingActivity;

public class HomeFragment extends BaseFragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    private HomeAdapter mAdapter;
    private ImageView ivPlay;
    private ConstraintLayout playView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final RecyclerView recyclerView = binding.rvList;
        TextView tvSong = binding.tvSong;
        TextView tvSinger = binding.tvSinger;
        ivPlay = binding.ivPlay;
        playView = binding.playView;

        setListener();
        homeViewModel.getPlayListResult().observe(getViewLifecycleOwner(), list -> {
            mAdapter = new HomeAdapter(getContext(), list);
            recyclerView.setAdapter(mAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                    LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(linearLayoutManager);
        });

        return root;
    }

    private boolean isPlaying = false;

    private void setListener() {
        ivPlay.setOnClickListener(v -> {
            if (!isPlaying) {
                ivPlay.setImageResource(R.drawable.icon_music_stop);
            } else {
                ivPlay.setImageResource(R.drawable.icon_music_start);
            }
            isPlaying = !isPlaying;
        });
        playView.setOnClickListener(v -> openActivity(PlayingActivity.class, true));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        homeViewModel.getPlayList();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}