package com.xpf.android.pure.ui.login;

import android.util.Patterns;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.xpf.android.pure.App;
import com.xpf.android.pure.R;
import com.xpf.android.pure.constant.Status;
import com.xpf.android.pure.data.LoginRepository;
import com.xpf.android.pure.data.Result;
import com.xpf.android.pure.data.model.LoggedInUser;

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
                    // setValue(T) 必须在主线程中调用 , 而 postValue(T) 既可以在主线程中调用, 也可以在子线程中调用
                    loginResult.postValue(new LoginResult(new LoggedInUserView(nickname)));
                } else {
                    setValueOnResult(Status.getErrorMsg(String.valueOf(code)));
                }
            } else {
                Exception error = ((Result.Error<LoggedInUser>) result).getError();
                setValueOnResult(error.toString());
            }
        });
    }

    private void setValueOnResult(String error) {
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

    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}