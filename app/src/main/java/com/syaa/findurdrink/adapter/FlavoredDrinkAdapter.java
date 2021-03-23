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
import com.syaa.findurdrink.model.FlavoredDrink;
import com.syaa.findurdrink.model.NewDrink;

import java.util.List;

public class FlavoredDrinkAdapter extends RecyclerView.Adapter<FlavoredDrinkAdapter.FlavoredDrinkViewHolder> {
    Context context;
    List<FlavoredDrink> flavoredDrinkList;

    public FlavoredDrinkAdapter(Context context, List<FlavoredDrink> flavoredDrinkList) {
        this.context = context;
        this.flavoredDrinkList = flavoredDrinkList;
    }

    @NonNull
    @Override
    public FlavoredDrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.flavored_drink_row_item, parent, false);
        return new FlavoredDrinkViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull FlavoredDrinkViewHolder holder, int position) {

        holder.foodImage.setImageResource(flavoredDrinkList.get(position).getImageUrl());
        holder.name.setText(flavoredDrinkList.get(position).getName());
        holder.price.setText(flavoredDrinkList.get(position).getPrice());

        String kategory = "Flavored - Kopi Susu";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",flavoredDrinkList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",flavoredDrinkList.get(position).getPrice());
                i.putExtra("images",flavoredDrinkList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return flavoredDrinkList.size();
    }

    public static final class FlavoredDrinkViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public FlavoredDrinkViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
