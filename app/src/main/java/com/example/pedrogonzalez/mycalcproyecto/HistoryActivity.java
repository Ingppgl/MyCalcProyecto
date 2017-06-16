package com.example.pedrogonzalez.mycalcproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {
    Button H_clear;
    TextView exit;
    String inComing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        exit = (TextView) findViewById(R.id.my_screen);
        inComing = String.format("%s)%s\n%s)%s\n%s)%s\n%s)%s\n%s)%s\n",
                1, MainActivity.past[4],
                2, MainActivity.past[3],
                3, MainActivity.past[2],
                4, MainActivity.past[1],
                5, MainActivity.past[0]);

        exit.setText(inComing);

        H_clear = (Button) findViewById(R.id.empty);
        H_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inComing = "";
                exit.setText(inComing);
                for (int i = MainActivity.past.length - 1; i >= 0; i--) {
                    MainActivity.past[i] = "";
                }
            }
        });

    }
}