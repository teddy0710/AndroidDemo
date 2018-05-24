package com.arms.zfl.networkdemo;


import com.arms.zfl.networkdemo.dao.ServerResponse;
import com.arms.zfl.networkdemo.dao.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;

/**
 * Created by ZFL on 2018/5/24
 */

public class RetrofitRxjavaDemo {

    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        Api2 api = retrofit.create(Api2.class);
        final User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
//        Call<ServerResponse<User>> responseCall = api.Login(user);
////        Call<ServerResponse<User>> responseCall = api.Login("admin", "admin");
//        responseCall.enqueue(new Callback<ServerResponse<User>>() {
//            @Override
//            public void onResponse(Call<ServerResponse<User>> call, Response<ServerResponse<User>> response) {
//                ServerResponse response1 = response.body();
//                if (response1.isSuccess()) {
//                    User user1 = response.body().getData();
//                    System.out.println("成功:" + user1.getUsername());
//                } else {
//                    System.out.println(response1.getStatus() + ":" + response1.getMsg());
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<ServerResponse<User>> call, Throwable t) {
//                System.out.println("fail" + t.toString());
//
//            }
//        });

        api.LoginWithRxJava(user).subscribe(new Subscriber<ServerResponse<User>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(ServerResponse<User> userServerResponse) {
                User user1 = userServerResponse.getData();
                System.out.println(user1.getUsername());
            }
        });

    }
}
