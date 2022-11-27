package ru.beaver.mathtrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ru.beaver.mathtrainer.RandomMode.RandomModeActivity;
import ru.beaver.mathtrainer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.randomMode.setOnClickListener(view -> {
            Intent randomSwitcher = new Intent(this, RandomModeActivity.class);
            startActivity(randomSwitcher);
        });
    }
}