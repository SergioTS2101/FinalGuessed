package com.stomeo.finalguessed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
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

    @SuppressLint("StaticFieldLeak")
    private static Context mContext;
    ImageButton btn;
    ImageView hangman;
    static int contfallos;
    static int contaciertos;
    String temaElegido;
    String palabraCorrecta;
    TextView tvTema;

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
        mContext = this;
        btn = findViewById(R.id.mainButton);
        hangman = findViewById(R.id.hangman);

        tvA = findViewById(R.id.a);
        tvB = findViewById(R.id.b);
        tvC = findViewById(R.id.c);
        tvD = findViewById(R.id.d);
        tvE = findViewById(R.id.e);
        tvF = findViewById(R.id.f);
        tvG = findViewById(R.id.g);
        tvH = findViewById(R.id.h);
        tvI = findViewById(R.id.i);
        tvJ = findViewById(R.id.j);
        tvK = findViewById(R.id.k);
        tvL = findViewById(R.id.l);
        tvM = findViewById(R.id.m);
        tvN = findViewById(R.id.n);
        tvO = findViewById(R.id.o);
        tvP = findViewById(R.id.p);
        tvQ = findViewById(R.id.q);
        tvR = findViewById(R.id.r);
        tvS = findViewById(R.id.s);
        tvT = findViewById(R.id.t);
        tvU = findViewById(R.id.u);
        tvV = findViewById(R.id.v);
        tvW = findViewById(R.id.w);
        tvX = findViewById(R.id.x);
        tvY = findViewById(R.id.y);
        tvZ = findViewById(R.id.z);

        tvTema = findViewById(R.id.tvTema);

        recyclerView = findViewById(R.id.rvLetras);
        contaciertos = 0;
        contfallos = 0;
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
        palabraCorrecta = palabraAleatoria;

        caracteres = palabraAleatoria.toCharArray();


        letrasList = new ArrayList<>();
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
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('A', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvA.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('B', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvB.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }

        });

        tvC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('C', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvC.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('D', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvD.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('E', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvE.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('F', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvF.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('G', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvG.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('H', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvH.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('I', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvI.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('J', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvJ.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('K', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvK.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('L', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvL.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('M', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvM.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('N', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvN.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('O', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvO.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('P', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvP.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('Q', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvQ.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('R', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvR.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('S', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvS.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('T', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvT.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('U', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvU.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('V', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvV.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('W', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvW.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('X', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvX.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('Y', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvY.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });

        tvZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (!pressed) {
                    if (guessWord('Z', caracteres, letrasList)) {
                        letrasAdapter = new LetrasAdapter(GameActivity.this, letrasList);
                        recyclerView.setAdapter(letrasAdapter);
                    }
                    tvZ.setVisibility(View.INVISIBLE);
                    pressed = true;
                    checkConds(hangman, caracteres);
                }
            }
        });
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

    public static boolean guessWord(char c, char[] caracteres, ArrayList<LetrasList> letrasList) {
        boolean fail = true;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == c) {
                fail = false;
                contaciertos++;
                letrasList.set(i, new LetrasList(c));

            }
        }
        if (fail) {
            contfallos++;
            return (false);
        } else
            return (true);
    }

    public void checkConds(ImageView hangman, char[] caracteres) {
        if (contfallos == 1) {
            hangman.setVisibility(View.VISIBLE);
            hangman.setImageResource(R.drawable.primer_fallo);
        } else if (contfallos == 2) {
            hangman.setVisibility(View.VISIBLE);
            hangman.setImageResource(R.drawable.segundo_fallo);
        } else if (contfallos == 3) {
            hangman.setVisibility(View.VISIBLE);
            hangman.setImageResource(R.drawable.tercer_fallo);
        } else if (contfallos == 4) {
            hangman.setVisibility(View.VISIBLE);
            hangman.setImageResource(R.drawable.cuarto_fallo);
        } else if (contfallos == 5) {
            hangman.setVisibility(View.VISIBLE);
            hangman.setImageResource(R.drawable.quinto_fallo);
        } else if (contfallos == 6) {
            hangman.setVisibility(View.VISIBLE);
            hangman.setImageResource(R.drawable.septimo_fallo);
        } else if (contfallos == 7) {
            hangman.setVisibility(View.VISIBLE);
            hangman.setImageResource(R.drawable.octavo_fallo);
            Intent intent = new Intent(mContext, GameOverActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("palabraCorrecta", palabraCorrecta);
            mContext.startActivity(intent);
            finish();
        }
        if (contaciertos == caracteres.length) {
            Intent intent = new Intent(mContext, GameOverActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            mContext.startActivity(intent);
        }
    }

}
