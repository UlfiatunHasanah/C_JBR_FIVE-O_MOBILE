package com.example.i_comit.ui.search.network;

import com.example.i_comit.ui.search.model.KomResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface KomService {
    @GET("detailpengguna/{id}")
    Call<KomResult> getKom(@Path("nama") String nama);
}
