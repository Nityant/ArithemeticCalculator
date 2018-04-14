package com.arithemeticcalculator.arithemeticcalculator.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.arithemeticcalculator.arithemeticcalculator.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try
        {
            Intent intent = new Intent (MainActivity.this,SplashActivity.class);
            startActivity(intent);
            finish();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
