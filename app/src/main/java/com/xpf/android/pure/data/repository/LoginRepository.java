package com.xpf.android.pure.data.repository;

import com.xpf.android.pure.data.Result;
import com.xpf.android.pure.data.model.LoggedInUser;
import com.xpf.android.pure.data.source.LoginDataSource;
import com.xpf.android.pure.net.callback.ResultCallback;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class LoginRepository {

    private static volatile LoginRepository instance;

    private LoginDataSource dataSource;

    // If user credentials will be cached in local storage, it is recommended it be encrypted
    // @see https://developer.android.com/training/articles/keystore
    private LoggedInUser user = null;

    // private constructor : singleton access
    private LoginRepository(LoginDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static LoginRepository getInstance(LoginDataSource dataSource) {
        if (instance == null) {
            instance = new LoginRepository(dataSource);
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    private void setLoggedInUser(LoggedInUser user) {
        this.user = user;
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
    }

    public void login(String username, String password, ResultCallback<LoggedInUser> callback) {
        // handle login
        dataSource.login(username, password, result -> {
            if (result instanceof Result.Success) {
                setLoggedInUser(((Result.Success<LoggedInUser>) result).getData());
            }
            if (callback != null) {
                callback.onResult(result);
            }
        });
    }
}