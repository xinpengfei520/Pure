package com.xpf.android.pure.data.source;

import com.google.gson.Gson;
import com.xpf.android.pure.constant.RequestUrl;
import com.xpf.android.pure.data.Result;
import com.xpf.android.pure.data.model.LoggedInUser;
import com.xpf.android.pure.net.OkHttpHelper;
import com.xpf.android.pure.net.callback.ResultCallback;
import com.xpf.android.pure.utils.LogUtils;
import com.xpf.android.pure.utils.MD5Utils;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    private static final String TAG = "LoginDataSource";

    public void login(String username, String password, ResultCallback<LoggedInUser> callback) {
        String url = RequestUrl.LOGIN + "?phone=" + username + "&md5_password=" + MD5Utils.MD5(password);

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
                            LoggedInUser loggedInUser = new Gson().fromJson(json, LoggedInUser.class);
                            if (callback != null) {
                                callback.onResult(new Result.Success<>(loggedInUser));
                            }
                        }
                    }
                });
    }
}