package com.bkacad.nnt.lab1listviewd02k11;

import android.content.Context;
import android.service.controls.Control;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<Country> data;

    public MyAdapter(Context context, List<Country> data){
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_country, parent, false);
        }
        // Gán view và đổ dữ liẹu vào item view
        Country country = data.get(position);
        TextView tvName = convertView.findViewById(R.id.tv_item_country_name);
        tvName.setText(country.getName());
        TextView tvCapital = convertView.findViewById(R.id.tv_item_country_capital);
        tvCapital.setText(country.getCapital());
        // Hiển thị hình ảnh
        ImageView imgUrl = convertView.findViewById(R.id.img_item_country);
        Picasso.get()
                .load(country.getUrl())
                .placeholder(R.drawable.ic_baseline_downloading_24)
                .error(R.drawable.ic_baseline_error_24)
                .into(imgUrl);

        return convertView;
    }
}
