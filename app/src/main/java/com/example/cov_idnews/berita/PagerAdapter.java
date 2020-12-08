package com.example.cov_idnews.berita;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.cov_idnews.berita.FragmentAllNews;
import com.example.cov_idnews.berita.FragmentCase;
import com.example.cov_idnews.berita.FragmentEconomy;
import com.example.cov_idnews.berita.FragmentScience;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int nameFragment;

    public PagerAdapter(@NonNull FragmentManager fm, int nameTab) {
        super(fm);
        nameFragment = nameTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new FragmentAllNews();
            case 1 : return new FragmentCase();
            case 2 : return new FragmentEconomy();
            case 3 : return new FragmentScience();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return nameFragment;
    }
}
