package com.lojacomercial.ddm.rodolfo.lojacomercial;

/**
 * Created by aluno on 16/04/18.
 */

public class Moeda {

    private Long id = Long.valueOf(1);
    private String nome;
    private String valor;
    private String ultimaConsulta;
    private String fonte;
    private int imagem;

    public Moeda(Long id, String nome, String valor, String ultimaConsulta, String fonte, int imagem) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.ultimaConsulta = ultimaConsulta;
        this.fonte = fonte;
        this.imagem = imagem;
    }

    public Moeda(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getUltimaConsulta() {
        return ultimaConsulta;
    }

    public void setUltimaConsulta(String ultimaConsulta) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", ultimaConsulta=" + ultimaConsulta +
                ", fonte='" + fonte + '\'' +
                ", imagem=" + imagem +
                '}';
    }
}
