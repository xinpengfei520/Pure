package com.xpf.android.pure.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

final public class ToastUtils {

    private ToastUtils() {
    }

    public static void showShort(final Context context, final String tip) {
        if (context == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(() ->
                Toast.makeText(context.getApplicationContext(), tip, Toast.LENGTH_SHORT).show()
        );
    }

    public static void showLong(final Context context, final String tip) {
        if (context == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(() ->
                Toast.makeText(context.getApplicationContext(), tip, Toast.LENGTH_LONG).show()
        );
    }

}
