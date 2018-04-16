package com.lojacomercial.ddm.rodolfo.lojacomercial;

import android.app.Activity;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CotacaoAtual extends AsyncTask<String,Integer,String> {

    Activity activity;
    ProgressBar progressBar;

    public CotacaoAtual(CotacoesDia activity){
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
        List<Cotacao> cotacoes = gson.fromJson(s, new TypeToken<List<Cotacao>>(){}.getType());
        AdapterCotacao adapterCotacao = new AdapterCotacao(activity, cotacoes);
        ListView listView = (ListView) activity.findViewById(R.id.listViewCotacoes);
        listView.setAdapter(adapterCotacao);
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
            InputStream stream = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder builder = new StringBuilder();
            String linha;
            while ((linha = bufferedReader.readLine()) != null){
                builder.append(linha);
            }
            jsonRetorno = builder.toString();
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return jsonRetorno;
    }

}
