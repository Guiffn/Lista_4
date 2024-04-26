package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.modelos.Pontos;
import br.edu.up.controles.ControleDePontos;
import br.edu.up.modelos.Calculadora;

public class MenuInicial {

    Scanner leitor = new Scanner(System.in);

    public void mostrar() {
        System.out.println("Digite o valor de x1: ");
        double x1 = leitor.nextDouble();
        System.out.println("Digite o valor de y1: ");
        double y1 = leitor.nextDouble();

        System.out.println("Digite o valor de x2: ");
        double x2 = leitor.nextDouble();
        System.out.println("Digite o valor de y2: ");
        double y2 = leitor.nextDouble();

        Pontos ponto1 = new Pontos(x1, y1);
        Pontos ponto2 = new Pontos(x2, y2);

        ControleDePontos controle = new ControleDePontos();
        controle.adicionarPonto(ponto1);
        controle.adicionarPonto(ponto2);

        System.out.println("Pontos adicionados: ");
        for (Pontos p : controle.getPontos()) {
            if (p != null) { // Verifica se o ponto é nulo antes de acessá-lo
                System.out.println("X: " + p.getX() + " Y: " + p.getY());
            }
        }

        Calculadora calculadora = new Calculadora();

        double distancia = calculadora.calcularDistancia(ponto1, ponto2);
        System.out.println("Distância entre os pontos é: " + distancia);
    }
}
