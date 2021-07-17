package com.xpf.android.pure.data.source;

import com.google.gson.Gson;
import com.xpf.android.pure.constant.RequestUrl;
import com.xpf.android.pure.data.Result;
import com.xpf.android.pure.data.model.BaseModel;
import com.xpf.android.pure.net.OkHttpHelper;
import com.xpf.android.pure.net.callback.ResultCallback;
import com.xpf.android.pure.utils.LogUtils;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Class that handles authentication w/ logout credentials and retrieves user information.
 */
public class LogoutDataSource {

    private static final String TAG = "LoginDataSource";

    public void logout(ResultCallback<BaseModel> callback) {
        OkHttpHelper.getInstance()
                .get(RequestUrl.LOGOUT, new Callback() {
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
                            BaseModel baseModel = new Gson().fromJson(json, BaseModel.class);
                            if (callback != null) {
                                callback.onResult(new Result.Success<>(baseModel));
                            }
                        }
                    }
                });
    }
}