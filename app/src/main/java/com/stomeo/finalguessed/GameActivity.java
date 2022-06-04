package com.stomeo.finalguessed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    TextView tvPrueba;

    TextView tvA;
    TextView tvB;
    TextView tvC;
    TextView tvD;
    TextView tvE;
    TextView tvF;
    TextView tvG;
    TextView tvH;
    TextView tvI;
    TextView tvJ;
    TextView tvK;
    TextView tvL;
    TextView tvM;
    TextView tvN;
    TextView tvO;
    TextView tvP;
    TextView tvQ;
    TextView tvR;
    TextView tvS;
    TextView tvT;
    TextView tvU;
    TextView tvV;
    TextView tvW;
    TextView tvX;
    TextView tvY;
    TextView tvZ;

    char[] caracteres;

    //Recycler letras
    RecyclerView recyclerView;
    ArrayList<LetrasList> letrasList;
    LetrasAdapter letrasAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btn = (ImageButton) findViewById(R.id.mainButton);
        //noBtn = (Button) findViewById(R.id.btnNo);
        hangman = (ImageView) findViewById(R.id.hangman);

        tvA = (TextView) findViewById(R.id.a);
        tvB = (TextView) findViewById(R.id.b);
        tvC = (TextView) findViewById(R.id.c);
        tvD = (TextView) findViewById(R.id.d);
        tvE = (TextView) findViewById(R.id.e);
        tvF = (TextView) findViewById(R.id.f);
        tvG = (TextView) findViewById(R.id.g);
        tvH = (TextView) findViewById(R.id.h);
        tvI = (TextView) findViewById(R.id.i);
        tvJ = (TextView) findViewById(R.id.j);
        tvK = (TextView) findViewById(R.id.k);
        tvL = (TextView) findViewById(R.id.l);
        tvM = (TextView) findViewById(R.id.m);
        tvN = (TextView) findViewById(R.id.n);
        tvO = (TextView) findViewById(R.id.o);
        tvP = (TextView) findViewById(R.id.p);
        tvQ = (TextView) findViewById(R.id.q);
        tvR = (TextView) findViewById(R.id.r);
        tvS = (TextView) findViewById(R.id.s);
        tvT = (TextView) findViewById(R.id.t);
        tvU = (TextView) findViewById(R.id.u);
        tvV = (TextView) findViewById(R.id.v);
        tvW = (TextView) findViewById(R.id.w);
        tvX = (TextView) findViewById(R.id.x);
        tvY = (TextView) findViewById(R.id.y);
        tvZ = (TextView) findViewById(R.id.z);

        tvTema = (TextView) findViewById(R.id.tvTema);

        tvPrueba = (TextView) findViewById(R.id.tvPrueba);

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

        List<ListaPalabras> listaPalabras = ArrayListPalabras.getPalabras(temaElegido);

        int numero = (int) (Math.random() * 29 + 0);
        String palabraAleatoria = listaPalabras.get(numero).getPalabra();

        tvPrueba.setText(palabraAleatoria);

        caracteres = palabraAleatoria.toCharArray();


        letrasList = new ArrayList<LetrasList>();
        for (int i = 0; i < caracteres.length; i++) {
            letrasList.add(new LetrasList(' '));
        }



        LinearLayoutManager layoutManager = new LinearLayoutManager(
                GameActivity.this, LinearLayoutManager.HORIZONTAL, false
        );

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);

        recyclerView.setAdapter(letrasAdapter);


        tvA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        tvZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

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
