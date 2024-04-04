package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button comprarButton = findViewById(R.id.button_url1);

        comprarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://okdiario.com/recetas/helado-arandanos-casero-55741"));

                startActivity(intent);
            }
        });
        Button comprarButton_2 = findViewById(R.id.button_url2);

        comprarButton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://okdiario.com/lista/5-mejores-jugadores-baloncesto-historia-4350777"));

                startActivity(intent);
            }
        });
        Button comprarButton_3 = findViewById(R.id.button_url3);

        comprarButton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://musicalesbucaramanga.com/shop/guitarras/guitarras-acusticas/linea-de-estudio/guitarra-marcante-hecha-a-mano-2/"));

                startActivity(intent);
            }
        });
    }
}