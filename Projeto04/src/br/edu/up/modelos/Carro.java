package br.edu.up.modelos;

public class Carro {

    private String placa;
    private String modelo;
    private String cor;
    private String periodo;

    public Carro(String placa, String modelo, String cor, String periodo) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.periodo = periodo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPeriodo() {
        return periodo;
    }
}
