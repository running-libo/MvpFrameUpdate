package com.example.apple.mvpframe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.apple.mvpframe.basemvp.basepresenter.BasePresenter;

/**
 * create by libo
 * create on 2018/11/13
 * description MvpActivity基类
 */
public abstract class BaseMvpActivity<P extends BasePresenter> extends AppCompatActivity {
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mPresenter = createPresenter();
        super.onCreate(savedInstanceState);
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //页面销毁时取消presenter绑定
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}