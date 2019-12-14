package com.sherwinvaz4827.user.loadingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        progressBar=findViewById(R.id.progressBar);
        textView=findViewById(R.id.textView3);
        progressBar.setMax(100);
        progressBar.setScaleY(3f);
        progressAnimayion();
    }

    public void progressAnimayion(){
        ProgressBarAnimation progressBarAnimation=new ProgressBarAnimation(this, progressBar, textView, 0, 100);
        progressBarAnimation.setDuration(8000);
        progressBar.setAnimation(progressBarAnimation);
    }
}
