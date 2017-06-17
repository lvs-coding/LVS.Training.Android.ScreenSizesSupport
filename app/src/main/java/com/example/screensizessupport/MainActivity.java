package com.example.screensizessupport;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm;

        fm = getSupportFragmentManager();
        Fragment fragmentW = fm.findFragmentById(R.id.fl_container_fragment_w);
        if (fragmentW == null) {
            fragmentW = new WFragment();
            fm.beginTransaction()
                    .add(R.id.fl_container_fragment_w, fragmentW)
                    .commit();
        }


        fm = getSupportFragmentManager();
        Fragment fragmentDpi = fm.findFragmentById(R.id.fl_container_fragment_dpi);
        if (fragmentDpi == null) {
            fragmentDpi = new DpiFragment();
            fm.beginTransaction()
                    .add(R.id.fl_container_fragment_dpi, fragmentDpi)
                    .commit();
        }
    }
}
