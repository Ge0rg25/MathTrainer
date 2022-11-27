package ru.beaver.mathtrainer.InOrderMode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.beaver.mathtrainer.databinding.ActivityInOrderBinding;

public class InOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityInOrderBinding binding = ActivityInOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}