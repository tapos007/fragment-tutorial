package com.example.tapos.fragmentday1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();


    }

    public void addA(View view) {
        FragmentA fragmenta = new FragmentA();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.container,fragmenta,"fragA");
        transaction.commit();
    }

    public void removeA(View view) {

        FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("fragA");
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(fragmentA !=null) {
            transaction.remove(fragmentA);
            transaction.commit();
        }else{
            Toast.makeText(this,"Fragment A not found",Toast.LENGTH_SHORT).show();
        }
    }


    public void addB(View view) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.container,fragmentB,"fragB");
        transaction.commit();
    }

    public void removeB(View view) {
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentByTag("fragB");
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(fragmentB !=null) {
            transaction.remove(fragmentB);
            transaction.commit();
        }else{
            Toast.makeText(this,"Fragment B not found",Toast.LENGTH_SHORT).show();
        }
    }

    public void replaceByFragmentA(View view) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container,fragmentA,"fragA");
        transaction.commit();
    }

    public void replaceByFragmentB(View view) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container,fragmentB,"fragB");
        transaction.commit();
    }

    public void attachFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("fragA");
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(fragmentA !=null) {
            transaction.attach(fragmentA);
            transaction.commit();
        }
    }

    public void detachFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("fragA");
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(fragmentA !=null) {
            transaction.detach(fragmentA);
            transaction.commit();
        }
    }

    public void showFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("fragA");
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(fragmentA !=null) {
            transaction.show(fragmentA);
            transaction.commit();
        }
    }

    public void hideFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("fragA");
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(fragmentA !=null) {
            transaction.hide(fragmentA);
            transaction.commit();
        }
    }
}
