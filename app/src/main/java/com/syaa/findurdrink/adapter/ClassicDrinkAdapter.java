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

import java.util.List;

public class ClassicDrinkAdapter extends RecyclerView.Adapter<ClassicDrinkAdapter.ClassicDrinkViewHolder> {
    Context context;
    List<ClassicDrink> classicDrinkList;

    public ClassicDrinkAdapter(Context context, List<ClassicDrink> classicDrinkList) {
        this.context = context;
        this.classicDrinkList = classicDrinkList;
    }

    @NonNull
    @Override
    public ClassicDrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.classic_drink_row_item, parent, false);
        return new ClassicDrinkViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ClassicDrinkViewHolder holder, int position) {

        holder.foodImage.setImageResource(classicDrinkList.get(position).getImageUrl());
        holder.name.setText(classicDrinkList.get(position).getName());
        holder.price.setText(classicDrinkList.get(position).getPrice());

        String kategory = "Classic - Kopi Susu";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",classicDrinkList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",classicDrinkList.get(position).getPrice());
                i.putExtra("images",classicDrinkList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return classicDrinkList.size();
    }

    public static final class ClassicDrinkViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public ClassicDrinkViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
