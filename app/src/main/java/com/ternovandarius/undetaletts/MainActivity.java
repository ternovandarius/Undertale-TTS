package com.ternovandarius.undetaletts;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;



public class MainActivity extends AppCompatActivity {


    SoundPool mySoundPool;
    int soundSans, soundPapyrus, soundAsgore, soundFlowey, soundUndyne, soundToriel, soundAlphys,
            soundAsriel, soundGeneric1, soundGeneric2,
            soundRalsei, soundSusie, soundJevil, soundNoelle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_NAVIGATION_GUIDANCE)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            mySoundPool = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(audioAttributes).build();
        } else {
            mySoundPool=new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        }

        soundSans = mySoundPool.load(this, R.raw.snd_txtsans, 1);
        soundPapyrus = mySoundPool.load(this, R.raw.snd_txtpap, 1);
        soundAsgore = mySoundPool.load(this, R.raw.snd_txtasg, 1);
        soundFlowey = mySoundPool.load(this, R.raw.snd_floweytalk1, 1);
        soundUndyne = mySoundPool.load(this, R.raw.snd_txtund, 1);
        soundToriel = mySoundPool.load(this, R.raw.snd_txttor, 1);
        soundAlphys = mySoundPool.load(this, R.raw.voice_alphys, 1);
        soundAsriel = mySoundPool.load(this, R.raw.voice_asriel, 1);
        soundGeneric1 = mySoundPool.load(this, R.raw.snd_txt1, 1);
        soundGeneric2 = mySoundPool.load(this, R.raw.snd_txt2, 1);
        soundRalsei = mySoundPool.load(this, R.raw.snd_txtral, 1);
        soundSusie = mySoundPool.load(this, R.raw.snd_txtsus, 1);
        soundJevil = mySoundPool.load(this, R.raw.snd_txtjok, 1);
        soundNoelle = mySoundPool.load(this, R.raw.snd_txtnoe, 1);
    }

    public void playOnClick(View view) {
        EditText textToSpeech = findViewById(R.id.textToConvert);
        final String convertedText = textToSpeech.getText().toString();
        Button playButton = findViewById(R.id.speakButton);
        Spinner spinner = findViewById(R.id.spinner);
        String text = spinner.getSelectedItem().toString();
        switch (text) {
            case "Sans":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundSans, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundSans, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Papyrus":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundPapyrus, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundPapyrus, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Asgore":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundAsgore, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundAsgore, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Flowey":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundFlowey, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundFlowey, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Undyne":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundUndyne, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundUndyne, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Toriel":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundToriel, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundToriel, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Alphys":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundAlphys, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundAlphys, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Asriel":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundAsriel, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundAsriel, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Generic 1":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundGeneric1, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundGeneric1, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Generic 2":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundGeneric2, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundGeneric2, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Ralsei":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundRalsei, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundRalsei, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Susie":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundSusie, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundSusie, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Jevil":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundJevil, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundJevil, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
            case "Noelle":
                playButton.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (char c : convertedText.toCharArray()) {
                            if (Character.isLetterOrDigit(c)) {
                                mySoundPool.play(soundNoelle, 1, 1, 0, 0, 1);
                                try {
                                    Thread.sleep(30);
                                }catch (Exception e){};
                            }
                            else{
                                try {
                                    Thread.sleep(100);
                                }catch (Exception e){};
                            }
                        }
                        mySoundPool.play(soundNoelle, 1, 1, 0, 0, 1);
                    }
                }).start();
                playButton.setEnabled(true);
                break;
        }
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        mySoundPool.release();
        mySoundPool = null;
    }
}