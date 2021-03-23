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
import com.syaa.findurdrink.model.PremiumDrink;

import java.util.List;

public class PremiumDrinkAdapter extends RecyclerView.Adapter<PremiumDrinkAdapter.PremiumDrinkViewHolder> {
    Context context;
    List<PremiumDrink> premiumDrinkList;

    public PremiumDrinkAdapter(Context context, List<PremiumDrink> premiumDrinkList) {
        this.context = context;
        this.premiumDrinkList = premiumDrinkList;
    }

    @NonNull
    @Override
    public PremiumDrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.premium_drink_row_item, parent, false);
        return new PremiumDrinkViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PremiumDrinkViewHolder holder, int position) {

        holder.foodImage.setImageResource(premiumDrinkList.get(position).getImageUrl());
        holder.name.setText(premiumDrinkList.get(position).getName());
        holder.price.setText(premiumDrinkList.get(position).getPrice());

        String kategory = "Coffee - Premium Roast";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",premiumDrinkList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",premiumDrinkList.get(position).getPrice());
                i.putExtra("images",premiumDrinkList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return premiumDrinkList.size();
    }

    public static final class PremiumDrinkViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public PremiumDrinkViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
