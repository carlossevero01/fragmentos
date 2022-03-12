package com.example.fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button bt1;
    private Button bt2;
    private Button bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    bt1 = (Button) findViewById(R.id.ex1);
    bt2 = (Button) findViewById(R.id.ex2);
    bt3 = (Button) findViewById(R.id.ex3);
    bt1.setOnClickListener(this);
    bt2.setOnClickListener(this);
    bt3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==bt1.getId()){
            Intent intent = new Intent(this,ex1.class);
            startActivity(intent);
        }
        if(view.getId()==bt2.getId()){
            Intent intent = new Intent(this,ex2.class);
            startActivity(intent);
        }
        if(view.getId()==bt3.getId()){
            Intent intent = new Intent(this,ex3.class);
            startActivity(intent);
        }
    }
}