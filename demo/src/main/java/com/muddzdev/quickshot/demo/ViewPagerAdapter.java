package com.muddzdev.quickshot.demo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.muddzdev.quickshot.demo.fragments.SurfaceViewFragment;
import com.muddzdev.quickshot.demo.fragments.TextureViewFragment;
import com.muddzdev.quickshot.demo.fragments.ViewFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] titles = {"View", "SurfaceView", "TextureView"};
    private Fragment[] fragments = {new ViewFragment(), new SurfaceViewFragment(), new TextureViewFragment()};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }


}
