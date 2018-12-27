package com.example.apple.mvpframe.network;

import com.example.apple.mvpframe.basemvp.basemodel.BaseModel;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * create by libo
 * create on 2018/11/22
 * description 请求接口具体实现类
 */
public class ApiProvider<M extends BaseModel> {
    private static ApiProvider apiProvider;
    private static ApiService apiService;

    private ApiProvider() {
        apiService = ApiManager.getApiService();
    }

    public static ApiProvider getInstance() {
        if (apiProvider == null) {
            apiProvider = new ApiProvider();
        }
        return apiProvider;
    }

    private void request(Observable observable, ApiCallBack<M> apiCallBack) {
        observable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(apiCallBack);
    }

}
