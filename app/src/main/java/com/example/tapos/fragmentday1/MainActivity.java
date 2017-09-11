package com.example.tapos.fragmentday1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    EditText esFirst;
    EditText esSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();
        esFirst = (EditText) findViewById(R.id.etFirstNumber);
        esSecond = (EditText) findViewById(R.id.etSecondNumber);


    }


    public void sendDataFragmentA(View view) {

        int firstNumber = Integer.parseInt(esFirst.getText().toString());
        int secondNumber = Integer.parseInt(esFirst.getText().toString());
        int result = firstNumber + secondNumber;
        Bundle bundle = new Bundle();
        bundle.putInt("resultData",result);
        FragmentA fragmentA = new FragmentA();
        fragmentA.setArguments(bundle);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.container,fragmentA,"fragA");
        transaction.commit();

    }

    public void sendDataFragmentAAnother(View view) {
        int firstNumber = Integer.parseInt(esFirst.getText().toString());
        int secondNumber = Integer.parseInt(esFirst.getText().toString());
        int result = firstNumber + secondNumber;
        FragmentA fragmentA = new FragmentA();
        fragmentA.setData(result);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.container,fragmentA,"fragA");
        transaction.commit();
    }
}
