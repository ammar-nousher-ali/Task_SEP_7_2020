package com.example.task_sep_7_2020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Item> list;

    public RecyclerViewAdapter(Context context, ArrayList<Item> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_rv_item,parent,false);
        return new RecyclerViewAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String trendName = list.get(position).getTrendName();
        holder.txtTrend.setText(trendName);
        String trendDesc = list.get(position).getTrendDesc();
        holder.txtDesc.setText(trendDesc);
        int trendImg = list.get(position).getTrendImg();
        holder.imgTrend.setImageResource(trendImg);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtTrend;
        private TextView txtDesc;
        private ImageView imgTrend;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTrend = itemView.findViewById(R.id.txt_trend);
            txtDesc = itemView.findViewById(R.id.txt_trend_description);
            imgTrend = itemView.findViewById(R.id.img_trend);
        }
    }
}
