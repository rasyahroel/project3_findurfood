package com.syaa.findurdrink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailsActivity extends AppCompatActivity {
    ImageView iv, food_image;
    TextView txtAmount, food_title, food_name, food_price;
    Button btnTambah, btnOrder;
    String name,price,kategori;
    int image;
    int amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        food_image = findViewById(R.id.food_image);
        food_title = findViewById(R.id.title);
        kategori = getIntent().getStringExtra("kategori");
        food_title.setText(kategori);

        food_name = findViewById(R.id.food_name);
        food_price = findViewById(R.id.food_price);
        name = getIntent().getStringExtra("nama");
        food_name.setText(name);
        price = getIntent().getStringExtra("price");
        image = getIntent().getIntExtra("images",0);
        food_image.setImageResource(image);
        food_price.setText(price);


        iv = (ImageView)findViewById(R.id.imageView2);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(DetailsActivity.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });

        btnOrder = findViewById(R.id.buttonOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "+6282170733653";
                String message = "Hai min, apakah " + food_name + " masih tersedia ?";
                String url = "https://api.whatsapp.com/send?phone=" + number + "&text=" + message;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
//        txtAmount = (TextView)findViewById(R.id.tAmount);
//        txtAmount.setText(amount);
//        btnTambah = (Button)findViewById(R.id.btnTambah);
//        btnTambah.setOnClickListener(v -> {
//            amount += 1;
//            txtAmount.setText(amount);
//
//        });




    }
}