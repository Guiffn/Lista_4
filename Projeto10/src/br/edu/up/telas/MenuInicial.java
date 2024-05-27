package br.edu.up.telas;

import java.util.List;
import java.util.Scanner;

import br.edu.up.modelos.Segurado;
import br.edu.up.modelos.Seguro;
import br.edu.up.controles.ExcluirSeguro;
import br.edu.up.controles.ExcluirTodosSeg;
import br.edu.up.controles.ListarSeguros;
import br.edu.up.controles.VerQtdSeg;

public class MenuInicial {

    private Scanner scanner = new Scanner(System.in);
    private List<Seguro> seguros;

    public MenuInicial(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    public MenuInicial() {

    }

    public void mostrar() {
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("----------------------------");
            System.out.println("Bem-vindo à agenda de seguros!");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Incluir um seguro");
            System.out.println("2 - Localizar um seguro");
            System.out.println("3 - Excluir um seguro");
            System.out.println("4 - Excluir todos os seguros");
            System.out.println("5 - Listar todos os seguros");
            System.out.println("6 - Ver quantidade de seguros");
            System.out.println("7 - Sair do programa");
            System.out.println("----------------------------");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    ExcluirSeguro excluirSeguro = new ExcluirSeguro();
                    excluirSeguro.excluirSeguro(seguros);
                    break;
                case 4:
                    ExcluirTodosSeg excluirTodosSeg = new ExcluirTodosSeg();
                    excluirTodosSeg.excluirTodosSeg(seguros);
                    break;
                case 5:
                    ListarSeguros listarSeguros = new ListarSeguros();
                    listarSeguros.listarSeguros(seguros);
                    break;
                case 6:
                    VerQtdSeg verQtdSeg = new VerQtdSeg();
                    verQtdSeg.verQtdSeg(seguros);
                    break;
                case 7:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println("Aperte ENTER para continuar...");
            scanner.nextLine();

        } while (opcao != 7);
    }

    private void incluirSeguro() {
        System.out.println("Digite os dados do seguro:");
        System.out.print("Número da apólice: ");
        String apolice = scanner.nextLine();
        System.out.print("Nome do segurado: ");
        String nomeSegurado = scanner.nextLine();
        System.out.print("Valor da apólice: ");
        double valorApolice = scanner.nextDouble();
        scanner.nextLine();

        Seguro novoSeguro = new Seguro(apolice, new Segurado(nomeSegurado, nomeSegurado, nomeSegurado, nomeSegurado,
                nomeSegurado, nomeSegurado, nomeSegurado, nomeSegurado), valorApolice, null, null);
        seguros.add(novoSeguro);
        System.out.println("Seguro incluído com sucesso!");
    }

    private void localizarSeguro() {
        System.out.println("Digite o número da apólice do seguro que deseja localizar: ");
        String apolice = scanner.nextLine();

        boolean encontrado = false;
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                System.out.println("Seguro encontrado:");
                System.out.println(seguro.getDados());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Seguro não encontrado!");
        }
    }
}
