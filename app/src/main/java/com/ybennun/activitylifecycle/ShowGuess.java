package com.ybennun.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {
    private TextView showGuessTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        Bundle extra = getIntent().getExtras();

        showGuessTextView = findViewById(R.id.recieved_textview);

        if (extra != null) {
            showGuessTextView.setText(extra.getString("guess"));
            Log.d("Name extra 1", "onCreate: " + extra.getString("name"));
            Log.d("Name extra 2", "onCreate: " + extra.getInt("age"));
        }

//        if (getIntent().getStringExtra("guess") != null) {
//            Log.d("Stuff", "" + getIntent().getStringExtra("name"));
//            showGuessTextView.setText(getIntent().getStringExtra("guess"));
//        }


    }
}