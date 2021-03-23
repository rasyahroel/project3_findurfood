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
import com.syaa.findurdrink.model.MilkDrink;

import java.util.List;

public class MilkDrinkAdapter extends RecyclerView.Adapter<MilkDrinkAdapter.MilkDrinkViewHolder> {
    Context context;
    List<MilkDrink> milkDrinkList;

    public MilkDrinkAdapter(Context context, List<MilkDrink> milkDrinkList) {
        this.context = context;
        this.milkDrinkList = milkDrinkList;
    }

    @NonNull
    @Override
    public MilkDrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.milk_drink_row_item, parent, false);
        return new MilkDrinkViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MilkDrinkViewHolder holder, int position) {

        holder.foodImage.setImageResource(milkDrinkList.get(position).getImageUrl());
        holder.name.setText(milkDrinkList.get(position).getName());
        holder.price.setText(milkDrinkList.get(position).getPrice());

        String kategory = "Milk";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",milkDrinkList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",milkDrinkList.get(position).getPrice());
                i.putExtra("images",milkDrinkList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return milkDrinkList.size();
    }

    public static final class MilkDrinkViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public MilkDrinkViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
