package com.xpf.android.pure.net.callback;

import com.xpf.android.pure.data.Result;

/**
 * @author x-sir :)
 * @date 2021/7/17
 */
public interface ResultCallback<T> {
    void onResult(Result<T> result);
}
