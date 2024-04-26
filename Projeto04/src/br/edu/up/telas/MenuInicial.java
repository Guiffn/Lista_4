package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;
import br.edu.up.controles.ControlePeriodo;

public class MenuInicial {

    private Scanner scanner = new Scanner(System.in);
    private Estacionamento estacionamento = new Estacionamento();
    private ControlePeriodo controlePeriodo = new ControlePeriodo();

    public void mostrar() {
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("----------------------------");
            System.out.println("Bem-vindo ao estacionamento!");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("0 - Limpar estacionamento");
            System.out.println("1 - Registrar entrada de carro");
            System.out.println("2 - Registrar saída de carro");
            System.out.println("3 - Listar carros estacionados");
            System.out.println("4 - Controle de períodos");
            System.out.println("5 - Sair");
            System.out.println("----------------------------");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    limpar();
                    pausa();
                    break;
                case 1:
                    registrarEntrada();
                    pausa();
                    break;
                case 2:
                    registrarSaida();
                    pausa();
                    break;
                case 3:
                    listarCarros();
                    pausa();
                    break;
                case 4:
                    controlePeriodo.mostrar();
                    pausa();
                    break;
                case 5:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    pausa();
                    break;
            }
        } while (opcao != 5);
    }

    private void limpar() {
        estacionamento.limparEstacionamento();

        System.out.println(" ");
        System.out.println("Estacionamento limpo!");
    }

    private void registrarEntrada() {
        do {
            System.out.println("Digite o período do dia (matutino/vespertino/noturno): ");
            String periodo = scanner.next();

            System.out.println("Digite a placa do carro: ");
            String placa = scanner.next();

            System.out.println("Digite o modelo do carro: ");
            String modelo = scanner.next();

            System.out.println("Digite a cor do carro: ");
            String cor = scanner.next();

            Carro carro = new Carro(placa, modelo, cor, periodo);
            estacionamento.estacionarCarro(carro);

            controlePeriodo.registrarEntrada(periodo);

            System.out.println("Carro registrado com sucesso!");

            System.out.println("Deseja continuar registrando carros? (1 - Sim / 2 - Não)");
        } while (scanner.nextInt() == 1);
    }

    private void registrarSaida() {
        System.out.println("Digite a placa do carro que está saindo: ");
        String placa = scanner.next();
    }

    private void listarCarros() {
        System.out.println("Carros estacionados: ");
        for (Carro carro : estacionamento.getCarrosEstacionados()) {
            if (carro != null) {
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Período: " + carro.getPeriodo());
                System.out.println("----------------------------");
            }
        }
    }

    private void pausa() {
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }
}
