package com.stomeo.finalguessed;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServicioMusica extends Service {

    private MediaPlayer miReproductor;

    @Override
    public void onCreate() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        miReproductor = MediaPlayer.create(this, R.raw.game);
        miReproductor.start();

        miReproductor.setLooping(true);

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        miReproductor.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
