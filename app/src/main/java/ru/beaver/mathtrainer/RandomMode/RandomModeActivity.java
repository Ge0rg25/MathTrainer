package ru.beaver.mathtrainer.RandomMode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ru.beaver.mathtrainer.MainActivity;
import ru.beaver.mathtrainer.databinding.ActivityRandomModeBinding;

public class RandomModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRandomModeBinding binding = ActivityRandomModeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backBtn.setOnClickListener(view -> {
            Intent MainActivitySwitcher = new Intent(this, MainActivity.class);
            startActivity(MainActivitySwitcher);
        });
    }
}