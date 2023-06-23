package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtSaludo = (TextView)findViewById(R.id.txtInfo);

        Bundle bundle = this.getIntent().getExtras();

        txtSaludo.setText("Bienvenido \n " +
                bundle.getString("NOMBRE") + "\nCédula: " +
                bundle.getString("CEDULA") + "\nFecha de Nacimiento: " +
                bundle.getString("FECHA") + "\nTélefono: " +
                bundle.getString("TELEFONO") + "\nCiudad: " +
                bundle.getString("CIUDAD")+ "\nGénero: " +
                bundle.getString("GENERO")+ "\nCorreo: " +
                bundle.getString("CORREO"));
    }


}