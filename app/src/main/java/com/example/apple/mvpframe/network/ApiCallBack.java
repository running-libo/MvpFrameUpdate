package com.example.apple.mvpframe.network;

import com.example.apple.mvpframe.LogUtils;
import com.example.apple.mvpframe.basemvp.basemodel.BaseModel;
import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * create by libo
 * create on 2018/11/13
 * description 自定义请求数据回调和过滤
 */
public abstract class ApiCallBack<M extends BaseModel> extends Subscriber<M> {

    @Override
    public void onCompleted() { }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();

        if (e instanceof HttpException) {
            HttpException httpException = (HttpException) e;
            int code = httpException.code();

            //Http状态码提示
            if (code >=400  && code< 500) {
                LogUtils.e("请求错误");
            } else if (code >= 500) {
                LogUtils.e("服务器错误");
            }
        }
    }

    @Override
    public void onNext(M baseModel) {
        handleStatusCode(baseModel);
    }

    /**
     * 后台statuscode状态码处理，状态码类型封装在StatusCodeEnum中
     * @param baseModel
     */
    private void handleStatusCode(M baseModel) {
        String statusCode = baseModel.code;
        StatusCodeEnum statusCodeEnum = StatusCodeEnum.getByCode(statusCode);
        switch (statusCodeEnum) {
            case RESULT_OK:  //请求成功
                onSuccess(baseModel);
                break;
            case RESULT_TOKENINVALID:  //token失效
                // TODO: 2018/11/23 token失效，删除本地用户信息储存并退出登录
                break;
            default:
                LogUtils.e("请求失败错误");
                break;
        }
    }

    /**
     * onSuccess回调的数据为程序具体需要的业务状态码，具体数据等
     */
    public abstract void onSuccess(M m);
}