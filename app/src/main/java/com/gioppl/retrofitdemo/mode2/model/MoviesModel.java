package com.gioppl.retrofitdemo.mode2.model;

import android.util.Log;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * create time：2019/4/11 14:29
 * creater：17664
 * desc:
 */
public class MoviesModel {
    private static final String baseUrl="http://api.douban.com/";
    private static MoviesModel moviesModel;
    private MoviesModel(){}
    public static MoviesModel getInstance(){
        if (moviesModel==null){
            moviesModel=new MoviesModel();
        }
        return moviesModel;
    }
    public void initRetrofit(final MoviesCallBack callBack){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        MyApi myApi = retrofit.create(MyApi.class);
        myApi.getMovies(0,1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(DBean bean) {
                        callBack.onSuccess(bean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(getClass().getName(),"error");
                        callBack.onFailure(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Log.i(getClass().getName(),"complete");
                    }
                });
    }
    public interface MoviesCallBack{
        void onSuccess(DBean bean);
        void onFailure(String error);
    }
}
