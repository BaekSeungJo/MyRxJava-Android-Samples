package com.morihacky.android.rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.morihacky.android.rxjava.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(android.R.id.content, new MainFragment(), this.toString())
                    .commit();
        }
    }


}
