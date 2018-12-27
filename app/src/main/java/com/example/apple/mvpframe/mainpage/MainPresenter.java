package com.example.apple.mvpframe.mainpage;

import com.example.apple.mvpframe.basemvp.basemodel.BaseModel;
import com.example.apple.mvpframe.basemvp.basepresenter.BasePresenter;
import com.example.apple.mvpframe.network.ApiCallBack;
import com.example.apple.mvpframe.videobean.VideoBean;

/**
 * create by libo
 * create on 2018/12/27
 * description
 */
public class MainPresenter extends BasePresenter<MainView> {

    public MainPresenter(MainView mainView) {
        attachView(mainView);
    }

    public void getVideoData() {
        subscribe(apiService.getVideoData(), new ApiCallBack<BaseModel<VideoBean>>() {
            @Override
            public void onSuccess(BaseModel<VideoBean> videoBeanBaseModel) {
                view.getVideoData(videoBeanBaseModel);
            }
        });
    }
}
