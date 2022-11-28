package ru.beaver.mathtrainer.InOrderMode.InOrderLogic.Misc;

import android.view.View;
import android.widget.Button;

public class InOrderButton {
    private final Button btn;
    private Integer f_num;
    private Integer s_num;
    private Integer answer;
    private Boolean is_pressed;

    public InOrderButton(Button btn, Integer f_num, Integer s_num) {
        this.btn = btn;

    }

    private void setup() {
        is_pressed = false;
        answer = f_num * s_num;
        btn.setText(String.valueOf(f_num + " × " + s_num));
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!is_pressed) {
                is_pressed = true;
                btn.setText(String.valueOf(btn.getText() + "\n" + "Ответ: " + answer));
            }
        }
    };

    public void refresh(){
        setup();
    }
}
