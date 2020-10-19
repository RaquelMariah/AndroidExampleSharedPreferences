package com.example.androidexamplesharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class ListaCompras {
    private Context context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private final String NOME_ARQUIVO="item.preferencias";
    private final String CHAVE_NOME = "nome";

    public ListaCompras(Context c) {
        this.context = c;
        sharedPreferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = sharedPreferences.edit();
    }

    public void salvarItem(String item){
        editor.putString(CHAVE_NOME, item);
        editor.commit();
    }
    public String recuperarItem(){

        return sharedPreferences.getString(CHAVE_NOME,"");
    }
}
