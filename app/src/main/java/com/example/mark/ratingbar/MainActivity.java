package com.example.mark.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        determineNumber();



    }
    public void determineNumber(){
        textView = (TextView) findViewById(R.id.textView);
        float number = Float.parseFloat(textView.getText().toString());

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setRating(number);
    }
}
