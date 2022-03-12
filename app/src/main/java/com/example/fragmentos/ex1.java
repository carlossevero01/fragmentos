package com.example.fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class ex1 extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        FragmentManager fm = getSupportFragmentManager();
        fragment1 frag1 = (fragment1) fm.findFragmentById(R.id.frag1);
        //frag1.onCreate(savedInstanceState);
    }
}