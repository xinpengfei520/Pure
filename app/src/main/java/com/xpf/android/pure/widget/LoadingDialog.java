package com.xpf.android.pure.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.TextView;

import com.xpf.android.pure.R;
import com.xpf.android.pure.utils.ToastUtils;

public class LoadingDialog extends Dialog {

    private String message = "加载中...";

    public LoadingDialog(Context context) {
        super(context);
    }

    public LoadingDialog(Context context, String message) {
        super(context);
        this.message = message;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_dialog_layout);
        TextView tvMessage = findViewById(R.id.message);
        tvMessage.setText(message);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        layoutParams.dimAmount = 0.2f;
        layoutParams.gravity = Gravity.CENTER;
        getWindow().setAttributes(layoutParams);
        setOnCancelListener(dialog -> {
            ToastUtils.showShort(getContext(), "取消~");
            // TODO: 2021/7/18 取消所有的网络请求
        });
    }
}
