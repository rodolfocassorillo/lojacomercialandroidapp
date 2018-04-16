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
        View viewLinha = LayoutInflater.from(context).inflate(R.layout.linha_cotacoes, parent, false);
        ImageView imagemValor = (ImageView) viewLinha.findViewById(R.id.imageLogo);
        TextView nomeValor = (TextView) viewLinha.findViewById(R.id.txNomeCotacao);
        TextView valorCotacao = (TextView) viewLinha.findViewById(R.id.txValorCotacao);
        Cotacao cotacao = cotacoes.get(position);
        imagemValor.setImageResource(cotacao.getImagem());
        nomeValor.setText(cotacao.getNome());
        valorCotacao.setText(cotacao.getValor().toString());
        return viewLinha;
    }

}
