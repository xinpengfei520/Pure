package com.xpf.android.pure.constant;

/**
 * @author x-sir :)
 * @date 2021/7/17
 */
public class Status {
    private static final String CODE_SUCCESS = "200";
    private static final String CODE_400 = "400";

    public static boolean isSuccess(String code) {
        return CODE_SUCCESS.equals(code);
    }

    public static String getErrorMsg(String code) {
        String errorMsg = "请求失败";
        switch (code) {
            case CODE_400:
                errorMsg = "用户名或密码错误";
                break;
            default:
                break;
        }

        return errorMsg;
    }
}
