package com.mansehej.intellify.networking;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.mansehej.intellify.model.classList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class listCreator {

    private static listCreator listCreator;

    public static listCreator getInstance(){
        if (listCreator == null){
            listCreator = new listCreator();
        }
        return listCreator;
    }

    private CallAPI callAPI;

    public listCreator(){
        callAPI = RetrofitService.cteateService(CallAPI.class);
    }

    public MutableLiveData<classList> getAtt(String sessionCookie, int student_id, String here){
        MutableLiveData<classList> attData = new MutableLiveData<>();
        String err;
        callAPI.getAttList(sessionCookie, student_id, here).enqueue(new Callback<classList>() {
            @Override
            public void onResponse(Call<classList> call,
                                   Response<classList> response) { ;
                if (response.isSuccessful()){
                    if(response.body().toString() ==  "No student exists in Database")
                        Log.d("status", "onResponse() called with: call = [" + call + "], response = [" + response + "]");
                    else
                        attData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<classList> call, Throwable t) {
               t.printStackTrace();
            }
        });
        return attData;
    }
}
