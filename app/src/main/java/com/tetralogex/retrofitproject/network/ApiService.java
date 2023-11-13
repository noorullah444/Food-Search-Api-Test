package com.tetralogex.retrofitproject.network;

import com.tetralogex.retrofitproject.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    /*@GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();*/

    @GET("parser")
    Call<ApiResponse> searchFood(
            @Query("ingr") String ingr,
            @Query("rapidapi-key") String apiKey
    );
}
