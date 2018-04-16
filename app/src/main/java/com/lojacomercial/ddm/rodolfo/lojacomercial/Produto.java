package com.lojacomercial.ddm.rodolfo.lojacomercial;

public class Produto {

    private long id;
    private String descricao;
    private String codigoBarra;
    private Double valorCusto;
    private Double valorVenda;

    public Produto(long id, String descricao, String codigoBarra, Double valorCusto, Double valorVenda) {
        this.id = id;
        this.descricao = descricao;
        this.codigoBarra = codigoBarra;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
    }

    public Produto(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
}
