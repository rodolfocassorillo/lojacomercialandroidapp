package com.lojacomercial.ddm.rodolfo.lojacomercial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BuscarCotacoesJson buscarCotacoesJson = new BuscarCotacoesJson(MainActivity.this);
        buscarCotacoesJson.execute("http://api.promasters.net.br/cotacao/v1/valores?moedas=USD,EUR,BTC&alt=json");

    }

    public void atualizar(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        
        if
        Toast.makeText(this, "Valores Atualizados", Toast.LENGTH_SHORT).show();
    }

}
