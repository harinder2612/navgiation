package com.example.ec_navgiation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

        if(getResources().getConfiguration().screenWidthDp > 600)
        {
            binding.mainText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "On click works in wide mode", Toast.LENGTH_SHORT).show();
                }
            });
            
            binding.click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Button got clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}