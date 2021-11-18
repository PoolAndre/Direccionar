package com.example.direccionarotrasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton facebook, whatsapp, messenguer, buscador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook = findViewById(R.id.btnFacebook);
        whatsapp = findViewById(R.id.btnWhatsapp);
        messenguer = findViewById(R.id.btnMessenguer);
        buscador = findViewById(R.id.btnBuscador);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(facebook);
            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whatsapp = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(whatsapp);
            }
        });

        messenguer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent messenguer = getPackageManager().getLaunchIntentForPackage("com.facebook.orca");
                startActivity(messenguer);
            }
        });

        buscador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri google = Uri.parse("http://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }
        });

    }
}