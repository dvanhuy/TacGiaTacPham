package com.example.danhsachtacgia;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class AdapterTacGia extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Tacgia> itemList;

    public AdapterTacGia(Context context, int layout, List<Tacgia> itemList) {
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
        ViewHolder holder;
        if (view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            //ánh xạ view
            holder.txten = view.findViewById(R.id.textView2);
            holder.txtmota = view.findViewById(R.id.textView3);
            holder.imageView = view.findViewById(R.id.logoava);
            holder.ratingBar = view.findViewById(R.id.ratingBartg);

            view.setTag(holder);
        }
        else {
            holder=(ViewHolder) view.getTag();
        }
        Tacgia tacgia = itemList.get(i);
        holder.txten.setText(tacgia.getTen());
        holder.txtmota.setText(tacgia.getMota());
        holder.imageView.setImageResource(tacgia.getHinhanh());
        holder.ratingBar.setRating(tacgia.getSosao());
        return view;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView txten,txtmota;
        RatingBar ratingBar;
    }
}
