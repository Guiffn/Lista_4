package br.edu.up.modelos;

public class Pessoal extends Contato {

    private String aniversario;

    public Pessoal(String nome, String telefone, String aniversario, int codigo) {
        super(nome, telefone, codigo);
        this.aniversario = aniversario;
    }

    public String getAniversario() {
        return aniversario;
    }

    public String setAniversario(String aniversario) {
        return this.aniversario = aniversario;
    }

    public String toString() {
        return "Nome: " + getNome() + " - Telefone: " + getTelefone() + " - Aniversário: " + aniversario + " - Código: "
                + getCodigo();
    }
}