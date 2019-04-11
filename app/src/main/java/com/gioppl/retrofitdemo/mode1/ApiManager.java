package com.gioppl.retrofitdemo.mode1;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * create time：2019/4/11 11:34
 * creater：17664
 * desc:
 */
public interface ApiManager {

    /**
     * 来福笑话接口
     *@return List<>
     */
    @GET("xiaohua.json")
    Observable<List<MyJoke>> getData();
}
