package com.example.kadeem.foodtracker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by kadeem on 5/25/16.
 */
public class CustomFragmentAdapter extends FragmentPagerAdapter {
    private static final int MAX_NUM_TABS = 3;

    public CustomFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ArrayListFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return MAX_NUM_TABS;
    }
}
