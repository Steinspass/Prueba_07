package com.example.ndpsh.prueba_07.Activities;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.example.ndpsh.prueba_07.Fragments.DetailsFragment;
import com.example.ndpsh.prueba_07.Fragments.FragmentData;
import com.example.ndpsh.prueba_07.R;

public class MainActivity extends FragmentActivity implements FragmentData.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String text) {
        // Llamar al metodo renderizar Texto de el DetailsFragments
        // pasando el texto que recibimos por parametro en este mismo metodo

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.renderText(text);
    }
}
