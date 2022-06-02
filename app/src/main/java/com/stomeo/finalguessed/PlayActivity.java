package com.stomeo.finalguessed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PlayActivity extends AppCompatActivity {

    ImageButton btn;
    CardView cvComida;
    CardView cvDeportes;
    CardView cvAnimales;
    CardView cvCapitales;
    CardView cvProfesiones;
    CardView cvCine;

    private String temaElegido = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        btn = (ImageButton) findViewById(R.id.mainButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        cvComida = (CardView) findViewById(R.id.cvComida);
        cvDeportes = (CardView) findViewById(R.id.cvDeportes);
        cvAnimales = (CardView) findViewById(R.id.cvAnimales);
        cvCapitales = (CardView) findViewById(R.id.cvCapitales);
        cvProfesiones = (CardView) findViewById(R.id.cvProfesiones);
        cvCine = (CardView) findViewById(R.id.cvCine);

        cvComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "comida";
                setTemaElegido("comida");
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        cvDeportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "deportes";
                setTemaElegido("deportes");
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        cvAnimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "animales";
                setTemaElegido("animales");
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        cvCapitales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "capitales";
                setTemaElegido("capitales");
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        cvProfesiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "profesiones";
                setTemaElegido("profesiones");
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        cvCine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "cine";
                setTemaElegido("cine");
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });
    }

    public void setTemaElegido(String temaElegido) {
        this.temaElegido = temaElegido;
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