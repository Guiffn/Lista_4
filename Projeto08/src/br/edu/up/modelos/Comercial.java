package br.edu.up.modelos;

public class Comercial extends Contato {

    private String cnpj;

    public Comercial(String nome, String telefone, String cnpj, int codigo) {
        super(nome, telefone, codigo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String setCnpj(String cnpj) {
        return this.cnpj = cnpj;
    }

    public String toString() {
        return "Nome: " + getNome() + " - Telefone: " + getTelefone() + " - CNPJ: " + cnpj + " - Código: "
                + getCodigo();
    }
}