package com.xpf.android.pure.data.repository;

import com.xpf.android.pure.data.model.BaseModel;
import com.xpf.android.pure.data.source.LogoutDataSource;
import com.xpf.android.pure.net.callback.ResultCallback;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class LogoutRepository {

    private static volatile LogoutRepository instance;

    private LogoutDataSource dataSource;

    private LogoutRepository(LogoutDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static LogoutRepository getInstance(LogoutDataSource dataSource) {
        if (instance == null) {
            instance = new LogoutRepository(dataSource);
        }
        return instance;
    }

    public void logout(ResultCallback<BaseModel> callback) {
        dataSource.logout(callback);
    }

}