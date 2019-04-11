package com.gioppl.retrofitdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * create time：2019/4/11 11:34
 * creater：17664
 * desc:
 */
public interface ApiManager {
    @GET("v2/movie/top250")
    Call<DBean> getData(@Query("start") String start, @Query("count") String count);
}
