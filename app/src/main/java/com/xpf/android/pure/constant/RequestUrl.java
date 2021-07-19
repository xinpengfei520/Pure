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
    public static final String USER_SUB_COUNT = BASE_URL + "/user/subcount";
    public static final String PLAY_LIST = BASE_URL + "/user/playlist?uid=";
    public static final String PLAY_LIST_DETAIL = BASE_URL + "/playlist/detail?id=";
    public static final String TIMESTAMP = "timestamp=";
}
