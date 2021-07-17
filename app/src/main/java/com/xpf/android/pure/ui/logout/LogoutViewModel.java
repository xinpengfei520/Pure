package com.xpf.android.pure.ui.logout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.xpf.android.pure.App;
import com.xpf.android.pure.R;
import com.xpf.android.pure.data.LogoutRepository;
import com.xpf.android.pure.data.Result;
import com.xpf.android.pure.data.model.BaseModel;

public class LogoutViewModel extends ViewModel {

    private final LogoutRepository logoutRepository;
    private MutableLiveData<String> logoutResult = new MutableLiveData<>();

    public LogoutViewModel(LogoutRepository logoutRepository) {
        this.logoutRepository = logoutRepository;
    }

    public LiveData<String> getLogoutResult() {
        return logoutResult;
    }

    public void logout() {
        logoutRepository.logout(result -> {
            if (result instanceof Result.Success) {
                BaseModel data = ((Result.Success<BaseModel>) result).getData();
                if (data.getCode() == 200) {
                    setValueOnResult(R.string.logout_succeed);
                } else {
                    setValueOnResult(R.string.logout_failed);
                }
            } else {
                setValueOnResult(R.string.logout_failed);
            }
        });
    }

    private void setValueOnResult(int resId) {
        String logoutFailed = App.getContext().getString(resId);
        logoutResult.postValue(logoutFailed);
    }
}