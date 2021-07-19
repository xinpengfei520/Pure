package com.xpf.android.pure.utils;

import com.xpf.android.pure.App;
import com.xpf.android.pure.constant.SPKeys;

import java.util.List;

import okhttp3.Headers;
import okhttp3.Response;

/**
 * @author x-sir :)
 * @date 2021/7/19
 */
public class StorageUtils {

    private static final String TAG = "StorageUtils";

    public static void updateUserInfo(String nickname, String signature, String avatarUrl,
                                      Integer userId) {

        SPUtils.put(App.getContext(), SPKeys.NICKNAME, nickname);
        SPUtils.put(App.getContext(), SPKeys.SIGNATURE, signature);
        SPUtils.put(App.getContext(), SPKeys.AVATAR_URL, avatarUrl);
        SPUtils.put(App.getContext(), SPKeys.USER_ID, String.valueOf(userId));
    }

    public static void cachedHeader(Response response) {
        StringBuilder sb = new StringBuilder();
        Headers headers = response.headers();
        int headersLength = headers.size();

        for (int i = 0; i < headersLength; i++) {
            String headerName = headers.name(i);
            String headerValue = headers.get(headerName);
            sb.append(headerName)
                    .append("=")
                    .append(headerValue)
                    .append(";");

            if (i < headersLength - 1) {
                sb.append(" ");
            }
        }

        String headerStr = sb.toString();
        LogUtils.d(TAG, "headerStr:" + headerStr);
        SPUtils.put(App.getContext(), SPKeys.HEADER, headerStr);
    }

    public static void cachedCookie(Response response) {
        StringBuilder sb = new StringBuilder();
        Headers headers = response.headers();
        List<String> cookies = headers.values("Set-Cookie");
        int size = cookies.size();

        for (int i = 0; i < size; i++) {
            String cookie = cookies.get(i);
            sb.append(cookie)
                    .append(";");

            if (i < size - 1) {
                sb.append(" ");
            }
        }

        String cookieStr = sb.toString();
        LogUtils.d(TAG, "cookieStr:" + cookieStr);
        SPUtils.put(App.getContext(), SPKeys.COOKIE, cookieStr);
    }

}
