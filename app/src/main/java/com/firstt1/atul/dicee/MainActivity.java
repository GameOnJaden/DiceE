package com.firstt1.atul.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button RolLbutton;
    ImageView leftDice,rightDice;

    final int[] dicearray = {R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6 };

    int number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RolLbutton = findViewById(R.id.RolLbutton);


        leftDice = findViewById(R.id.image_leftDice);

        rightDice = findViewById(R.id.image_rightDice);

        RolLbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("DiceE","da button has been pressed Eh!");

                Random random_number_generator = new Random();

                number = random_number_generator.nextInt(6);
                Log.d("DiceE","da random_number is: " + number);


               leftDice.setImageResource(dicearray[number]);

               number = random_number_generator.nextInt(6);
               Log.d("DiceE","da 2nd random_number is : " + number);

               rightDice.setImageResource(dicearray[number]);



            }
        });


    }
}
