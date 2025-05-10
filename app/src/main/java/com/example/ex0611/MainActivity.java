package com.example.ex0611;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout main;
    Switch sw;
    RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main = findViewById(R.id.main);
        sw = findViewById(R.id.sw);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);

    }

    public void change(View view) {
        if (!sw.isChecked())
        {
            if (rb1.isChecked()) main.setBackgroundColor(Color.RED);
            if (rb2.isChecked()) main.setBackgroundColor(Color.GREEN);
            if (rb3.isChecked()) main.setBackgroundColor(Color.BLUE);
            if (rb4.isChecked()) main.setBackgroundColor(Color.YELLOW);
        }
    }

    public void swOn(View view) {
        if (sw.isChecked())
        {
            if (rb1.isChecked()) main.setBackgroundColor(Color.RED);
            if (rb2.isChecked()) main.setBackgroundColor(Color.GREEN);
            if (rb3.isChecked()) main.setBackgroundColor(Color.BLUE);
            if (rb4.isChecked()) main.setBackgroundColor(Color.YELLOW);
        }
    }
}