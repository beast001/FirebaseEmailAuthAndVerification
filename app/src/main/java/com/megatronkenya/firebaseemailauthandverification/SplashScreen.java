package com.megatronkenya.firebaseemailauthandverification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    ProgressBar mProgressBar;
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

        mProgressBar =  findViewById(R.id.progress_bar);
        mTextView = findViewById(R.id.text_view);
        mProgressBar.setMax(100);
        mProgressBar.setScaleY(3f);

        progressAnimation();
    }

    private void progressAnimation() {
        ProgressBarAnimation anim = new ProgressBarAnimation( this, mProgressBar, mTextView, 0f,100f);
        anim.setDuration(8000);
        mProgressBar.setAnimation(anim);
    }
}
