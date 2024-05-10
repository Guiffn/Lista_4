package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleRegistros {

    private List<String> registros = new ArrayList<>();

    public List<String> getRegistros() {
        return registros;
    }

    public void mostrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual tipo de registro deseja visualizar?");
        System.out.println("1 - Passageiros");
        System.out.println("2 - Tripulação");
        System.out.println("3 - Sair");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                mostrarPassageiros();
                break;
            case 2:
                mostrarTripulacao();
                break;
            case 3:
                System.out.println("Até mais!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }

    private void mostrarPassageiros() {
        System.out.println("Registros de Passageiros:");
        for (String registro : registros) {
            if (registro.startsWith("Passageiro")) {
                System.out.println(registro);
            }
        }
    }

    private void mostrarTripulacao() {
        System.out.println("Registros de Tripulação:");
        for (String registro : registros) {
            if (registro.startsWith("Tripulação")) {
                System.out.println(registro);
            }
        }
    }

    public void adicionarRegistro(String registro) {
        registros.add(registro);
    }

    public void limparRegistros() {
        registros.clear();
    }
}
