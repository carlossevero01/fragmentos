package com.example.fragmentos;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ex3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        //tab 1
        ActionBar.Tab tab1 = actionBar.newTab().setText("frag1");
        tab1.setTabListener(new MyTabListener(this,new fragment1()));
        actionBar.addTab(tab1);
        //tab 2
        ActionBar.Tab tab2 = actionBar.newTab().setText("frag2");
        tab2.setTabListener(new MyTabListener(this,new fragment2()));
        actionBar.addTab(tab2);
        //tab 3
        ActionBar.Tab tab3 = actionBar.newTab().setText("frag3");
        tab3.setTabListener(new MyTabListener(this,new fragment3()));
        actionBar.addTab(tab3);

    }
}