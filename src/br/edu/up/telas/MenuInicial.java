package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.modelos.Pedido;
import br.edu.up.controles.ControleDePedidos;

public class MenuInicial {

    Scanner leitor = new Scanner(System.in);

    public void mostrar() {

        System.out.println();
        System.out.println("----------------");
        System.out.println("  MENU INICIAL");
        System.out.println("----------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();

        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Cadastrar Funcionário");
        System.out.println("...");
        System.out.println("5. Controle de Pedidos");
        System.out.println();

        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1:

                break;
            case 5: {
                mostrarMenuPedidos();
                break;
            }
            default:
                break;
        }
    }

    public void mostrarMenuPedidos() {

        System.out.println();
        System.out.println("----------------");
        System.out.println("  MENU PEDIDOS");
        System.out.println("----------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();

        System.out.println("1. Incluir Pedido");
        System.out.println("2. Editar Pedido");
        System.out.println("3. Listar Pedidos");
        System.out.println("4. Excluir Pedido");
        System.out.println("5. Voltar");
        System.out.println();

        int opcao = leitor.nextInt();

        ControleDePedidos controle = new ControleDePedidos();

        switch (opcao) {
            case 1:
                break;
            case 3: {
                // Listar Pedidos
                Pedido[] pedidos = controle.getPedidos();
                System.out.println("----- PEDIDOS -----");
                for (int i = 0; i < pedidos.length; i++) {
                    Pedido pedido = pedidos[i];
                    String str = "No. " + pedido.getNumero() + " Data: " + pedido.getData();
                    System.out.println(str);
                }

                break;
            }
            case 5:
            default:
                // Voltar para o menu inical
                break;
        }

    }

}
