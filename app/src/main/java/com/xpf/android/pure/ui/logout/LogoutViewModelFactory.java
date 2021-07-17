package com.xpf.android.pure.ui.logout;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.xpf.android.pure.data.LogoutDataSource;
import com.xpf.android.pure.data.LogoutRepository;
import com.xpf.android.pure.ui.login.LoginViewModel;

/**
 * ViewModel provider factory to instantiate LogoutViewModel.
 * Required given LogoutViewModel has a non-empty constructor
 */
public class LogoutViewModelFactory implements ViewModelProvider.Factory {

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(LogoutViewModel.class)) {
            return (T) new LogoutViewModel(LogoutRepository.getInstance(new LogoutDataSource()));
        } else {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }
}