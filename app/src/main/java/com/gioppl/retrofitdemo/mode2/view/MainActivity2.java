package com.gioppl.retrofitdemo.mode2.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.gioppl.retrofitdemo.R;
import com.gioppl.retrofitdemo.mode2.model.DBean;
import com.gioppl.retrofitdemo.mode2.present.MoviesPresenter;


@SuppressLint("Registered")
public class MainActivity2 extends Activity implements MoviesView {
    private TextView tv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_main=findViewById(R.id.tv_main);
    }
    public void getData() {
         new MoviesPresenter(this);
    }

    public void up(View view) {
        getData();
    }


    @Override
    public void onSuccess(DBean bean) {
        tv_main.setText(bean.getTitle());
    }

    @Override
    public void onFailure(String error) {
        tv_main.setText(error);
    }
}
