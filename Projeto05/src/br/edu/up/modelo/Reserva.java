package br.edu.up.modelo;

public class Reserva {
    private String nomeResponsavel;
    private int quantidadePessoas;
   

    public Reserva(String nomeResponsavel, int quantidadePessoas, String dataReserva, double valorTotal) {
        this.nomeResponsavel = nomeResponsavel;
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

         
}