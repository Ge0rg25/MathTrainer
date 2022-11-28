package ru.beaver.mathtrainer.InOrderMode.InOrderLogic;

import java.util.ArrayList;

import ru.beaver.mathtrainer.InOrderMode.InOrderLogic.Misc.InOrderButton;
import ru.beaver.mathtrainer.databinding.ActivityInOrderBinding;


public class MainInOrderLogic {
    private ArrayList<InOrderButton> buttons = new ArrayList<>();
    ActivityInOrderBinding binding;

    public MainInOrderLogic(ActivityInOrderBinding binding) {
        this.binding = binding;
    }

    public void setup(){
        binding.train2.setOnClickListener(view -> {

        });
    }
}
