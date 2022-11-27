package ru.beaver.mathtrainer.RandomMode.Misc;

import android.view.View;
import android.widget.Button;

import java.util.Random;

public class RandomButton {
    private final Button btn;
    private Random randomizer;
    private Integer f_num;
    private Integer s_num;
    private Integer answer;
    private Boolean is_pressed = false;

    public RandomButton(Button btn, Random randomizer) {
        this.randomizer = randomizer;
        this.btn = btn;
        setup();
    }

    private void setup() {
        is_pressed = false;
        f_num = randomizer.ints(1, 11).findFirst().getAsInt();
        s_num = randomizer.ints(1, 11).findFirst().getAsInt();
        answer = f_num * s_num;
        btn.setText(String.valueOf(f_num + " × " + s_num));
        btn.setOnClickListener(onClick);
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(!is_pressed){
                btn.setText(String.valueOf(f_num + " × " + s_num + "\n" + "Ответ: " + answer));
                is_pressed = true;
            }
        }
    };


    public void refresh(){
        setup();
    }
}
