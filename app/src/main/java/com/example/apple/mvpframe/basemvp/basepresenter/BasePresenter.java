package com.example.apple.mvpframe.basemvp.basepresenter;

import com.example.apple.mvpframe.basemvp.baseview.IBaseView;
import com.example.apple.mvpframe.network.ApiManager;
import com.example.apple.mvpframe.network.ApiService;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * create by libo
 * create on 2018/11/13
 * description presenter基类，绑定observable与subscriber
 */
public class BasePresenter<V extends IBaseView> implements Ipresenter<V> {
    protected V view;
    protected ApiService apiService;
    protected CompositeSubscription mCompositeSubscription;

    @Override
    public void attachView(IBaseView v) {
        this.view = (V) v;
        apiService = ApiManager.getApiService();
    }

    @Override
    public void detachView() {
        this.view = null;
        unSubscribe();
    }

    @Override
    public void subscribe(Observable observable, Subscriber subscriber) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }

        //绑定observable与subscriber
        Subscription subscription = observable.observeOn(AndroidSchedulers.mainThread())
                  .subscribeOn(Schedulers.io())
                  .subscribe(subscriber);

        mCompositeSubscription.add(subscription);
    }

    @Override
    public void unSubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }
}