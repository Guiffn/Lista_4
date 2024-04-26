package br.edu.up.modelos;

public class Calculadora {

    public double calcularDistancia(Pontos ponto1, Pontos ponto2) {
        double distancia = Math
                .sqrt(Math.pow((ponto2.getX() - ponto1.getX()), 2) + Math.pow((ponto2.getY() - ponto1.getY()), 2));
        return distancia;
    }
}