package com.arms.zfl.networkdemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ZFL on 2018/5/24
 */

public class CacheDemo {
    public static void main(String[] args) throws IOException {
        int maxCacheSize = 10 * 1024 * 1024;
        Cache cache = new Cache(new File("D:\\我的资源"), maxCacheSize);
        OkHttpClient client = new OkHttpClient.Builder().cache(cache).build();
        Request request = new Request.Builder().url("http://www.qq.com").
//                cacheControl(new CacheControl.Builder().maxStale(365, TimeUnit.DAYS).build()).
//                cacheControl(new CacheControl.Builder().noCache().build()).
        build();

//        Request request = new Request.Builder().url("http://www.imooc.com").build();
        Response response = client.newCall(request).execute();
        String body1 = response.body().string();
        System.out.println("第一次networkResponse: " + response.networkResponse());
        System.out.println("第一次cacheResponse: " + response.cacheResponse());


        Response response1 = client.newCall(request).execute();
        String body2 = response1.body().string();
        System.out.println("第二次networkResponse: " + response1.networkResponse());
        System.out.println("第二次cacheResponse: " + response1.cacheResponse());


    }

}
