package com.dariojolo.toolbar.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dariojolo.toolbar.Fragments.FirstFragment;
import com.dariojolo.toolbar.Fragments.SecondFragment;
import com.dariojolo.toolbar.Fragments.ThirdFragment;

/**
 * Created by Dario on 9/4/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{

    private int numberOfTab;
    public PagerAdapter(FragmentManager fm, int numberOfTab){
        super(fm);
        this.numberOfTab = numberOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTab;
    }
}
