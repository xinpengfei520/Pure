package com.xpf.android.pure.constant;

import com.xpf.android.pure.BuildConfig;

/**
 * The urls of request from remote server.
 *
 * @author x-sir :)
 * @date 2021/7/17
 */
public class RequestUrl {
    public static final String BASE_URL = BuildConfig.BASE_URL;
    public static final String LOGIN = BASE_URL + "/login/cellphone";
    public static final String LOGOUT = BASE_URL + "/logout";
    public static final String LOGIN_STATUS = BASE_URL + "/login/status";
}
