package com.example.ec_navgiation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ec_navgiation.databinding.ActivityBottomNavigationBinding;
import com.example.ec_navgiation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.mainText.setText("Hanji hello");
    }
}