package com.example.androidexamplesharedpreferences;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private ListaCompras listaCompras;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editAnotacao);

        listaCompras = new ListaCompras(getApplicationContext());

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = editText.getText().toString();
            if (texto.equals("")){
                Snackbar.make(view, "Preencha com itens da lista de compras!", Snackbar.LENGTH_LONG).show();
            }else {
              listaCompras.salvarItem(texto);
                Snackbar.make(view, "Item salvo com sucesso!", Snackbar.LENGTH_LONG).show();
            }

            }
        });
    }

}