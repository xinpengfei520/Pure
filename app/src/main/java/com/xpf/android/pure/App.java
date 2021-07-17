package com.xpf.android.pure;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

/**
 * Pure Application
 *
 * @author x-sir :)
 * @date 2021/7/17
 */
public class App extends Application {

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
