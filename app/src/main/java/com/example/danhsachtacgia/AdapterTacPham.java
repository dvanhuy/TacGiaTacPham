package com.example.danhsachtacgia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class AdapterTacPham extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TacPham> itemList;

    public AdapterTacPham(Context context, int layout, List<TacPham> itemList) {
        this.context = context;
        this.layout = layout;
        this.itemList = itemList;
    }
    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        AdapterTacPham.ViewHolder holder;
        if (view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new AdapterTacPham.ViewHolder();
            //ánh xạ view
            holder.txten = view.findViewById(R.id.itemtentacpham);
            holder.ratingBar = view.findViewById(R.id.ratingBartp);

            view.setTag(holder);
        }
        else {
            holder=(AdapterTacPham.ViewHolder) view.getTag();
        }
        TacPham tacPham = itemList.get(i);
        holder.txten.setText(tacPham.getTen());
        holder.ratingBar.setRating(tacPham.getSosao());
        return view;
    }

    private class ViewHolder{
        TextView txten;
        RatingBar ratingBar;
    }
}
