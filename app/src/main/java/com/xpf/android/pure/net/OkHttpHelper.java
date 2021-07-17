package com.xpf.android.pure.net;

import com.google.gson.Gson;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * The okhttp network request helper class.
 *
 * @author x-sir :)
 * @date 2021/7/17
 */
public class OkHttpHelper {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static volatile OkHttpHelper INSTANCE = null;
    private final OkHttpClient okHttpClient;
    private static final int TIME_OUT = 20;

    private OkHttpHelper() {
        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
                .build();
    }

    public static OkHttpHelper getInstance() {
        if (INSTANCE == null) {
            synchronized (OkHttpHelper.class) {
                if (INSTANCE == null) {
                    INSTANCE = new OkHttpHelper();
                }
            }
        }
        return INSTANCE;
    }

    public void get(String url, Callback callback) {
        Request request = buildRequest(url, null, HttpMethod.GET, false);
        okHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * 对外公开的post方法
     *
     * @param url
     * @param params
     * @param isPostJson
     * @param callback
     */
    public void post(String url, Map<String, Object> params, boolean isPostJson, Callback callback) {
        Request request = buildRequest(url, params, HttpMethod.POST, isPostJson);
        okHttpClient.newCall(request).enqueue(callback);
    }

    public void post(String url, Map<String, Object> params, Callback callback) {
        Request request = buildRequest(url, params, HttpMethod.POST, true);
        okHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * 构建请求对象
     *
     * @param url
     * @param params
     * @param type
     * @return
     */
    private Request buildRequest(String url, Map<String, Object> params, HttpMethod type, boolean isPostJson) {
        Request.Builder builder = new Request.Builder();
        builder.url(url);
        if (type == HttpMethod.GET) {
            builder.get();
        } else if (type == HttpMethod.POST) {
            builder.post(buildRequestBody(params, isPostJson));
        }
        return builder.build();
    }

    /**
     * 通过Map的键值对构建请求对象的body
     *
     * @param params     请求参数
     * @param isPostJson 是否是发送 json 数据
     * @return
     */
    private RequestBody buildRequestBody(Map<String, Object> params, boolean isPostJson) {
        if (isPostJson) {
            String json = new Gson().toJson(params);
            return RequestBody.create(JSON, json);
        } else {
            FormBody.Builder builder = new FormBody.Builder();
            if (params != null) {
                for (Map.Entry<String, Object> entity : params.entrySet()) {
                    builder.add(entity.getKey(), String.valueOf(entity.getValue()));
                }
            }
            return builder.build();
        }
    }

    /**
     * 这个枚举用于指明是哪一种提交方式
     */
    enum HttpMethod {
        /**
         * get
         */
        GET,
        /**
         * post
         */
        POST
    }
}