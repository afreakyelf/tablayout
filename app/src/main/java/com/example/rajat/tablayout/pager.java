package com.example.rajat.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.TableLayout;

public class pager extends FragmentStatePagerAdapter {

    int tabcount;

    public pager(FragmentManager fm , int tabcount) {
        super(fm);
        this.tabcount = tabcount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                fragA a = new fragA();
                return a;
            case 1:
                fragB b = new fragB();
                return b;

            case 2:
                frag3 c = new frag3();
                return c;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
