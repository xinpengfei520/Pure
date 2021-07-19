package com.xpf.android.pure.net.cookie;

import com.xpf.android.pure.utils.LogUtils;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * The okhttp CookieJarManager
 *
 * @author x-sir :)
 * @date 2021/7/19
 */
public class CookieJarManager implements CookieJar {

    private static final String TAG = "CookieJarManager";
    private static final HashMap<String, List<Cookie>> COOKIE_STORE = new HashMap<>();

    @Override
    public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
        if (cookies.size() <= 0) {
            return;
        }

        COOKIE_STORE.put(url.host(), cookies);
        LogUtils.d(TAG, "url host:" + url.host());

        for (Cookie cookie : cookies) {
            LogUtils.d(TAG, "cookie name:" + cookie.name());
            LogUtils.d(TAG, "cookie value:" + cookie.value());
            LogUtils.d(TAG, "cookie domain:" + cookie.domain());
        }
    }

    @NotNull
    @Override
    public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
        List<Cookie> cookies = COOKIE_STORE.get(url.host());
        LogUtils.d(TAG, "cookies:" + cookies);
        return cookies != null ? cookies : new ArrayList<>();
    }

}
