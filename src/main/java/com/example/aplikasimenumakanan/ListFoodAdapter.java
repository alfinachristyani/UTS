package com.example.aplikasimenumakanan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListViewHolder> {
    private ArrayList<Food> listFood;
    private OnItemClickCallback onItemClickCallback;
    public ListFoodAdapter(ArrayList<Food> list) {
        this.listFood = list;
    }
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Food food = listFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(food.getGambar())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tagName.setText(food.getNama());
        //holder.tagDetail.setText(food.getDetail());
        holder.tagHarga.setText(food.getHarga());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listFood.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tagName, tagHarga;
        public ListViewHolder(View view) {
            super(view);
            imgPhoto = view.findViewById(R.id.imageItem);
            tagName = view.findViewById(R.id.nameItem);
            //tagDetail = view.findViewById(R.id.detailItem);
            tagHarga = view.findViewById(R.id.hargaItem);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Food data);
    }
}
