package com.ybennun.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button showGuess;
    private EditText enterGuess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showGuess = findViewById(R.id.button_guess);
        enterGuess = findViewById(R.id.guess_field);

        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String guess = enterGuess.getText().toString().trim();
                if (!guess.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, ShowGuess.class);
                    intent.putExtra("guess", guess);
                    intent.putExtra("name", "bond");
                    intent.putExtra("age", 34);

                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "Enter guess", Toast.LENGTH_SHORT).show();
                }
                //startActivity(new Intent(MainActivity.this, ShowGuess.class));
            }
        });

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d("Cycle", "onStart:");
//        Toast.makeText(MainActivity.this, "onStart() Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        Log.d("Cycle", "onPostResume:");
//        Toast.makeText(MainActivity.this, "onPostResume() Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("Cycle", "onPaused:");
//        Toast.makeText(MainActivity.this, "onPaused() Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d("Cycle", "onStop:");
//        Toast.makeText(MainActivity.this, "onStop() Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("Cycle", "onDestroy:");
//        Toast.makeText(MainActivity.this, "onDestroy() Called", Toast.LENGTH_SHORT).show();
//    }
    }
}