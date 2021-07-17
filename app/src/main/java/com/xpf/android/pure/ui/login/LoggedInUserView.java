package com.xpf.android.pure.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 * 主要用户 UI 界面上元素显示的需要
 */
class LoggedInUserView {
    private String displayName;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String displayName) {
        this.displayName = displayName;
    }

    String getDisplayName() {
        return displayName;
    }
}