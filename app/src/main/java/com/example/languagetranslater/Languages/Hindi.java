package com.example.languagetranslater.Languages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.languagetranslater.R;

public class Hindi extends AppCompatActivity {
    
 TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi);
        
        textView= findViewById(R.id.language1);
        
       // textView.setText(getIntent().getExtras().getString("language1"));
    }
}