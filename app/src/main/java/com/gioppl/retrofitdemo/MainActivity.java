package com.gioppl.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {
    private TextView tv_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_main=findViewById(R.id.tv_main);
        getData();
    }
    public void getData() {


        HttpMethods.getInstance().getJoke(new Observer<List<MyJoke>>() {
            Disposable d;
            @Override
            public void onSubscribe(Disposable d) {
                this.d=d;
            }

            @Override
            public void onNext(List<MyJoke> myJokes) {
                Log.d("MAIN", "获取数据完成" + myJokes.size());
            }

            @Override
            public void onError(Throwable e) {
                Log.d("MAIN", "error" + e.toString());
                d.dispose();
            }

            @Override
            public void onComplete() {
                Log.d("MAIN", "onComplete");
                d.dispose();
            }
        });

    }

    public void up(View view) {
        getData();
    }
}
