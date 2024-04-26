package br.edu.up.controles;

import java.util.Scanner;

public class ControlePeriodo {

    private int carrosMatutino = 0;
    private int carrosVespertino = 0;
    private int carrosNoturno = 0;

    public void mostrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual período deseja emitir um relatório?");
        System.out.println("1 - Matutino");
        System.out.println("2 - Vespertino");
        System.out.println("3 - Noturno");
        System.out.println("4 - Sair");

        int controle = scanner.nextInt();

        switch (controle) {
            case 1:
                Matutino();
                break;
            case 2:
                Vespertino();
                break;
            case 3:
                Noturno();
                break;
            case 4:
                System.out.println("Até mais!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private void Matutino() {
        System.out.println("Relatório do período Matutino");
        System.out.println("A quantidade de carros que entraram no período matutino foi de: " + carrosMatutino);
    }

    private void Vespertino() {
        System.out.println("Relatório do período Vespertino");
        System.out.println("A quantidade de carros que entraram no período vespertino foi de: " + carrosVespertino);
    }

    private void Noturno() {
        System.out.println("Relatório do período Noturno");
        System.out.println("A quantidade de carros que entraram no período noturno foi de: " + carrosNoturno);
    }

    public void registrarEntrada(String periodo) {
        switch (periodo.toLowerCase()) {
            case "matutino":
                carrosMatutino++;
                break;
            case "vespertino":
                carrosVespertino++;
                break;
            case "noturno":
                carrosNoturno++;
                break;
            default:
                System.out.println("Período inválido!");
                break;
        }
    }
}
