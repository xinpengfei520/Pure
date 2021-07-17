package com.xpf.android.pure.ui.logout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.xpf.android.pure.databinding.FragmentLogoutBinding;

public class LogoutFragment extends Fragment {

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
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}