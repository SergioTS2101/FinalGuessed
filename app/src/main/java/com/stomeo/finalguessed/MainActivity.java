package com.stomeo.finalguessed;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button jugar;
    Button opciones;
    Button btn2Jugadores;
    private String palabra = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.mainGIF);
        Glide.with(this).asGif().load(R.raw.ahorcado).into(imageView);

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
            alertDialog.setTitle("Welcome!");
            alertDialog.setMessage("Before you start playing, we would like to clarify something.                                       " + "The words you can introduce in the multiplayer mode, only can have a length from 4 to 10 letters.                                  " + "The length of the generate words is the same. Enjoy the game!.");
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);

            alertDialog.setPositiveButton("OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }

                    });
            alertDialog.show();
        } else {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
            alertDialog.setTitle("¡Bienvenid@!");
            alertDialog.setMessage("Antes de comenzar a jugar, nos gustaría explicar un par de cosas.                               " + "Las palabras introducidas en el modo 2 jugadores solo pueden tener una longitud de entre 4 y 10 letras y deben de estar escritas en mayúsculas.                                  " + "La longitud de las palabras generadas en el juego son las mismas. Disfruta del juego.");
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);

            alertDialog.setPositiveButton("OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }

                    });
            alertDialog.show();
        }


        jugar = findViewById(R.id.jugar);

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PlayActivity.class);
                startActivity(intent);
            }
        });

        opciones = findViewById(R.id.opciones);

        opciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OptionsActivity.class);
                startActivity(intent);
            }
        });

        btn2Jugadores = findViewById(R.id.btn2jugadores);

        btn2Jugadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Locale.getDefault().getISO3Language().equals("eng")) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle("2 players");
                    alertDialog.setMessage("Introduce a word");

                    final EditText input = new EditText(MainActivity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    alertDialog.setView(input);

                    alertDialog.setPositiveButton("Play",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    String palabraAAdivinar = input.getText().toString();
                                    palabra = palabraAAdivinar;
                                    if ((palabra.length() >= 4 && palabra.length() <= 10) && (esSoloLetras(palabra))) {
                                        String palabraMayuscula = palabra.toUpperCase();
                                        Intent intent = new Intent(getApplicationContext(), MultiplayerActivity.class);
                                        intent.putExtra("palabraAAdivinar", palabraMayuscula);
                                        startActivity(intent);
                                        finish();
                                        Toast.makeText(getApplicationContext(),
                                                "Lets play!", Toast.LENGTH_SHORT).show();
                                    } else {
                                        dialog.cancel();
                                        Toast.makeText(getApplicationContext(),
                                                "Introduce a word which have from 4 to 10 letters.", Toast.LENGTH_SHORT).show();
                                    }
                                }

                            });

                    alertDialog.setNegativeButton("Close",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });

                    alertDialog.show();
                } else {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle("2 jugadores");
                    alertDialog.setMessage("Introduzca una palabra");

                    final EditText input = new EditText(MainActivity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    alertDialog.setView(input);

                    alertDialog.setPositiveButton("Jugar",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    String palabraAAdivinar = input.getText().toString();
                                    palabra = palabraAAdivinar;
                                    if ((palabra.length() >= 4 && palabra.length() <= 10) && (esSoloLetras(palabra))) {
                                        String palabraMayuscula = palabra.toUpperCase();
                                        Intent intent = new Intent(getApplicationContext(), MultiplayerActivity.class);
                                        intent.putExtra("palabraAAdivinar", palabraMayuscula);
                                        startActivity(intent);
                                        finish();
                                        Toast.makeText(getApplicationContext(),
                                                "¡A jugar!", Toast.LENGTH_SHORT).show();
                                    } else {
                                        dialog.cancel();
                                        Toast.makeText(getApplicationContext(),
                                                "Introduce una palabra que solo contenga letras de entre 4 y 10 caracteres", Toast.LENGTH_SHORT).show();
                                    }
                                }

                            });

                    alertDialog.setNegativeButton("Cerrar",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });

                    alertDialog.show();
                }
            }

        });

    }

    @Override
    public void onBackPressed() {
        if (Locale.getDefault().getISO3Language().equals("eng")) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
            alerta.setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog titulo = alerta.create();
            titulo.setTitle("You want to leave the application?");
            titulo.show();
        } else {
            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
            alerta.setCancelable(false).setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog titulo = alerta.create();
            titulo.setTitle("¿Desea salir de la aplicación?");
            titulo.show();
        }

    }

    static boolean esSoloLetras(String cadena) {
        //Recorremos cada caracter de la cadena y comprobamos si son letras.
        //Para comprobarlo, lo pasamos a mayuscula y consultamos su numero ASCII.
        //Si está fuera del rango 65 - 90, es que NO son letras.
        //Para ser más exactos al tratarse del idioma español, tambien comprobamos

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.toUpperCase().charAt(i);
            int valorASCII = (int) caracter;
            if (valorASCII < 65 || valorASCII > 90)
                return false; //Se ha encontrado un caracter que no es letra
        }

        //Terminado el bucle sin que se haya retornado false, es que todos los caracteres son letras
        return true;
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