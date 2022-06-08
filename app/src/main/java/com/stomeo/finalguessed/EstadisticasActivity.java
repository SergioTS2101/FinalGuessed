package com.stomeo.finalguessed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.stomeo.finalguessed.sql.BaseDatosPalabras;
import com.stomeo.finalguessed.sql.SQLite;

public class EstadisticasActivity extends AppCompatActivity {

    TextView tvComidas, tvDeportes, tvAnimales, tvCapitales, tvProfesiones, tvCine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);

        SQLite dbHelper = new SQLite(this);

        tvComidas = findViewById(R.id.tvComidas);
        tvDeportes = findViewById(R.id.tvDeportes);
        tvAnimales = findViewById(R.id.tvAnimales);
        tvCapitales = findViewById(R.id.tvCapitales);
        tvProfesiones = findViewById(R.id.tvProfesiones);
        tvCine = findViewById(R.id.tvCine);

        BaseDatosPalabras dbAciertos = new BaseDatosPalabras(EstadisticasActivity.this);

        Cursor cursorComidas = dbAciertos.consultarAciertos("comida");
        Cursor cursorDeportes = dbAciertos.consultarAciertos("deportes");
        Cursor cursorAnimales = dbAciertos.consultarAciertos("animales");
        Cursor cursorCapitales = dbAciertos.consultarAciertos("capitales");
        Cursor cursorProfesiones = dbAciertos.consultarAciertos("profesiones");
        Cursor cursorCine = dbAciertos.consultarAciertos("cine");

        tvComidas.setText("Comidas acertadas: " + cursorComidas.getCount() + " palabra/s");
        tvDeportes.setText("Deportes acertados: " + cursorDeportes.getCount() + " palabra/s");
        tvAnimales.setText("Animales acertados: " + cursorAnimales.getCount() + " palabra/s");
        tvCapitales.setText("Capitales acertadas: " + cursorCapitales.getCount() + " palabra/s");
        tvProfesiones.setText("Profesiones acertadas: " + cursorProfesiones.getCount() + " palabra/s");
        tvCine.setText("Peliculas acertadas: " + cursorCine.getCount() + " palabra/s");
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