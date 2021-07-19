package com.xpf.android.pure.data.repository;

import com.xpf.android.pure.data.model.PlayListModel;
import com.xpf.android.pure.data.source.RemoteDataSource;
import com.xpf.android.pure.net.callback.ResultCallback;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class RemoteRepository {

    private static volatile RemoteRepository instance;

    private RemoteDataSource dataSource;

    private RemoteRepository(RemoteDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static RemoteRepository getInstance(RemoteDataSource dataSource) {
        if (instance == null) {
            instance = new RemoteRepository(dataSource);
        }
        return instance;
    }

    public void getPlayList(ResultCallback<PlayListModel> callback) {
        dataSource.getPlayList(callback);
    }

}