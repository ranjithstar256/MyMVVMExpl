package com.example.mymvvmexpl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.te);

        GeneratRandm  gg = new ViewModelProvider(this).get(GeneratRandm.class);

        String v = gg.genranbr();

        tv.setText(v);
    }
}