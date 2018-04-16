package com.lojacomercial.ddm.rodolfo.lojacomercial;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDCore extends SQLiteOpenHelper {
    private static final String NOME="loja";
    private static final int VERSAO=1;

    public BDCore(Context context){
        super(context, NOME, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table produto(id integer " +
                "primary key autoincrement, descricao varchar(100), " +
                "codigo_barra varchar(100), valor_custo integer, valor_venda integer);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table produto;");
        onCreate(db);
    }
}
