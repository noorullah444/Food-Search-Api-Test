package com.tetralogex.retrofitproject.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://edamam-food-and-grocery-database.p.rapidapi.com/api/food-database/v2/";
    public static final String API_KEY = "e240fffec7msh08c2bab68dd2470p184d72jsn41b7f3e08ca9";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
