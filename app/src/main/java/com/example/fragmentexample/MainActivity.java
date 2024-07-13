package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names = {"Alice", "Bob", "Charlie"};

        // Get the container where the fragments will be added
        LinearLayout container = findViewById(R.id.fragment_container);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            for (String name : names) {
                NameFragment fragment = NameFragment.newInstance(name);
                transaction.add(R.id.fragment_container, fragment);
            }

            transaction.commit();
        }
    }
}
