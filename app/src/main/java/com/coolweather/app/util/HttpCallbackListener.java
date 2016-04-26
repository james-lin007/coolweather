package com.coolweather.app.util;

/**
 * Created by lin_yingfeng on 2016/4/26.
 */
public interface HttpCallbackListener{
    void onFinish(String response);
    void onError(Exception e);
}   // 具体实现下放到调用时通过匿名内部类！！

