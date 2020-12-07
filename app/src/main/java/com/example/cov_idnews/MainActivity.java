package com.example.cov_idnews;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ui.AppBarConfiguration;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DrawerLayout drawerLayout = findViewById(R.id.DrawerLayoutt);

        findViewById(R.id.ImageNavigation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        NavigationView navigationView = findViewById(R.id.NavigationView);
        navigationView.setItemIconTintList(null);

        AppBarConfiguration mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.LogIn)
                .setDrawerLayout(drawerLayout)
                .build();

        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.terpaparcovid, "Image 1"));
        slideModels.add(new SlideModel(R.drawable.simulasipemilihan, "Image 2"));
        slideModels.add(new SlideModel(R.drawable.vaksin, "Image 3"));
        slideModels.add(new SlideModel(R.drawable.coviddeath, "Image 4"));
        imageSlider.setImageList(slideModels, true);
    }

    public void admin(View view) {
        Intent intent = new Intent(MainActivity.this, login_admin.class);
        startActivity(intent);
    }

    public void news(View view) {
        Intent intent = new Intent(MainActivity.this, NewsTab.class);
        startActivity(intent);
    }

    public void hospital(View view) {
        Intent intent = new Intent(MainActivity.this, HospitalTab.class);
        startActivity(intent);
    }

    public void our_team(View view) {
        Intent intent = new Intent(MainActivity.this, OurTeam.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed () {
        DrawerLayout drawerLayout= (DrawerLayout) findViewById(R.id.DrawerLayoutt);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        if(id == R.id.LogIn){
            startActivity(new Intent(MainActivity.this, login_admin.class));
        }
        DrawerLayout drawerLayout =(DrawerLayout) findViewById(R.id.DrawerLayoutt);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}