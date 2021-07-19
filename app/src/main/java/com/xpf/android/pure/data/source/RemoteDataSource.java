package com.xpf.android.pure.data.source;

import com.google.gson.Gson;
import com.xpf.android.pure.App;
import com.xpf.android.pure.constant.RequestUrl;
import com.xpf.android.pure.constant.SPKeys;
import com.xpf.android.pure.data.Result;
import com.xpf.android.pure.data.model.PlayListModel;
import com.xpf.android.pure.net.OkHttpHelper;
import com.xpf.android.pure.net.callback.ResultCallback;
import com.xpf.android.pure.utils.LogUtils;
import com.xpf.android.pure.utils.SPUtils;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Class that handles authentication w/ logout credentials and retrieves user information.
 */
public class RemoteDataSource {

    private static final String TAG = "RemoteDataSource";

    public void getPlayList(ResultCallback<PlayListModel> callback) {
        String userId = (String) SPUtils.get(App.getContext(), SPKeys.USER_ID, "");
        String url = RequestUrl.PLAY_LIST + userId;

        OkHttpHelper.getInstance()
                .get(url, new Callback() {
                    @Override
                    public void onFailure(@NotNull Call call, @NotNull IOException e) {
                        LogUtils.e(TAG, "error:" + e.toString());
                        if (callback != null) {
                            callback.onResult(new Result.Error<>(e));
                        }
                    }

                    @Override
                    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                        if (response.isSuccessful()) {
                            String json = response.body().string();
                            LogUtils.d(TAG, "json:" + json);
                            PlayListModel baseModel = new Gson().fromJson(json, PlayListModel.class);
                            if (callback != null) {
                                callback.onResult(new Result.Success<>(baseModel));
                            }
                        }
                    }
                });
    }
}