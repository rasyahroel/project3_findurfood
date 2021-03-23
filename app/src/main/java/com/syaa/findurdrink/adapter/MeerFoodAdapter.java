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
import com.syaa.findurdrink.model.MeerFood;

import java.util.List;

public class MeerFoodAdapter extends RecyclerView.Adapter<MeerFoodAdapter.MeerFoodViewHolder> {
    Context context;
    List<MeerFood> meerFoodList;

    public MeerFoodAdapter(Context context, List<MeerFood> meerFoodList) {
        this.context = context;
        this.meerFoodList = meerFoodList;
    }

    @NonNull
    @Override
    public MeerFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.meer_row_item, parent, false);
        return new MeerFoodViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MeerFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(meerFoodList.get(position).getImageUrl());
        holder.name.setText(meerFoodList.get(position).getName());
        holder.price.setText(meerFoodList.get(position).getPrice());

        String kategory = "Meer Food";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",meerFoodList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",meerFoodList.get(position).getPrice());
                i.putExtra("images",meerFoodList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return meerFoodList.size();
    }

    public static final class MeerFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public MeerFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
