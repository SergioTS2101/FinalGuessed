package com.stomeo.finalguessed;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class OptionsActivity extends AppCompatActivity {

    public List<ArrayListElementos> elements;
    private final static String atlantis_URL = "https://play.google.com/store/apps/details?id=com.sermami.atlantis&hl=es&gl=US";

    BroadcastReceiver miBroadcast = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
                Log.i("TAG", "Screen ON");
            } else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
                Log.i("TAG", "Screen OFF");
                parar();
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        inicializar();

        registerReceiver(miBroadcast, new IntentFilter(Intent.ACTION_SCREEN_ON));
        registerReceiver(miBroadcast, new IntentFilter(Intent.ACTION_SCREEN_OFF));
    }

    public void inicializar() {
        elements = new ArrayList<>();
        if (Locale.getDefault().getISO3Language().equals("eng")) {
            elements.add(new ArrayListElementos("Contact us"));
            elements.add(new ArrayListElementos("Share app"));
            elements.add(new ArrayListElementos("Our games"));
            elements.add(new ArrayListElementos("Activate sound"));
        } else {
            elements.add(new ArrayListElementos("Contáctanos"));
            elements.add(new ArrayListElementos("Compartir app"));
            elements.add(new ArrayListElementos("Nuestros juegos"));
            elements.add(new ArrayListElementos("Activar sonido"));
        }
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

    private void reproducir() {
        startService(new Intent(this, ServicioMusica.class));
    }

    private void parar() {
        stopService(new Intent(this, ServicioMusica.class));
    }


    public void iniciarActividad(ArrayListElementos item) {
        switch (item.getOpcion()) {
            case "Contáctanos": {
                Intent intent = new Intent(this, ContactActivity.class);
                startActivity(intent);
                break;
            }
            case "Compartir app": {
                compartirApp();
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
            case "Contact us": {
                Intent intent = new Intent(this, ContactActivity.class);
                startActivity(intent);
                break;
            }
            case "Share app": {
                compartirApp();
                break;
            }
            case "Our games": {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(atlantis_URL));
                startActivity(intent);
                break;
            }
            case "Activate sound": {
                Intent intent = new Intent(this, SoundActivity.class);
                startActivity(intent);
                break;
            }
        }
    }

    private void compartirApp() {
        try {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.app_name));
            String aux = "Descarga la app Guessed\n";
            aux = aux + "https://mega.nz/file/M2JWzLoA#L2_gJd-rKljUyLHNX4W836gPZOB1ituQZBcsHBTO8fo";
            i.putExtra(Intent.EXTRA_TEXT, aux);
            startActivity(i);
        } catch (Exception ignored) {
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
