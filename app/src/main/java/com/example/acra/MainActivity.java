package com.example.acra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        a=(TextView) findViewById(R.id.a);
        setContentView(R.layout.activity_main);
        a.setText("hello");
    }
}
