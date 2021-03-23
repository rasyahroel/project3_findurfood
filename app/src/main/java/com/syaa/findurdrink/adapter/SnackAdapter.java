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
import com.syaa.findurdrink.model.Snack;

import java.util.List;

public class SnackAdapter extends RecyclerView.Adapter<SnackAdapter.SnackViewHolder> {
    Context context;
    List<Snack> snackList;

    public SnackAdapter(Context context, List<Snack> snackList) {
        this.context = context;
        this.snackList = snackList;
    }

    @NonNull
    @Override
    public SnackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.snack_row_item, parent, false);
        return new SnackViewHolder(view);

    }

    @Override
    public void onBindViewHolder(SnackViewHolder holder, int position) {

        holder.foodImage.setImageResource(snackList.get(position).getImageUrl());
        holder.name.setText(snackList.get(position).getName());
        holder.price.setText(snackList.get(position).getPrice());

        String kategory = "Meer Food - Snack";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",snackList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",snackList.get(position).getPrice());
                i.putExtra("images",snackList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return snackList.size();
    }

    public static final class SnackViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public SnackViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
