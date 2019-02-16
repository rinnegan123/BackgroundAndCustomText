package com.example.background;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = findViewById(R.id.customText);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"Fonts/BPdotsUnicaseSquareBold.otf");
        t.setTypeface(myCustomFont);

        t = findViewById(R.id.customText2);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(),"Fonts/BEARPAW_.ttf");
        t.setTypeface(myCustomFont2);
    }
}
