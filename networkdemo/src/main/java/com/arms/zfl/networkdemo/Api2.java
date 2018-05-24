package com.arms.zfl.networkdemo;

import com.arms.zfl.networkdemo.dao.ServerResponse;
import com.arms.zfl.networkdemo.dao.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import rx.Observer;

/**
 * Created by ZFL on 2018/5/24
 */

public interface Api2 {
    @GET("order/list.do")
    Call<ServerResponse> getUserInfo();

    @GET("manage/order/detail.do")
//1526536565008
    Call<ServerResponse> getDetail(@Query("orderNo") int num);

    @GET("manage/order/detail.do?order={num}")
//1526536565008
    Call<ServerResponse> getDetail2(@Path("num") int num);


//    @POST("user/login.do")
//    Call<ServerResponse<User>> Login(@Query("username") String username, @Query("password") String password);

    @POST("user/login.do")
    Call<ServerResponse<User>> Login(@Body User user);

    @POST("user/login.do")
    Observable<ServerResponse<User>> LoginWithRxJava(@Body User user);
}
