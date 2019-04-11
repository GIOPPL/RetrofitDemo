package com.gioppl.retrofitdemo.mode1;


import java.util.List;
import java.util.concurrent.TimeUnit;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

class HttpMethods {

    private static final String BASE_URL = "http://api.laifudao.com/open/";
    private static final int TIME_OUT=4;
    private ApiService apiService;

    private HttpMethods() {
        OkHttpClient client=new OkHttpClient();
        client.newBuilder().connectTimeout(TIME_OUT, TimeUnit.SECONDS);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService= retrofit.create(ApiService.class);
    }


    private static class sinalInstance {
         static final HttpMethods instance = new HttpMethods();
    }

      static HttpMethods getInstance(){
        return sinalInstance.instance;
    }

     void getJoke(Observer<List<MyJoke>> observer){

        apiService.getData()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}

