package com.arithemeticcalculator.arithemeticcalculator.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.arithemeticcalculator.arithemeticcalculator.R;

import java.util.Timer;

public class SplashActivity extends AppCompatActivity
{
    Thread splashTread;
    private final int SPLASH_DISPLAY_LENGTH = 4000;
    boolean isBackPressed = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        try
        {
            splashTread = new Thread()
            {
                public void run()
                {
                    try
                    {
                        sleep(SPLASH_DISPLAY_LENGTH);

                        if (!isBackPressed)
                        {
                            Intent intent = new Intent(SplashActivity.this,ClassSelectionActivity.class);
                            startActivity(intent);
                            finish();
                        }

                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            };
            splashTread.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        isBackPressed = true;
    }
}
