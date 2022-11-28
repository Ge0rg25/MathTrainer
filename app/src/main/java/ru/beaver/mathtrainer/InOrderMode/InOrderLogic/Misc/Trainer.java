package ru.beaver.mathtrainer.InOrderMode.InOrderLogic.Misc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.beaver.mathtrainer.databinding.ActivityTrainerBinding;

public class Trainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTrainerBinding binding = ActivityTrainerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}