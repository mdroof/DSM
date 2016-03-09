package com.zerodevzone.dsm;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx = (TextView)findViewById(R.id.tv_text);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/BankGothic.ttf");

        tx.setTypeface(custom_font);
    }
}
