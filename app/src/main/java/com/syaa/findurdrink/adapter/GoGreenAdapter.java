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
import com.syaa.findurdrink.model.GoGreen;
import com.syaa.findurdrink.model.MeerFood;

import java.util.List;

public class GoGreenAdapter extends RecyclerView.Adapter<GoGreenAdapter.GoGreenViewHolder> {
    Context context;
    List<GoGreen> goGreenList;

    public GoGreenAdapter(Context context, List<GoGreen> goGreenList) {
        this.context = context;
        this.goGreenList = goGreenList;
    }

    @NonNull
    @Override
    public GoGreenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.go_row_item, parent, false);
        return new GoGreenViewHolder(view);

    }

    @Override
    public void onBindViewHolder(GoGreenViewHolder holder, int position) {

        holder.foodImage.setImageResource(goGreenList.get(position).getImageUrl());
        holder.name.setText(goGreenList.get(position).getName());
        holder.price.setText(goGreenList.get(position).getPrice());

        String kategory = "Go Green";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",goGreenList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",goGreenList.get(position).getPrice());
                i.putExtra("images",goGreenList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return goGreenList.size();
    }

    public static final class GoGreenViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public GoGreenViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
