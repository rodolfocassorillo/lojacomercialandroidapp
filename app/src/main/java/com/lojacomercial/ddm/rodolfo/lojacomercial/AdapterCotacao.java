package com.lojacomercial.ddm.rodolfo.lojacomercial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterCotacao extends BaseAdapter {

    Context context;
    List<Cotacao> cotacoes;

    public AdapterCotacao(Context context, List<Cotacao> cotacoes) {
        this.context = context;
        this.cotacoes = cotacoes;
    }

    @Override
    public int getCount() {
        return cotacoes.size();
    }

    @Override
    public Object getItem(int position) {
       return cotacoes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return cotacoes.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewLinha = LayoutInflater.from(context).inflate(R.layout.activity_main, parent, false);
        //ImageView imagemUSD = (ImageView) viewLinha.findViewById(R.id.imageDollar);
        TextView nomeMoedaDollar = (TextView) viewLinha.findViewById(R.id.txNomeMoeda);
        TextView valorMoedaDollar = (TextView) viewLinha.findViewById(R.id.txValorMoeda);
        TextView nomeMoedaEUR = (TextView) viewLinha.findViewById(R.id.txNomeMoedaEuro);
        TextView valorMoedaEUR = (TextView) viewLinha.findViewById(R.id.txValorMoedaEuro);
        TextView nomeMoedaBTC = (TextView) viewLinha.findViewById(R.id.txNomeMoedaBTC);
        TextView valorMoedaBTC = (TextView) viewLinha.findViewById(R.id.txValorMoedaBTC);
        Cotacao cotacao = cotacoes.get(position);
        //imagemUSD.setImageResource(cotacao.getValores().getUSD().getImagem());
        if(cotacao != null){
            nomeMoedaDollar.setText(cotacao.getValores().getUSD().getNome());
            valorMoedaDollar.setText(cotacao.getValores().getUSD().getValor().toString());
            nomeMoedaEUR.setText(cotacao.getValores().getEUR().getNome());
            valorMoedaEUR.setText(cotacao.getValores().getEUR().getValor().toString());
            nomeMoedaBTC.setText(cotacao.getValores().getBTC().getNome());
            valorMoedaBTC.setText(cotacao.getValores().getBTC().getValor().toString());
        }else {
            nomeMoedaDollar.setText("Dólar");
            valorMoedaDollar.setText("0");
            nomeMoedaEUR.setText("Euro");
            valorMoedaEUR.setText("0");
            nomeMoedaBTC.setText("BitCoin");
            valorMoedaBTC.setText("0");
        }
        return viewLinha;
    }

}
