package com.example.cov_idnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cov_idnews.rumahsakit.CreateActivity;

public class halaman_admin extends AppCompatActivity {

    Button Logout;
    private ImageView AddHospital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_admin);


        Logout = (Button) findViewById(R.id.btnExit);

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                Toast.makeText(halaman_admin.this, "Logout Berhasil", Toast.LENGTH_SHORT).show();

            }
        });

//        AddHospital = (ImageView) findViewById(R.id.AddHospital);
//        AddHospital.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (v.getId() == R.id.AddHospital) {
//                    Intent intent = new Intent(halaman_admin.this, CreateActivity.class);
//                    startActivity(intent);
//                }
//            }
//        });
//
    }


    public void TambahBerita(View view) {
        Intent intent = new Intent(halaman_admin.this, AddNews.class);
        startActivity(intent);
    }

    public void TambahRumahSakit(View view) {
        Intent intent = new Intent(halaman_admin.this, CreateActivity.class);
        startActivity(intent);
    }
}
