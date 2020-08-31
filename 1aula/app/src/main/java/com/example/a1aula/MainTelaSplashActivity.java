package com.example.a1aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainTelaSplashActivity extends AppCompatActivity {
    private static final int tempotela = 2000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintelasplash);
        IniciazarTelaLogin();
    }
    private void IniciazarTelaLogin(){
        new Timer().schedule(new TimerTask(){
            @Override
            public void run(){
            finish();
            Intent TelaLogin = new Intent(getApplicationContext(),ActivityTelaLogin.class);
            startActivity(TelaLogin);
            }
        },tempotela);
    }


}