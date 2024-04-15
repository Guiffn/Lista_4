package br.edu.up.controles;

import br.edu.up.modelos.*;

public class ControleDePontos {

    private Pontos[] pontos = new Pontos[4];
    private int contador = 0;

    public void adicionarPonto(Pontos ponto) {
        if (contador < 4) {
            pontos[contador] = ponto;
            contador++;
        } else {
            System.out.println("Limite de pontos atingido!");
        }
    }

    public Pontos[] getPontos() {
        return pontos;
    }

    public void setPontos(Pontos[] pontos) {
        this.pontos = pontos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
