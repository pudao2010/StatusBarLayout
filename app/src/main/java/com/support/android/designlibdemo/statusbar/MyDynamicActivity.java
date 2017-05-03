package com.support.android.designlibdemo.statusbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.support.android.designlibdemo.R;

/**
 * Created by pucheng on 2017/5/3.
 */

public class MyDynamicActivity extends BaseActivity {

    private AppBarLayout mAppBarLayout;
    private Toolbar mToolbar;
    private View mViewNeedOffset;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dynamic);
        mAppBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void setStatusBar() {
//        StatusBarUtil.setTransparent(this);
        mViewNeedOffset = findViewById(R.id.view_need_offset);
        StatusBarUtil.setTransparentForImageView(this, mViewNeedOffset);
    }
}
