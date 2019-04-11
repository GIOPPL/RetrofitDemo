package com.gioppl.retrofitdemo.mode2.present;

import com.gioppl.retrofitdemo.mode2.model.DBean;
import com.gioppl.retrofitdemo.mode2.model.MoviesModel;
import com.gioppl.retrofitdemo.mode2.view.MoviesView;

/**
 * create time：2019/4/11 14:31
 * creater：17664
 * desc:
 */
public class MoviesPresenter implements MoviesModel.MoviesCallBack{
    private MoviesView view;
    public MoviesPresenter(MoviesView view){
        this.view=view;
        MoviesModel moviesModel=MoviesModel.getInstance();
        moviesModel.initRetrofit(this);
    }

    @Override
    public void onSuccess(DBean bean) {
        view.onSuccess(bean);
    }

    @Override
    public void onFailure(String error) {
        view.onFailure(error);
    }
}
