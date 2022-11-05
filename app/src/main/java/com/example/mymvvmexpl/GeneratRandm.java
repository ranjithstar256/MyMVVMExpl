package com.example.mymvvmexpl;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class GeneratRandm extends AndroidViewModel {

    String s;

    public GeneratRandm(@NonNull Application application) {
        super(application);
    }

    public String genranbr(){
        createrandnum();
        return s;
    }

    private String createrandnum() {
        Random r = new Random();
        s=(r.nextInt(100-1)+1)+"";
        return s;
    }
}
