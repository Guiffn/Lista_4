package br.edu.up.modelos;

public class Contato {

    private int codigo;
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone, int codigo) {
        this.nome = nome;
        this.telefone = telefone;
        this.codigo = codigo;
    }

    public int setCodigo(int codigo) {
        return this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String setTelefone(String telefone) {
        return this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public String toString() {
        return "Nome: " + nome + " - Telefone: " + telefone + " - Código: " + codigo;
    }
}