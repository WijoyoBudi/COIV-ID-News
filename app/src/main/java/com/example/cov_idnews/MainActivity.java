package com.example.cov_idnews;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.terpaparcovid, "Image 1"));
        slideModels.add(new SlideModel(R.drawable.simulasipemilihan, "Image 2"));
        slideModels.add(new SlideModel(R.drawable.vaksin, "Image 3"));
        slideModels.add(new SlideModel(R.drawable.coviddeath, "Image 4"));
        imageSlider.setImageList(slideModels,true);
    }

    public void admin(View view) {
        Intent intent = new Intent(MainActivity.this, login_admin.class);
        startActivity(intent);
    }

    public void news(View view) {
        Intent intent = new Intent(MainActivity.this, NewsTab.class);
        startActivity(intent);
    }
}