package com.example.RatingStar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBarView rtv = findViewById(R.id.rbv);
        rtv.setClickable(true);
        rtv.setStar(4, false);

        rtv.setOnRatingListener(new RatingBarView.OnRatingListener() {
            @Override
            public void onRating(Object bindObject, int RatingScore) {
                Toast.makeText(MainActivity.this, String.valueOf(RatingScore), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
