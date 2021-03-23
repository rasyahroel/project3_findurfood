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
import com.syaa.findurdrink.model.SignatureDrink;

import java.util.List;

public class SignatureDrinkAdapter extends RecyclerView.Adapter<SignatureDrinkAdapter.SignatureDrinkViewHolder> {
    Context context;
    List<SignatureDrink> signatureDrinkList;

    public SignatureDrinkAdapter(Context context, List<SignatureDrink> signatureDrinkList) {
        this.context = context;
        this.signatureDrinkList = signatureDrinkList;
    }

    @NonNull
    @Override
    public SignatureDrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.signature_drink_row_item, parent, false);
        return new SignatureDrinkViewHolder(view);

    }

    @Override
    public void onBindViewHolder(SignatureDrinkViewHolder holder, int position) {

        holder.foodImage.setImageResource(signatureDrinkList.get(position).getImageUrl());
        holder.name.setText(signatureDrinkList.get(position).getName());
        holder.price.setText(signatureDrinkList.get(position).getPrice());

        String kategory = "Signature Creme";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("nama",signatureDrinkList.get(position).getName());
                i.putExtra("kategori",kategory);
                i.putExtra("price",signatureDrinkList.get(position).getPrice());
                i.putExtra("images",signatureDrinkList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return signatureDrinkList.size();
    }

    public static final class SignatureDrinkViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;

        public SignatureDrinkViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.food_price);
            name = itemView.findViewById(R.id.food_name);
        }
    }
}
