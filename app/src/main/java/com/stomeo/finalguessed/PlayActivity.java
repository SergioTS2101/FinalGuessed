package com.stomeo.finalguessed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class PlayActivity extends AppCompatActivity {

    ImageButton btn;

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
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_4:
                if (checked) {
                    Intent intent = new Intent(this, FourLettersActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.radio_5:
                if (checked) {
                    Intent intent = new Intent(this, FiveLettersActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.radio_6:
                if (checked) {
                    Intent intent = new Intent(this, SixLettersActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.radio_7:
                if (checked) {
                    Intent intent = new Intent(this, SevenLettersActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.radio_8:
                if (checked) {
                    Intent intent = new Intent(this, EightLettersActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.radio_9:
                if (checked) {
                    Intent intent = new Intent(this, NineLettersActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.radio_10:
                if (checked) {
                    Intent intent = new Intent(this, TenLettersActivity.class);
                    startActivity(intent);
                }
                break;
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