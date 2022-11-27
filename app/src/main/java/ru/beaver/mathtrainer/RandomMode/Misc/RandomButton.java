package ru.beaver.mathtrainer.RandomMode.Misc;

import android.view.View;
import android.widget.Button;

import java.util.Random;

public class RandomButton {
    private final Button btn;
    private final Random randomizer;
    private Integer f_num;
    private Integer s_num;
    private Integer answer;
    private Boolean is_pressed = false;

    public RandomButton(Button btn, Random randomizer) {
        this.btn = btn;
        this.randomizer = randomizer;
    }

    public void setup() {
        is_pressed = false;
        f_num = randomizer.ints(1, 10).findFirst().getAsInt();
        s_num = randomizer.ints(1, 10).findFirst().getAsInt();
        answer = f_num + s_num;
        btn.setText(String.valueOf(f_num + " × " + s_num));
        btn.setOnClickListener(onClick);
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            btn.setText(String.valueOf(f_num + " × " + s_num + "\n" + "Ответ: " + answer));
        }
    };

    // TODO: Refresh Method
    public void refresh(){

    }
}
