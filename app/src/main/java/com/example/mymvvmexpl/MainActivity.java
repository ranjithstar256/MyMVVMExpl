package com.example.mymvvmexpl;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    MainActivityViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.te);

        model = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        String myRandomNumber = model.getNumber();
        tv.setText(myRandomNumber);
    }


    //   MainActivityViewModel  gg = new ViewModelProvider(this).get(MainActivityViewModel.class);
}