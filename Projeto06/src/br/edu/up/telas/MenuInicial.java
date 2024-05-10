package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.controles.ControleRegistros;

public class MenuInicial {

    private Scanner scanner = new Scanner(System.in);
    private ControleRegistros controleRegistros = new ControleRegistros();

    public void mostrar() {
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("----------------------------");
            System.out.println("Bem-vindo a Emirates Airlines!");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("0 - Limpar registros");
            System.out.println("1 - Registrar passageiro");
            System.out.println("2 - Registrar tripulação");
            System.out.println("3 - Exibir registros");
            System.out.println("4 - Sair");
            System.out.println("----------------------------");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    limpar();
                    pausa();
                    break;
                case 1:
                    registrarPassageiro();
                    pausa();
                    break;
                case 2:
                    registrarTripulacao();
                    pausa();
                    break;
                case 3:
                    controleRegistros.mostrar();
                    pausa();
                    break;
                case 4:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    pausa();
                    break;
            }
        } while (opcao != 4);
    }

    private void limpar() {
        controleRegistros.limparRegistros();
        System.out.println("Registros limpos!");
    }

    private void registrarPassageiro() {
        System.out.println("Digite o nome do passageiro: ");
        String nome = scanner.next();

        System.out.println("Digite o RG do passageiro: ");
        String rg = scanner.next();

        System.out.println("Digite a nacionalidade do passageiro: ");
        String nacionalidade = scanner.next();

        System.out.println("Digite o identificador de bagagem: ");
        String identificadorBagagem = scanner.next();

        System.out.println("Digite o número do assento: ");
        String numeroAssento = scanner.next();

        System.out.println("Digite a classe do assento: ");
        String classeAssento = scanner.next();

        System.out.println("Digite a data do voo (Exemplo: 23/02/2024): ");
        String dataVoo = scanner.next();

        controleRegistros.adicionarRegistro("Passageiro: " + nome + ", RG: " + rg + ", Nacionalidade: " + nacionalidade
                + ", Identificador de Bagagem: " + identificadorBagagem + ", Número do Assento: " + numeroAssento
                + ", Classe do Assento: " + classeAssento + ", Data do Voo: " + dataVoo);

        System.out.println("Passageiro registrado com sucesso!");
    }

    private void registrarTripulacao() {
        System.out.println("O registrado é comandante? (1 - Sim / 2 - Não)");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do comandante: ");
                String nomeComandante = scanner.next();

                System.out.println("Digite o RG do comandante: ");
                String rgComandante = scanner.next();

                System.out.println("Digite a nacionalidade do comandante: ");
                String nacionalidadeComandante = scanner.next();

                System.out.println("Digite a identificação aeronáutica: ");
                String identificacaoAeronauticaComandante = scanner.next();

                System.out.println("Digite a matrícula aeronáutica: ");
                String matriculaFuncionarioComandante = scanner.next();

                System.out.println("Digite o total de horas de voo: ");
                int horasVooComandante = scanner.nextInt();

                System.out.println("Digite a data do voo (Exemplo: 23/02/2024): ");
                String dataVooComandante = scanner.next();

                controleRegistros.adicionarRegistro("Comandante: " + nomeComandante + ", RG: " + rgComandante
                        + ", Nacionalidade: " + nacionalidadeComandante + ", Identificação Aeronáutica: "
                        + identificacaoAeronauticaComandante + ", Matrícula Aeronáutica: "
                        + matriculaFuncionarioComandante + ", Horas de Voo: " + horasVooComandante + ", Data do Voo: "
                        + dataVooComandante);

                System.out.println("Comandante registrado com sucesso!");
                break;

            case 2:
                System.out.println("Digite o nome do comissário: ");
                String nomeComissario = scanner.next();

                System.out.println("Digite o RG do comissário: ");
                String rgComissario = scanner.next();

                System.out.println("Digite a nacionalidade do comissário: ");
                String nacionalidadeComissario = scanner.next();

                System.out.println("Digite a identificação aeronáutica: ");
                String identificacaoAeronauticaComissario = scanner.next();

                System.out.println("Digite a matrícula aeronáutica: ");
                String matriculaFuncionarioComissario = scanner.next();

                controleRegistros.adicionarRegistro("Comissário: " + nomeComissario + ", RG: " + rgComissario
                        + ", Nacionalidade: " + nacionalidadeComissario + ", Identificação Aeronáutica: "
                        + identificacaoAeronauticaComissario + ", Matrícula Aeronáutica: "
                        + matriculaFuncionarioComissario);

                System.out.println("Comissário registrado com sucesso!");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private void pausa() {
        System.out.println("Pressione Enter para continuar...");
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        } else {
            System.out.println("Erro ao pausar. Nenhuma entrada disponível.");
        }
    }

    public static void main(String[] args) {
        MenuInicial menu = new MenuInicial();
        menu.mostrar();
    }
}
