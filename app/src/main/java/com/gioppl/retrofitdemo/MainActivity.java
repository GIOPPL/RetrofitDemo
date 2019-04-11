package com.gioppl.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView tv_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_main=findViewById(R.id.tv_main);
        getLogin();
    }
    /**
     * 登录！
     */
    private  void getLogin() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.douban.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiManager apiService = retrofit.create(ApiManager.class);

        Call<DBean> call = apiService.getData("0", "1");
        call.enqueue(new Callback<DBean>() {
            @Override
            public void onResponse(Call<DBean> call, Response<DBean> response) {
                if (response.isSuccess()) {
                    Log.i("AAAAA",response.body().getTitle());
                    tv_main.setText(response.body().getTitle());
                } else {
                    //直接操作UI 返回的respone被直接解析成你指定的modle
                    Log.i("AAAAA","Failure");
                }
            }

            @Override
            public void onFailure(Call<DBean> call, Throwable t) {
                Log.i("AAAAA","Failure");
                // do onFailure代码
            }
        });
    }
}
