package ru.beaver.mathtrainer.RandomMode;

import android.view.View;

import java.util.ArrayList;
import java.util.Random;


import ru.beaver.mathtrainer.RandomMode.Misc.RandomButton;
import ru.beaver.mathtrainer.databinding.ActivityRandomModeBinding;

public class RandomModeLogic {
    private final ActivityRandomModeBinding binding;
    private final ArrayList<RandomButton> buttons = new ArrayList<>();

    public RandomModeLogic(ActivityRandomModeBinding binding){
        this.binding = binding;
        binding.next.setOnClickListener(nextListener);
        setup();
    }

    View.OnClickListener nextListener = view -> {
        for(RandomButton btn: buttons){
            btn.refresh();
        }
    };

    public void setup(){
        Random randomizer = new Random();
        buttons.add(new RandomButton(binding.button1, randomizer));
        buttons.add(new RandomButton(binding.button2, randomizer));
        buttons.add(new RandomButton(binding.button3, randomizer));
        buttons.add(new RandomButton(binding.button4, randomizer));
        buttons.add(new RandomButton(binding.button5, randomizer));
    }

}
