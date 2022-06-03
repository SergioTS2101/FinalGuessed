package com.stomeo.finalguessed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.stomeo.finalguessed.adapter.LetrasAdapter;

import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity {

    private enum Temas {
        comida, deportes, animales, capitales, profesiones, cine
    }

    ImageButton btn;
    //Button noBtn;
    ImageView hangman;
    //int cont = 0;
    String temaElegido;
    TextView tvTema;

    Button btnA;

    //Recycler letras
    RecyclerView recyclerView;
    ArrayList<LetrasList> letrasList;
    LetrasAdapter letrasAdapter;

    private List<ListaPalabras> listaPalabras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btn = (ImageButton) findViewById(R.id.mainButton);
        //noBtn = (Button) findViewById(R.id.btnNo);
        hangman = (ImageView) findViewById(R.id.hangman);

        btnA = (Button) findViewById(R.id.a);

        tvTema = (TextView) findViewById(R.id.tvTema);

        recyclerView = findViewById(R.id.rvLetras);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        temaElegido = getIntent().getStringExtra("temaElegido");
        Temas tema = Temas.valueOf(temaElegido);
        switch (tema) {
            case comida:
                tvTema.setText(R.string.comida);
                break;
            case deportes:
                tvTema.setText(R.string.deportes);
                break;
            case animales:
                tvTema.setText(R.string.animales);
                break;
            case capitales:
                tvTema.setText(R.string.capitales);
                break;
            case profesiones:
                tvTema.setText(R.string.profesiones);
                break;
            case cine:
                tvTema.setText(R.string.cine);
                break;
        }

        listaPalabras = ArrayListPalabras.getPalabras(temaElegido);

        int numero = (int)(Math.random()*30+1);
        String palabraAleatoria = listaPalabras.get(numero).getPalabra();

        char[] caracteres = palabraAleatoria.toCharArray();


        letrasList = new ArrayList<>();
        for (int i = 0; i < caracteres.length; i++){
            LetrasList letras = new LetrasList(caracteres[i]);
            letrasList.add(letras);
        }


        LinearLayoutManager layoutManager = new LinearLayoutManager(
                GameActivity.this,LinearLayoutManager.HORIZONTAL,false
        );

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);

        recyclerView.setAdapter(letrasAdapter);



       /* btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < caracteres.length; i++){
                    if(caracteres =){

                    }
                }
            }
        });*/


       /* noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont++;
                if (cont == 1) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.primer_fallo);

                } else if (cont == 2) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.segundo_fallo);

                } else if (cont == 3) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.tercer_fallo);
                } else if (cont == 4) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.cuarto_fallo);
                } else if (cont == 5) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.quinto_fallo);
                } else if (cont == 6) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.septimo_fallo);
                } else if (cont == 7) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.octavo_fallo);
                    Intent intent = new Intent(getApplicationContext(), GameOverActivity.class);
                    startActivity(intent);

                }
            }
        });
        */
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
