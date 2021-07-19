package com.xpf.android.pure.ui.welcome;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.xpf.android.pure.App;
import com.xpf.android.pure.R;
import com.xpf.android.pure.constant.Status;
import com.xpf.android.pure.data.Result;
import com.xpf.android.pure.data.model.LoginStatus;
import com.xpf.android.pure.data.repository.WelcomeRepository;
import com.xpf.android.pure.utils.StorageUtils;

public class WelcomeViewModel extends ViewModel {

    private MutableLiveData<String> loginStatusResult = new MutableLiveData<>();
    private WelcomeRepository welcomeRepository;

    WelcomeViewModel(WelcomeRepository welcomeRepository) {
        this.welcomeRepository = welcomeRepository;
    }

    public MutableLiveData<String> getLoginStatusResult() {
        return loginStatusResult;
    }

    public void getLoginStatus() {
        welcomeRepository.getLoginStatus(result -> {
            if (result instanceof Result.Success) {
                LoginStatus loginStatus = ((Result.Success<LoginStatus>) result).getData();
                LoginStatus.DataBean data = loginStatus.getData();
                Integer code = data.getCode();
                LoginStatus.DataBean.AccountBean account = data.getAccount();
                LoginStatus.DataBean.ProfileBean profile = data.getProfile();

                if (Status.isSuccess(String.valueOf(code))) {

                    if (account != null && profile != null) {
                        String nickname = profile.getNickname();
                        String signature = profile.getSignature();
                        String avatarUrl = profile.getAvatarUrl();
                        Integer userId = account.getId();

                        StorageUtils.updateUserInfo(nickname, signature, avatarUrl, userId);

                        loginStatusResult.postValue(String.valueOf(code));

                    } else {
                        setValueOnFailed(Status.getErrorMsg(String.valueOf(-1)));
                    }
                } else {
                    setValueOnFailed(Status.getErrorMsg(String.valueOf(code)));
                }

            } else {
                Exception error = ((Result.Error<LoginStatus>) result).getError();
                setValueOnFailed(error.toString());
            }
        });
    }

    private void setValueOnFailed(String error) {
        String loginFailed = App.getContext().getString(R.string.login_failed);
        String errorMsg = loginFailed + ":" + error;
        loginStatusResult.postValue(errorMsg);
    }
}