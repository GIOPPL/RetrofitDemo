package com.gioppl.retrofitdemo.mode1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.gioppl.retrofitdemo.R;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

@SuppressLint("Registered")
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
                tv_main.setText(myJokes.get(0).getTitle());
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
