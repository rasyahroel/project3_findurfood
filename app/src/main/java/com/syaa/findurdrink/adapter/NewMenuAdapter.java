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
import com.syaa.findurdrink.model.NewMenu;

import java.util.List;

public class NewMenuAdapter extends RecyclerView.Adapter<NewMenuAdapter.NewMenuViewHolder> {
    Context context;
    List<NewMenu> newMenuList;

    public NewMenuAdapter(Context context, List<NewMenu> newMenuList) {
        this.context = context;
        this.newMenuList = newMenuList;
    }

    @NonNull
    @Override
    public NewMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.new_drink_row_item, parent, false);
        return new NewMenuViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull NewMenuViewHolder holder, int position) {

        holder.foodImage.setImageResource(newMenuList.get(position).getImageUrl());
        holder.name.setText(newMenuList.get(position).getName());
        holder.price.setText(newMenuList.get(position).getPrice());

        String kategory = "New Menu";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",newMenuList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",newMenuList.get(position).getPrice());
                i.putExtra("images",newMenuList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return newMenuList.size();
    }

    public static final class NewMenuViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public NewMenuViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
