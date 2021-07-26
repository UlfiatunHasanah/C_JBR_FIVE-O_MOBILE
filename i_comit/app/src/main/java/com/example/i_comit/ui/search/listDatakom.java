package com.example.i_comit.ui.search;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import com.example.i_comit.R;
import com.example.i_comit.ui.search.adapter.KomAdapter;
import com.example.i_comit.ui.search.model.Kom;
import com.example.i_comit.ui.search.model.KomResult;
import com.example.i_comit.ui.search.network.ApiClient;
import com.example.i_comit.ui.search.network.KomService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class listDatakom {
    private EditText mViewProv, mViewKab;
    private android.support.v7.widget.RecyclerView recyclerView;
    private ArrayList<Kom> komArrayList;
    private static String EXTRA = "extra";
    String prov = "";
    String kab = "";
    Button button_search;
    private RecyclerView recyclerView;
    private Object RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_search);

        recyclerView = (RecyclerView) findViewById (R.id.kom_list);

        final EditText editText = (EditText) findViewById (R.id.et_kabkot);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                kab = editText.getText().toString().trim();
                loadSearch(kab);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        loadSearch(kab);
    }

    private void loadSearch(String kab) {
        KomService service = ApiClient.getRetrofit().create(KomService.class);
        Call<KomResult> koms = service.getKom(kab);
        koms.enqueue(new Callback<KomResult>() {
            @Override
            public void onResponse(Call<KomResult> call, Response<KomResult> response) {
                tampilkan(response.body().getResponse());
            }

            @Override
            public void onFailure(Call<KomResult> call, Throwable t) {

            }
        });
    }

    private void tampilkan(List<Kom> response) {
        Context context;
        KomAdapter komadapter = new KomAdapter(context this, R.layout.list_kom, response);
        RecyclerView = (recyclerView) findByItemId (R.id.et_kabkot);
        RecyclerView.setAdapter(komadapter);
        komadapter.notifyDataSetChanged();

    }


}
