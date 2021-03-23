package com.syaa.findurdrink.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.syaa.findurdrink.DetailsActivity;
import com.syaa.findurdrink.R;
import com.syaa.findurdrink.model.ClassicDrink;
import com.syaa.findurdrink.model.TeaDrink;

import java.util.List;

public class TeaDrinkAdapter extends RecyclerView.Adapter<TeaDrinkAdapter.TeaDrinkViewHolder> {
    Context context;
    List<TeaDrink> teaDrinkList;

    public TeaDrinkAdapter(Context context, List<TeaDrink> teaDrinkList) {
        this.context = context;
        this.teaDrinkList = teaDrinkList;
    }

    @NonNull
    @Override
    public TeaDrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.tea_drink_row_item, parent, false);
        return new TeaDrinkViewHolder(view);

    }

    @Override
    public void onBindViewHolder(TeaDrinkViewHolder holder, int position) {

        holder.foodImage.setImageResource(teaDrinkList.get(position).getImageUrl());
        holder.name.setText(teaDrinkList.get(position).getName());
        holder.price.setText(teaDrinkList.get(position).getPrice());

        String kategory = "Tea";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",teaDrinkList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",teaDrinkList.get(position).getPrice());
                i.putExtra("images",teaDrinkList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return teaDrinkList.size();
    }

    public static final class TeaDrinkViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public TeaDrinkViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
