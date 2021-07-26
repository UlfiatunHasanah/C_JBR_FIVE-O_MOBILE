package com.example.i_comit.ui.search.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.i_comit.R;
import com.example.i_comit.ui.search.model.Kom;
import com.squareup.picasso.Picasso;

import java.util.List;

public class KomAdapter extends ArrayAdapter<Kom> {

    public KomAdapter(@NonNull Context context, int resource, @NonNull List<Kom> objects){
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        if(convertView== null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_row_kom, parent, false
            );
        }

        Kom search =getItem(position);

        TextView tvKom = (TextView) convertView.findViewById(R.id.tv_name_kom);
        tvKom.setText(search.getConame());

        TextView tvNama = (TextView) convertView.findViewById(R.id.tv_name);
        tvNama.setText(search.getNama());
        TextView tvProv = (TextView) convertView.findViewById(R.id.tv_prov);
        tvProv.setText(search.getProv());
        TextView tvKab = (TextView) convertView.findViewById(R.id.tv_kab;
        tvKab.setText(search.getKab());

        ImageView imageView = (imageView) convertView.findViewById(R.id.gambar_logo);
        Picasso.with(convertView.getContext())
                .load("https://wsjti.id/icomit/public/api/"+search.getLogo())
                .resize(200,200)
                .centerCrop()
                .into(imageView);
        return convertView;

    }
}
