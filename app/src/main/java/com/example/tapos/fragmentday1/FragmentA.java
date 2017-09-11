package com.example.tapos.fragmentday1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tapos on 9/11/2017.
 */

public class FragmentA  extends Fragment {
    TextView result;
    private int output;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        result = (TextView) view.findViewById(R.id.textResult);
        result.setText(this.output + "");
        return view;
    }

    public void setData(int data) {
        this.output = data;
    }
}
