package com.example.tapos.fragmentday1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyFragmentListener{

    FragmentManager fragmentManager;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = (TextView) findViewById(R.id.displayResult);
        fragmentManager = getFragmentManager();
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.container,fragmentA,"fragA");
        transaction.commit();


    }


    @Override
    public void sum(int result) {
        resultText.setText(result + " ");
    }
}
