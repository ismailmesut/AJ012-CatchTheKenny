package com.ismailmesutmujde.catchthekenny;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView timeText;
    TextView scoreText;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize
        timeText = (TextView) findViewById(R.id.timeText);
        scoreText = (TextView) findViewById(R.id.scoreText);

        score = 0;

    }

    public void increaseScore(View view) {
        score++;  // score = score + 1;
        scoreText.setText("Score : " + score);
    }
}