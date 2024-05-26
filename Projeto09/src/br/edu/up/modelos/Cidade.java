package br.edu.up.modelos;

import java.util.List;

public class Cidade extends Endereco {
    private String nome;
    private String uf;


    public Cidade(String rua, String numero, String bairro, String cep, List<Cidade> cidades, String nome, String uf) {
        super(rua, numero, bairro, cep, cidades);
        this.nome = nome;
        this.uf = uf;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "cidade='" + nome + '\'' +
                ", uf='" + uf + '\'' +
                ", rua='" + getRua() + '\'' +
                ", numero=" + getNumero() +
                ", bairro='" + getBairro() + '\'' +
                ", cep='" + getCep() + '\'' +
                '}';
    }
}

    

    
 
  
    
