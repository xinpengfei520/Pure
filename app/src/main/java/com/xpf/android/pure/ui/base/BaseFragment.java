package com.xpf.android.pure.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

/**
 * The base fragment
 *
 * @author x-sir :)
 * @date 2021/7/17
 */
public class BaseFragment extends Fragment {

    public Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mContext = null;
    }

    protected void openActivity(Class<? extends Activity> toActivity) {
        openActivity(toActivity, null);
    }

    protected void openActivity(Class<? extends Activity> toActivity, Bundle parameter) {
        if (mContext != null) {
            Intent intent = new Intent(mContext, toActivity);
            if (parameter != null) {
                intent.putExtras(parameter);
            }
            startActivity(intent);
        }
    }

}
