package com.cyberx.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkCheckBox, sugarCheckBox, riceCheckBox;
    private Button showButton;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckBox = (CheckBox) findViewById(R.id.milk_text_id);
        sugarCheckBox = (CheckBox) findViewById(R.id.sugar_text_id);
        riceCheckBox = (CheckBox) findViewById(R.id.rice_text_id);

        showButton = (Button) findViewById(R.id.button_id);
        resultView = (TextView) findViewById(R.id.result_text_id);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if (milkCheckBox.isChecked()) {
                    String value = milkCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n");
                }
                if (sugarCheckBox.isChecked()) {
                    String value = sugarCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n");
                }
                if (riceCheckBox.isChecked()) {
                    String value = riceCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered");
                }
                resultView.setText(stringBuilder);
            }
        });
    }
}