package com.example.rajat.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    FragmentManager fm;
    FragmentTransaction ft;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tablayout);
        final TabLayout.Tab tab1 = tabLayout.newTab();
        tab1.setText("A");
        final TabLayout.Tab tab2 = tabLayout.newTab();
        tab2.setText("B");
        final TabLayout.Tab tab3 = tabLayout.newTab();
        tab3.setText("C");
        tabLayout.addTab(tab1);
        tabLayout.addTab(tab2);
        tabLayout.addTab(tab3);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.content, new fragA());
        ft.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();



        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                fm = getSupportFragmentManager();
                ft = fm.beginTransaction();

                if(tab==tab1){
                    fm = getSupportFragmentManager();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.content, new fragA());
                }
                if(tab==tab2){
                    fm = getSupportFragmentManager();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.content, new fragB());
                }
                if(tab==tab3){
                    fm = getSupportFragmentManager();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.content, new frag3());
                }
                ft.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                fm = getSupportFragmentManager();
                ft = fm.beginTransaction();

                if(tab==tab1){
                    fm = getSupportFragmentManager();
                    ft = fm.beginTransaction();
                    ft.remove(new fragA());
                }
                if(tab==tab2){
                    fm = getSupportFragmentManager();
                    ft = fm.beginTransaction();
                    ft.remove(new fragB());
                }
                if(tab==tab3){
                    fm = getSupportFragmentManager();
                    ft = fm.beginTransaction();
                    ft.remove(new frag3());
                }
                ft.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                fm = getSupportFragmentManager();
                ft = fm.beginTransaction();

                if(tab==tab1){
                    fm = getSupportFragmentManager();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.content, new fragA());
                }
                if(tab==tab2){
                    fm = getSupportFragmentManager();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.content, new fragB());
                }
                if(tab==tab3){
                    fm = getSupportFragmentManager();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.content, new frag3());
                }
                ft.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();

            }
        });


    }
}
