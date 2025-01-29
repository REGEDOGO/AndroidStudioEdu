package com.example.aktywnosci;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int seconds = 0;
    private boolean running,wasrunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!= null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("isrunning");
            wasrunning = savedInstanceState.getBoolean("wasrunning");
        } runTimer();
    }
    public void onClickStart(View view) { running = true; wasrunning=true; }
    public void onClickReset(View view) {
        running = false;
        seconds = 0;
    }
    public void onClickStop(View view) { running = false; wasrunning=false; }

    private void runTimer(){
        final TextView timeView = findViewById(R.id.gigaview);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int sec = seconds%60;
                String time = String.format("%d:%02d:%02d", hours, minutes, sec);
                timeView.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }
}