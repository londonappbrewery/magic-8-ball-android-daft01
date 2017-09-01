package com.londonappbrewery.magiceightball;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.button;
import static com.londonappbrewery.magiceightball.R.id.roll_button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button roll_button = (Button) findViewById(R.id.roll_button);

        final ImageView left_dice = (ImageView) findViewById(R.id.ball);

        final int[] eball = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        roll_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int num = rand.nextInt(5);
                left_dice.setImageResource(eball[num]);
            }
        });
        };
    }
