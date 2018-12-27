package com.example.apple.mvpframe.mainpage;

import android.os.Bundle;
import android.widget.TextView;
import com.example.apple.mvpframe.BaseMvpActivity;
import com.example.apple.mvpframe.R;
import com.example.apple.mvpframe.basemvp.basemodel.BaseModel;
import com.example.apple.mvpframe.videobean.VideoBean;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainView{
    private TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvContent = findViewById(R.id.tv_content);
        mPresenter.getVideoData();
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void getVideoData(BaseModel<VideoBean> videoBeanBaseModel) {
        tvContent.setText(videoBeanBaseModel.data.toString());
    }
}
