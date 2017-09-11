package com.example.tapos.fragmentday1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentA  extends Fragment implements View.OnClickListener {
    EditText esFirst;
    EditText esSecond;
    Button submitButton;
    private int output;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        esFirst = (EditText) view.findViewById(R.id.etFirstNumber);
        esSecond = (EditText) view.findViewById(R.id.etSecondNumber);
        submitButton = (Button) view.findViewById(R.id.submitButton);
        submitButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id==R.id.submitButton){
            int firstNumber = Integer.parseInt(esFirst.getText().toString());
            int secondNumber = Integer.parseInt(esSecond.getText().toString());

         MyFragmentListener mylistener =    (MyFragmentListener) getActivity();
            mylistener.sum(firstNumber+secondNumber);
        }
    }




}
