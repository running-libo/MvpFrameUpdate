package com.example.apple.mvpframe.mainpage;

import com.example.apple.mvpframe.basemvp.basemodel.BaseModel;
import com.example.apple.mvpframe.basemvp.baseview.IBaseView;
import com.example.apple.mvpframe.videobean.VideoBean;

/**
 * create by libo
 * create on 2018/12/27
 * description
 */
public interface MainView extends IBaseView {

    void getVideoData(BaseModel<VideoBean> videoBeanBaseModel);
}
