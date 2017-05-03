package com.support.android.designlibdemo.statusbar;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import com.support.android.designlibdemo.R;


/**
 * Created by pucheng on 2017/5/3.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        setStatusBar();
    }

    protected void setStatusBar() {
        StatusBarUtil.setColor(this, getResources().getColor(R.color.colorPrimary));
    }
}
