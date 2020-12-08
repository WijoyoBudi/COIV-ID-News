package com.example.cov_idnews.berita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.cov_idnews.R;

public class AddNews extends AppCompatActivity {


    private View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_news);

    button = findViewById(R.id.BCategory);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            PopupMenu menu_Dropdown = new PopupMenu(getApplicationContext(), button);
            menu_Dropdown.getMenuInflater().inflate(R.menu.menu_dropdown, menu_Dropdown.getMenu());
            menu_Dropdown.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    Toast.makeText(getApplicationContext(), "You have clicked" + menuItem.getTitle(), Toast.LENGTH_LONG).show();
                    return true;
                }
            });
            menu_Dropdown.show();
        }
    });
    }

}