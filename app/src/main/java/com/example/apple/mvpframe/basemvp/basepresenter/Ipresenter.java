package com.example.apple.mvpframe.basemvp.basepresenter;

import com.example.apple.mvpframe.basemvp.baseview.IView;
import rx.Observable;
import rx.Subscriber;

/**
 * create by libo
 * create on 2018/11/13
 * description
 */
public interface Ipresenter<V extends IView> {
    /**
     * 关联P与V
     * @param v
     */
    void attachView(V v);

    /**
     * 取消关联P与V
     */
    void detachView();

    /**
     * Rx订阅
     */
    void subscribe(Observable observable, Subscriber subscriber);

    /**
     * Rx取消订阅
     */
    void unSubscribe();
}
