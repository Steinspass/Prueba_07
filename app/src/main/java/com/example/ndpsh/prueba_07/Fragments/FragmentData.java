package com.example.ndpsh.prueba_07.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.ndpsh.prueba_07.R;


public class FragmentData extends Fragment {


    private EditText textData;
    private Button btnSend;

    private DataListener callback;



    public FragmentData() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            callback = (DataListener) context;
        }catch (Exception e){
            throw new ClassCastException(context.toString() + "should implement DataListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_fragment_data, container, false);
       //Logica para capturar los elementos de la UI

        textData = (EditText) view.findViewById(R.id.editTextData);
        btnSend = (Button) view.findViewById(R.id.buttonSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendText(textData.getText().toString());
            }
        });


        // Inflate the layout for this fragment
        return view;
    }

    private void sendText(String text) {
        callback.sendData(text);
    }
    // Declaramos la interfaz la cual recibe unos (datos=text)
    public interface DataListener{
      void sendData(String text);
    }

}
