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
import com.syaa.findurdrink.model.NewDrink;

import java.util.List;

public class NewDrinkAdapter extends RecyclerView.Adapter<NewDrinkAdapter.NewDrinkViewHolder> {
    Context context;
    List<NewDrink> newDrinkList;

    public NewDrinkAdapter(Context context, List<NewDrink> newDrinkList) {
        this.context = context;
        this.newDrinkList = newDrinkList;
    }

    @NonNull
    @Override
    public NewDrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.new_drink_row_item, parent, false);
        return new NewDrinkViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull NewDrinkViewHolder holder, int position) {
            String kategory = "New Product";
        holder.foodImage.setImageResource(newDrinkList.get(position).getImageUrl());
        holder.name.setText(newDrinkList.get(position).getName());
        holder.price.setText(newDrinkList.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",newDrinkList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",newDrinkList.get(position).getPrice());
                i.putExtra("images",newDrinkList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return newDrinkList.size();
    }

    public static final class NewDrinkViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public NewDrinkViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
