package com.example.jessica.arsys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button registroEmpresaButton;
    private Button inicioSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       inicioSesion = (Button) findViewById(R.id.buttonIniciarSesion);
        inicioSesion.setOnClickListener(clicInicioSesion);
    }

    View.OnClickListener clicInicioSesion = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inicioS = new Intent(MainActivity.this, MenuActivity.class);
            inicioS.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(inicioS);
        }
    };
}
