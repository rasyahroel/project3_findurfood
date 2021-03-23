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
import com.syaa.findurdrink.model.DoubleshotDrink;
import com.syaa.findurdrink.model.FlavoredDrink;

import java.util.List;

public class DoubleshotDrinkAdapter extends RecyclerView.Adapter<DoubleshotDrinkAdapter.DoubleshotDrinkViewHolder> {
    Context context;
    List<DoubleshotDrink> doubleshotDrinkList;

    public DoubleshotDrinkAdapter(Context context, List<DoubleshotDrink> doubleshotDrinkList) {
        this.context = context;
        this.doubleshotDrinkList = doubleshotDrinkList;
    }

    @NonNull
    @Override
    public DoubleshotDrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.doubleshot_drink_row_item, parent, false);
        return new DoubleshotDrinkViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull DoubleshotDrinkViewHolder holder, int position) {

        holder.foodImage.setImageResource(doubleshotDrinkList.get(position).getImageUrl());
        holder.name.setText(doubleshotDrinkList.get(position).getName());
        holder.price.setText(doubleshotDrinkList.get(position).getPrice());

        String kategory = "Doubleshot - Espresso";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",doubleshotDrinkList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",doubleshotDrinkList.get(position).getPrice());
                i.putExtra("images",doubleshotDrinkList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return doubleshotDrinkList.size();
    }

    public static final class DoubleshotDrinkViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public DoubleshotDrinkViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
