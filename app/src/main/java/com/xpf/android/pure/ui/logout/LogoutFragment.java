package com.xpf.android.pure.ui.logout;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;

import com.xpf.android.pure.databinding.FragmentLogoutBinding;
import com.xpf.android.pure.ui.base.BaseFragment;
import com.xpf.android.pure.ui.login.LoginActivity;

public class LogoutFragment extends BaseFragment {

    private LogoutViewModel logoutViewModel;
    private FragmentLogoutBinding binding;
    private ProgressBar progressBar;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        logoutViewModel =
                new ViewModelProvider(this, new LogoutViewModelFactory()).get(LogoutViewModel.class);

        binding = FragmentLogoutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        progressBar = binding.loading;
        logoutViewModel.getLogoutResult().observe(getViewLifecycleOwner(), this::updateUi);
        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        logoutViewModel.logout();
    }

    private void updateUi(String toast) {
        progressBar.setVisibility(View.GONE);
        Toast.makeText(getContext(), toast, Toast.LENGTH_LONG).show();
        jumpToLoginActivity();
    }

    private void jumpToLoginActivity() {
        openActivity(LoginActivity.class);
        try {
            ((Activity) getContext()).finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}