package com.xpf.android.pure.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.xpf.android.pure.R;

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
        openActivity(toActivity, parameter, false);
    }

    protected void openActivity(Class<? extends Activity> toActivity, boolean withAnimation) {
        openActivity(toActivity, null, withAnimation);
    }

    protected void openActivity(Class<? extends Activity> toActivity, Bundle parameter, boolean withAnimation) {
        if (mContext != null) {
            Intent intent = new Intent(mContext, toActivity);
            if (parameter != null) {
                intent.putExtras(parameter);
            }
            startActivity(intent);
            if (withAnimation) {
                try {
                    getActivity().overridePendingTransition(R.anim.push_bottom_to_up_in, R.anim.push_up_to_bottom_out);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
