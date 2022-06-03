package com.stomeo.finalguessed;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OptionsActivity extends AppCompatActivity {

    public List<ArrayListElementos> elements;
    private final static String atlantis_URL = "https://play.google.com/store/apps/details?id=com.sermami.atlantis&hl=es&gl=US";
    private final static String guessed_URL = "https://mega.nz/file/xE5hwISC#AGXJOXQeZBeW01m3Pi96WYaEOHmPAGJyc929q8xY0Q0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        inicializar();
    }

    public void inicializar() {
        elements = new ArrayList<>();
        elements.add(new ArrayListElementos("Contáctanos"));
        elements.add(new ArrayListElementos("Compartir app"));
        elements.add(new ArrayListElementos("Nuestros juegos"));
        elements.add(new ArrayListElementos("Activar sonido"));

        MiAdaptador miAdaptador = new MiAdaptador(this, elements, new MiAdaptador.OnItemClickListener() {
            @Override
            public void onItemClick(ArrayListElementos item) {
                iniciarActividad(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(miAdaptador);
    }

    public void iniciarActividad(ArrayListElementos item) {
        switch (item.getOpcion()) {
            case "Contáctanos": {
                Intent intent = new Intent(this, ContactActivity.class);
                startActivity(intent);
                break;
            }
            case "Compartir app": {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(guessed_URL));
                startActivity(intent);
                break;
            }
            case "Nuestros juegos": {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(atlantis_URL));
                startActivity(intent);
                break;
            }
            case "Activar sonido": {
                Intent intent = new Intent(this, SoundActivity.class);
                startActivity(intent);
                break;
            }
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}
