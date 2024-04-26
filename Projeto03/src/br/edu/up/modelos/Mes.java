package br.edu.up.modelos;

public class Mes {
    private String nome;
    private int qtdeDias;
    private Dia[] dias;

    public Mes(int qtdeDias, String nome) {
        this.qtdeDias = qtdeDias;
        this.nome = nome;
        this.dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            this.dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso(Compromisso compromisso, int diaMes) {
        dias[diaMes - 1].adicionarCompromisso(compromisso);
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {
        Compromisso novoCompromisso = new Compromisso(pessoa, local, assunto, hora);
        adicionarCompromisso(novoCompromisso, diaMes);
    }

    public void excluirCompromisso(int diaMes, int hora) {
        dias[diaMes - 1].excluirCompromisso(hora);
    }

    public void listarCompromisso(int diaMes) {
        dias[diaMes - 1].listarCompromisso();
    }

    public void listarCompromisso() {
        System.out.println("Compromissos do mês de " + nome + ":");
        for (Dia dia : dias) {
            dia.listarCompromisso();
        }
    }
}
