package com.example.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "João Pedro", Toast.LENGTH_SHORT).show();
// aparece por mais tempo teste        Toast.makeText(this, "João Pedro", Toast.LENGTH_LONG).show();
    }
}
