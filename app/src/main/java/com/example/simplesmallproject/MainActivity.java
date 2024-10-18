package com.example.simplesmallproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private String[] sentences = {
            "This is the first sentence.",
            "Now you're seeing the second sentence.",
            "Here comes the third sentence.",
            "You're looking at the fourth sentence now.",
            "Finally, this is the fifth sentence."
    };
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        random = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomIndex = random.nextInt(sentences.length);
                textView.setText(sentences[randomIndex]);
            }
        });
    }
}