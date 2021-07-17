package com.xpf.android.pure.data.repository;

import com.xpf.android.pure.data.model.LoginStatus;
import com.xpf.android.pure.data.source.WelcomeDataSource;
import com.xpf.android.pure.net.callback.ResultCallback;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class WelcomeRepository {

    private static volatile WelcomeRepository instance;
    private WelcomeDataSource dataSource;

    private WelcomeRepository(WelcomeDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static WelcomeRepository getInstance(WelcomeDataSource dataSource) {
        if (instance == null) {
            instance = new WelcomeRepository(dataSource);
        }
        return instance;
    }

    public void getLoginStatus(ResultCallback<LoginStatus> callback) {
        dataSource.getLoginStatus(result -> {
            if (callback != null) {
                callback.onResult(result);
            }
        });
    }
}