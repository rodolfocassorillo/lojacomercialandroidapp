package com.lojacomercial.ddm.rodolfo.lojacomercial;

import android.util.Log;

/**
 * Created by aluno on 16/04/18.
 */

public class Valores {

    private Long id = Long.valueOf(1);
    private String valores;
    private Moeda USD;
    private Moeda EUR;
    private Moeda BTC;

    public Valores(Long id, String valores, Moeda USD, Moeda EUR, Moeda BTC) {
        this.id = id;
        this.valores = valores;
        this.USD = USD;
        this.EUR = EUR;
        this.BTC = BTC;

    }

    public Valores(){

    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Moeda getUSD() {
        return USD;
    }

    public void setUSD(Moeda USD) {
        this.USD = USD;
    }

    public Moeda getEUR() {
        return EUR;
    }

    public void setEUR(Moeda EUR) {
        this.EUR = EUR;
    }

    public Moeda getBTC() {
        return BTC;
    }

    public void setBTC(Moeda BTC) {
        this.BTC = BTC;
    }

    @Override
    public String toString() {
        return "Valores{" +
                "id=" + id +
                ", valores='" + valores + '\'' +
                ", USD=" + USD +
                ", EUR=" + EUR +
                ", BTC=" + BTC +
                '}';
    }
}
