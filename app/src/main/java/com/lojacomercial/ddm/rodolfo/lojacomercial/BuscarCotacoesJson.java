package com.lojacomercial.ddm.rodolfo.lojacomercial;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BuscarCotacoesJson extends AsyncTask<String,Integer,String> {

    Activity activity;
    ProgressBar progressBar;

    public BuscarCotacoesJson(Activity activity){
        this.activity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressBar = (ProgressBar) activity.findViewById(R.id.progressBarCotacoes);
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Gson gson = new Gson();
        Cotacao cotacoes = gson.fromJson(s, Cotacao.class);
        Log.i("BuscarCotacoes",""+cotacoes);
        if (cotacoes != null){
        TextView nomeMoeda = (TextView) activity.findViewById(R.id.txNomeMoeda);
        TextView valorMoeda = (TextView) activity.findViewById(R.id.txValorMoeda);
        TextView nomeMoedaEuro = (TextView) activity.findViewById(R.id.txNomeMoedaEuro);
        TextView valorMoedaEuro = (TextView) activity.findViewById(R.id.txValorMoedaEuro);
        TextView nomeMoedaBTC = (TextView) activity.findViewById(R.id.txNomeMoedaBTC);
        TextView valorMoedaBTC = (TextView) activity.findViewById(R.id.txValorMoedaBTC);
        nomeMoeda.setText(cotacoes.getValores().getUSD().getNome());
        valorMoeda.setText(cotacoes.getValores().getUSD().getValor());
        nomeMoedaEuro.setText(cotacoes.getValores().getEUR().getNome());
        valorMoedaEuro.setText(cotacoes.getValores().getEUR().getValor());
        nomeMoedaBTC.setText(cotacoes.getValores().getBTC().getNome());
        valorMoedaBTC.setText(cotacoes.getValores().getBTC().getValor());
        }else{
            TextView nomeMoeda = (TextView) activity.findViewById(R.id.txNomeMoeda);
            TextView valorMoeda = (TextView) activity.findViewById(R.id.txValorMoeda);
            TextView nomeMoedaEuro = (TextView) activity.findViewById(R.id.txNomeMoedaEuro);
            TextView valorMoedaEuro = (TextView) activity.findViewById(R.id.txValorMoedaEuro);
            TextView nomeMoedaBTC = (TextView) activity.findViewById(R.id.txNomeMoedaBTC);
            TextView valorMoedaBTC = (TextView) activity.findViewById(R.id.txValorMoedaBTC);
            nomeMoeda.setText("Dólar");
            valorMoeda.setText("0");
            nomeMoedaEuro.setText("Euro");
            valorMoedaEuro.setText("0");
            nomeMoedaBTC.setText("BitCoin");
            valorMoedaBTC.setText("0");
        }
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected String doInBackground(String... strings) {
        String jsonRetorno = null;
        try{
            URL url = new URL(strings[0]);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream stream = null;
            try {
                stream = new BufferedInputStream(urlConnection.getInputStream());

            } finally {
                urlConnection.disconnect();
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder builder = new StringBuilder();
            String linha;
            while ((linha = bufferedReader.readLine()) != null){
                builder.append(linha);
            }
            jsonRetorno = builder.toString();
            Log.i("BuscarCotacoes","JSON:: "+jsonRetorno);
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        Log.i("BuscarCotacoes","JSON Return:: "+jsonRetorno);
        return jsonRetorno;
    }

}
