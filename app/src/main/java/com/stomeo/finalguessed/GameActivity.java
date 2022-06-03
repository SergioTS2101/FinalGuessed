package com.stomeo.finalguessed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FourLettersActivity extends AppCompatActivity {

    ImageButton btn;
    Button noBtn;
    ImageView hangman;
    int cont = 0;
    TextView et1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_letters);

        btn = (ImageButton) findViewById(R.id.mainButton);
        noBtn = (Button) findViewById(R.id.btnNo);
        hangman = (ImageView) findViewById(R.id.hangman);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont++;
                if (cont == 0) {

                } else if (cont == 1) {
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
                    hangman.setImageResource(R.drawable.sexto_fallo);
                } else if (cont == 7) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.septimo_fallo);
                } else if (cont == 8) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.octavo_fallo);
                } else if (cont == 9) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.noveno_fallo);
                } else if (cont == 10) {
                    hangman.setVisibility(View.VISIBLE);
                    hangman.setImageResource(R.drawable.decimo_fallo);
                    Intent intent = new Intent(getApplicationContext(), GameOverActivity.class);
                    startActivity(intent);
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
}
