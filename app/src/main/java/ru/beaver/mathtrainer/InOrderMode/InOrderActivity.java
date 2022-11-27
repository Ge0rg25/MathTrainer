package ru.beaver.mathtrainer.InOrderMode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import ru.beaver.mathtrainer.InOrderMode.InOrderLogic.MainInOrderLogic;
import ru.beaver.mathtrainer.MainActivity;
import ru.beaver.mathtrainer.databinding.ActivityInOrderBinding;

public class InOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityInOrderBinding binding = ActivityInOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.BckBtn.setOnClickListener(view -> {
            Intent MainActivitySwitcher = new Intent(this, MainActivity.class);
            startActivity(MainActivitySwitcher);
        });
    }
}