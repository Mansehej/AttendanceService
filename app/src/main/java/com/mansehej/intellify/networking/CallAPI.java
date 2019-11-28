package com.mansehej.intellify.networking;

import com.mansehej.intellify.model.classList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface CallAPI {
    @GET("/api/attendance")
    Call<classList> getAttList(@Header("Cookie") String sessionCookie, @Query("student_id") int student_id,
                               @Query("for") String here);
}
