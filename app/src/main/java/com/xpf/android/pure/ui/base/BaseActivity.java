package com.xpf.android.pure.ui.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.xpf.android.pure.utils.StatusBarUtils;
import com.xpf.android.pure.widget.LoadingDialog;

public class BaseActivity extends AppCompatActivity {

    private LoadingDialog mLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtils.tint(this);
        mLoading = new LoadingDialog(this);
    }

    protected void showLoading() {
        if (mLoading != null && !mLoading.isShowing()) {
            mLoading.show();
        }
    }

    protected void dismissLoading() {
        if (mLoading != null && mLoading.isShowing()) {
            mLoading.dismiss();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        dismissLoading();
    }

    protected void presentActivity() {
//        presentActivity(null);
    }

//    protected void presentActivity(View view) {
//        Intent intent = new Intent(this, MainActivity.class);
//
//        if (view != null) {
//            ActivityOptionsCompat options = ActivityOptionsCompat.
//                    makeSceneTransitionAnimation(this, view, "transition");
//
//            int revealX = (int) (view.getX() + view.getWidth() / 2);
//            int revealY = (int) (view.getY() + view.getHeight() / 2);
//
//            intent.putExtra(IntentExtra.CIRCULAR_REVEAL_X, revealX);
//            intent.putExtra(IntentExtra.CIRCULAR_REVEAL_Y, revealY);
//
//            ActivityCompat.startActivity(this, intent, options.toBundle());
//        }
//
//        startActivity(intent);
//    }
}