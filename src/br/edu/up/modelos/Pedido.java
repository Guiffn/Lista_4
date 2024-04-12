package br.edu.up.modelos;

//O pedido é de um cliente
public class Pedido {

    private String numero, data;


    // O cliente do pedido
    private Cliente cliente;

    // O pedido foi realizado pelo garçom
    private Garcom garcom;

    // O garçom criar lista de itens do pedido
    private Item[] itens;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    

}
