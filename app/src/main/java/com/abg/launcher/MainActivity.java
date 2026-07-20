package com.abg.launcher;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView textView = new TextView(this);
        textView.setText("Welcome to ABG Minecraft Launcher!");
        textView.setTextSize(22);
        textView.setGravity(android.view.Gravity.CENTER);
        
        setContentView(textView);
    }
}
