package com.lojacomercial.ddm.rodolfo.lojacomercial;

public class Cotacao {

    private Long id;
    private String status;
    private String valores;
    private String nome;
    private Long valor;
    private Long ultimaConsulta;
    private String fonte;
    private int imagem;

    public Cotacao(Long id, String status, String valores, String nome, Long valor, Long ultimaConsulta, String fonte, int imagem) {
        this.id = id;
        this.status = status;
        this.valores = valores;
        this.nome = nome;
        this.valor = valor;
        this.ultimaConsulta = ultimaConsulta;
        this.fonte = fonte;
        this.imagem = imagem;
    }

    public Cotacao(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Long getUltimaConsulta() {
        return ultimaConsulta;
    }

    public void setUltimaConsulta(Long ultimaConsulta) {
        this.ultimaConsulta = ultimaConsulta;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
