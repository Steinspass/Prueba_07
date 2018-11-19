package com.example.ndpsh.prueba_07.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ndpsh.prueba_07.R;


public class FragmentData extends Fragment {


    public FragmentData() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_fragment_data, container, false);

        // Inflate the layout for this fragment
        return view;
    }

}
