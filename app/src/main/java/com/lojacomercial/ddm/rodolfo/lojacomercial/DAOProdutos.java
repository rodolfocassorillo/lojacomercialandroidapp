package com.lojacomercial.ddm.rodolfo.lojacomercial;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DAOProdutos {

    SQLiteDatabase db;
    public DAOProdutos(Context context){
        db = new BDCore(context).getWritableDatabase();
    }

    public void inserir(Produto produto){
        ContentValues values = new ContentValues();
        values.put("descricao", produto.getDescricao());
        values.put("codigo_barra", produto.getCodigoBarra());
        values.put("valor_custo", produto.getValorCusto());
        values.put("valor_venda", produto.getValorVenda());
        db.insert("produto", null, values);
    }

    public void alterar(Produto produto){
        ContentValues values = new ContentValues();
        values.put("descricao", produto.getDescricao());
        values.put("codigo_barra", produto.getCodigoBarra());
        values.put("valor_custo", produto.getValorCusto());
        values.put("valor_venda", produto.getValorVenda());
        db.update("produto", values, " id = "+produto.getId(), null);
    }

    public void remover(Produto produto){
        db.delete("produto"," id = "+produto.getId(), null);
    }

    public List<Produto> busarTodos(){
        List<Produto> produtos = new ArrayList<>();
        String[] colunas = {"id", "descricao", "codigo_barra", "valor_custo", "valor_venda"};
        Cursor cursor = db.query("produto", colunas, null, null, null,null, null);
        cursor.moveToFirst();
        for (int x=0; x<cursor.getCount(); x++){
            Produto produto = new Produto();
            produto.setId(cursor.getLong(0));
            produto.setDescricao(cursor.getString(1));
            produto.setCodigoBarra(cursor.getString(2));
            produto.setValorCusto(Double.valueOf(cursor.getString(3)));
            produto.setValorVenda(Double.valueOf(cursor.getString(4)));
            produtos.add(produto);
            cursor.moveToNext();
        }
        return produtos;
    }

    public Produto busarId(Long id){
        String[] colunas = {"id", "descricao", "codigo_barra", "valor_custo", "valor_venda"};
        Cursor cursor = db.query("produto", colunas, null, null, null,null, null);
        cursor.moveToFirst();
        Produto produto = new Produto();
        if(cursor.getCount() > 0) {
            produto.setId(cursor.getLong(0));
            produto.setDescricao(cursor.getString(1));
            produto.setCodigoBarra(cursor.getString(2));
            produto.setValorCusto(Double.valueOf(cursor.getString(3)));
            produto.setValorVenda(Double.valueOf(cursor.getString(4)));
        }
        return produto;
    }

}
