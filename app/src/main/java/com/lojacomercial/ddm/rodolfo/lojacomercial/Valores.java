package com.lojacomercial.ddm.rodolfo.lojacomercial;

import android.util.Log;

/**
 * Created by aluno on 16/04/18.
 */

public class Valores {

    private Long id = Long.valueOf(1);
    private String valores;
    private Moeda USD;

    public Valores(Long id, String valores, Moeda USD) {
        this.id = id;
        this.valores = valores;
        this.USD = USD;

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

    @Override
    public String toString() {
        return "Valores{" +
                "id=" + id +
                ", valores='" + valores + '\'' +
                ", USD=" + USD +
                '}';
    }
}
