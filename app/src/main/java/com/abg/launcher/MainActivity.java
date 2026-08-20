package com.abg.launcher;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btnPlay = findViewById(R.id.btnPlay);

        if (btnPlay != null) {
            btnPlay.setOnClickListener(v ->
                    Toast.makeText(
                            MainActivity.this,
                            "ABG Launcher يعمل بنجاح",
                            Toast.LENGTH_SHORT
                    ).show()
            );
        }
    }
}
