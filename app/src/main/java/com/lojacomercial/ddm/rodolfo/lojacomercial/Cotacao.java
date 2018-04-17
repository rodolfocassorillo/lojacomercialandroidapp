package com.lojacomercial.ddm.rodolfo.lojacomercial;

public class Cotacao {

    private Long id = Long.valueOf(1);
    private String status;
    private Valores valores;

    public Cotacao(String status, Valores valores) {
        this.id = id;
        this.status = status;
        this.valores = valores;

    }

    public Cotacao(){

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Valores getValores() {
        return valores;
    }

    public void setValores(Valores valores) {
        this.valores = valores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cotacao{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", valores=" + valores +
                '}';
    }
}
