package br.edu.up.modelos;

public class Comandante extends Tripulacao {
    private int horasVoo;

    public Comandante(String nome, String rg, String nacionalidade, String identificacaoAeronautica,
            String matriculaFuncionario, int horasVoo) {
        super(nome, rg, nacionalidade, identificacaoAeronautica, matriculaFuncionario);
        this.horasVoo = horasVoo;
    }

    public int getHorasVoo() {
        return horasVoo;
    }

    public void setHorasVoo(int horasVoo) {
        this.horasVoo = horasVoo;
    }
}
