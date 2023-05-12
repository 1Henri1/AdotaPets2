package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //  CRIANDO O CARREGAMENTO DA JANELA DE LOGIN
        // HANDLER -> THREAD PROCESSO EM BACKGROUND

        // INSTANCIAR UM RUNNABLE

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),
                        Login_Activity.class));
                finish(); // FECHA JANELA ATUAL
            }
        }, 3000);
    }
}