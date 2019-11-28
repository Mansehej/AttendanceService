package com.mansehej.intellify.networking;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitService {



    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://services.intellify.in")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public static <S> S cteateService(Class<S> serviceClass) {

        return retrofit.create(serviceClass);
    }

}
