package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btEnviar(View view){

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);    EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtCedula = (EditText)findViewById(R.id.txtCedula);
        EditText txtFecha = (EditText)findViewById(R.id.txtFecha);
        EditText txtTelf = (EditText)findViewById(R.id.txtTelf);
        EditText txtCiudad = (EditText)findViewById(R.id.txtCiudad);
        EditText txtCorreo = (EditText)findViewById(R.id.txtCorreo);RadioButton rdMasc = (RadioButton)findViewById(R.id.rdMasc);

        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("CEDULA", txtCedula.getText().toString());
        b.putString("FECHA", txtFecha.getText().toString());
        b.putString("TELEFONO", txtTelf.getText().toString());
        b.putString("CIUDAD", txtCiudad.getText().toString());
        b.putString("CORREO", txtCorreo.getText().toString());
        b.putString("GENERO",(rdMasc.isChecked()?"Masculino":"Femenino"));
        intent.putExtras(b);
        startActivity(intent);
    }

    public void btBorrar(View view) {
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtCedula = (EditText)findViewById(R.id.txtCedula);
        EditText txtFecha = (EditText)findViewById(R.id.txtFecha);
        EditText txtTelf = (EditText)findViewById(R.id.txtTelf);
        EditText txtCiudad = (EditText)findViewById(R.id.txtCiudad);
        EditText txtCorreo = (EditText)findViewById(R.id.txtCorreo);
        txtCedula.setText("");
        RadioGroup rdGroup = (RadioGroup)findViewById(R.id.rdGroup);
        txtCiudad.setText("");
        txtCorreo.setText("");
        txtFecha.setText("");
        txtTelf.setText("");
        txtNombre.setText("");
        rdGroup.clearCheck();
    }
}


