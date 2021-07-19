package com.xpf.android.pure.ui.login;

import android.util.Patterns;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.xpf.android.pure.App;
import com.xpf.android.pure.R;
import com.xpf.android.pure.constant.SPKeys;
import com.xpf.android.pure.constant.Status;
import com.xpf.android.pure.data.repository.LoginRepository;
import com.xpf.android.pure.data.Result;
import com.xpf.android.pure.data.model.LoggedInUser;
import com.xpf.android.pure.utils.SPUtils;

public class LoginViewModel extends ViewModel {

    private MutableLiveData<LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<LoginResult> loginResult = new MutableLiveData<>();
    private LoginRepository loginRepository;

    LoginViewModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    LiveData<LoginFormState> getLoginFormState() {
        return loginFormState;
    }

    LiveData<LoginResult> getLoginResult() {
        return loginResult;
    }

    public void login(String username, String password) {
        // can be launched in a separate asynchronous job
        loginRepository.login(username, password, result -> {
            if (result instanceof Result.Success) {
                LoggedInUser data = ((Result.Success<LoggedInUser>) result).getData();
                Integer code = data.getCode();

                if (Status.isSuccess(String.valueOf(code))) {
                    String nickname = data.getProfile().getNickname();
                    String signature = data.getProfile().getSignature();
                    String avatarUrl = data.getProfile().getAvatarUrl();
                    Integer userId = data.getAccount().getId();

                    SPUtils.put(App.getContext(), SPKeys.NICKNAME, nickname);
                    SPUtils.put(App.getContext(), SPKeys.SIGNATURE, signature);
                    SPUtils.put(App.getContext(), SPKeys.AVATAR_URL, avatarUrl);
                    SPUtils.put(App.getContext(), SPKeys.USER_ID, String.valueOf(userId));

                    // setValue(T) 必须在主线程中调用 , 而 postValue(T) 既可以在主线程中调用, 也可以在子线程中调用
                    loginResult.postValue(new LoginResult(new LoggedInUserView(nickname)));
                } else {
                    setValueOnFailed(Status.getErrorMsg(String.valueOf(code)));
                }
            } else {
                Exception error = ((Result.Error<LoggedInUser>) result).getError();
                setValueOnFailed(error.toString());
            }
        });
    }

    private void setValueOnFailed(String error) {
        String loginFailed = App.getContext().getString(R.string.login_failed);
        String errorMsg = loginFailed + error;
        loginResult.postValue(new LoginResult(errorMsg));
    }

    public void loginDataChanged(String username, String password) {
        if (!isUserNameValid(username)) {
            loginFormState.setValue(new LoginFormState(R.string.invalid_username, null));
        } else if (!isPasswordValid(password)) {
            loginFormState.setValue(new LoginFormState(null, R.string.invalid_password));
        } else {
            loginFormState.setValue(new LoginFormState(true));
        }
    }

    /**
     * A placeholder username validation check
     */
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.startsWith("1")) {
            return Patterns.PHONE.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}