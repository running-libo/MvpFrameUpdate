package com.example.apple.mvpframe.network;

import com.example.apple.mvpframe.basemvp.basemodel.BaseModel;
import com.example.apple.mvpframe.videobean.VideoBean;
import retrofit2.http.GET;
import rx.Observable;
import static com.example.apple.mvpframe.AppConfig.isDebug;

/**
 * create by libo
 * create on 2018/11/13
 * description Retrofit调用接口方法
 */
public interface ApiService {

    /** *******************************************  IP配置  ******************************************** */

    /** 正式服务器地址 */
    String SERVER_ADDRESS_RELEASE = "";

    /** 测试服务器地址 */
    String SERVER_ADDRESS_DEBUG = "";

    /** 服务器域名 */
    String SERVER_ADDRESS = isDebug ? SERVER_ADDRESS_DEBUG : SERVER_ADDRESS_RELEASE;

    @GET("")
    Observable<BaseModel<VideoBean>> getVideoData();
}
