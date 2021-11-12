package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailFood extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        ImageView imgFood = findViewById(R.id.imgfood);
        TextView tagFoodNama = findViewById(R.id.tagfoodNama);
        TextView tagFoodDetail = findViewById(R.id.tagfoodDetail);
        TextView tagFoodHarga = findViewById(R.id.tagfoodHarga);

        Food food = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (food != null) {
            Glide.with(this)
                    .load(food.getGambar())
                    .into(imgFood);
            tagFoodNama.setText(food.getNama());
            tagFoodDetail.setText(food.getDetail());
            tagFoodHarga.setText(food.getHarga());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Makanan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}