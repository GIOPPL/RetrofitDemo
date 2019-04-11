package com.gioppl.retrofitdemo.mode2.model;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * create time：2019/4/11 14:23
 * creater：17664
 * desc:
 */
public interface MyApi {
    @GET("v2/movie/top250")
    Observable<DBean> getMovies(@Query("start")int start, @Query("count")int count);
}
