package com.lojacomercial.ddm.rodolfo.lojacomercial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class CotacoesDia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotacoes_dia);

        BuscarCotacoesJson buscarCotacoesJson = new BuscarCotacoesJson(CotacoesDia.this);
        buscarCotacoesJson.execute("http://api.promasters.net.br/cotacao/v1/valores?moedas=USD&alt=json");

    }

}
