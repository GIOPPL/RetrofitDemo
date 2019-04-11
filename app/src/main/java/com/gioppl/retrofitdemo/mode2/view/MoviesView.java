package com.gioppl.retrofitdemo.mode2.view;


import com.gioppl.retrofitdemo.mode2.model.DBean;

/**
 * create time：2019/4/11 14:30
 * creater：17664
 * desc:
 */
public interface MoviesView {
    void onSuccess(DBean bean);
    void onFailure(String error);
}
