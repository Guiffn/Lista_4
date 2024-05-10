package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.controles.ControleDeEventos;
import br.edu.up.controles.ControleDeReservas;
import br.edu.up.modelo.Evento;
import br.edu.up.modelo.Reserva;

public class MenuInicial {
    private Scanner leitor;
    private ControleDeEventos controleEventos;
    private ControleDeReservas controleReservas;
    private Reserva[] reservas;
    private Evento[] eventos;

    public MenuInicial() {
        leitor = new Scanner(System.in);
        controleEventos = new ControleDeEventos(100); // Defina o tamanho máximo conforme necessário
        controleReservas = new ControleDeReservas(100); // Defina o tamanho máximo conforme necessário
    }

    public void mostrar() {
        int opcao;

        do {
            System.out.println("\n----------------");
            System.out.println("  MENU PEDIDOS");
            System.out.println("----------------");
            System.out.println("Digite a opção desejada:");
            System.out.println("1. Incluir Evento");
            System.out.println("2. Incluir Reserva");
            System.out.println("3. Alterar Eventos");
            System.out.println("4. Alterar Reservas");
            System.out.println("5. Listar Eventos");
            System.out.println("6. Listar Reservas");
            System.out.println("7. Excluir Eventos");
            System.out.println("8. Excluir Reservas");
            System.out.println("9. Sair\n");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    incluirEvento();
                    break;
                case 2:
                    incluirReserva();
                    break;
                case 3:
                    alterarEvento();
                    break;
                case 4:
                    alterarReserva();
                    break;
                case 5:
                    listarEventos();
                    break;
                case 6:
                    listarReservas();
                    break;
                case 7:
                    controleEventos.excluirEvento();
                    break;
                case 8:
                    controleReservas.excluirReserva();

                    break;
                case 9:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
    }

    private void incluirEvento() {
        System.out.println("Digite o nome do evento:");
        String nome = leitor.next();
        System.out.println("Digite a data do evento:");
        String data = leitor.next();
        System.out.println("Digite o local do evento:");
        String local = leitor.next();
        System.out.println("Digite a lotação máxima do evento:");
        int lotacaoMaxima = leitor.nextInt();
        System.out.println("Digite o preço do ingresso:");
        double precoIngresso = leitor.nextDouble();

        Evento evento = new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
        controleEventos.adicionarEvento(evento);
    }

    private void incluirReserva() {
        System.out.println("Digite o nome do responsável pela reserva:");
        String nomeResponsavel = leitor.next();
        System.out.println("Digite a quantidade de pessoas:");
        int quantidadePessoas = leitor.nextInt();
        System.out.println("Digite a data da reserva:");
        String dataReserva = leitor.next();
        System.out.println("Digite o valor total da reserva:");
        double valorTotal = leitor.nextDouble();

        Reserva reserva = new Reserva(nomeResponsavel, quantidadePessoas, dataReserva, valorTotal);
        controleReservas.adicionarReserva(reserva);
    }

    private void alterarEvento() {
        System.out.println("Digite o nome do evento que deseja alterar:");
        String nomeEvento = leitor.next();
        Evento evento = controleEventos.buscarEvento(nomeEvento);

        if (evento != null) {
            System.out.println("Digite os novos dados do evento:");
            System.out.println("Nome:");
            String novoNome = leitor.next();
            System.out.println("Data:");
            String novaData = leitor.next();
            System.out.println("Local:");
            String novoLocal = leitor.next();
            System.out.println("Lotação Máxima:");
            int novaLotacaoMaxima = leitor.nextInt();

            controleEventos.alterarEvento(nomeEvento, novoNome, novaData, novoLocal, novaLotacaoMaxima);
            System.out.println("Evento alterado com sucesso!");
        } else {
            System.out.println("Evento não encontrado.");
        }
    }

    private void alterarReserva() {
        System.out.println("Digite o nome do responsável pela reserva que deseja alterar:");
        String nomeResponsavelReserva = leitor.next();
        Reserva reserva = controleReservas.buscarReserva(nomeResponsavelReserva);

        if (reserva != null) {
            System.out.println("Digite os novos dados da reserva:");
            System.out.println("Nome do responsável:");
            String novoNomeResponsavel = leitor.next();
            System.out.println("Quantidade de pessoas:");
            int novaQuantidadePessoa = leitor.nextInt();

            controleReservas.alterarReserva(nomeResponsavelReserva, novoNomeResponsavel, novaQuantidadePessoa);
            System.out.println("Reserva alterada com sucesso!");
        } else {
            System.out.println("Reserva não encontrada.");
        }
    }

    public void listarReservas() {
        Reserva[] reservas = controleReservas.getReservas();
        if (reservas.length > 0) {
            System.out.println("As reservas são:");
            for (Reserva reserva : reservas) {
                if (reserva != null) {
                    System.out.println("Nome do responsável: " + reserva.getNomeResponsavel()
                            + ", quantidade de pessoas: " + reserva.getQuantidadePessoas());
                }
            }
        } else {
            System.out.println("Não há reservas cadastradas.");
        }
    }

    public void listarEventos() {
        Evento[] eventos = controleEventos.getEventos();
        if (eventos.length > 0) {
            System.out.println("Os eventos listados são:");
            for (Evento evento : eventos) {
                if (evento != null) {
                    System.out.println("Nome do evento: " + evento.getNome());
                    System.out.println("Data do evento: " + evento.getData());
                    System.out.println("Local do evento: " + evento.getLocal());
                    System.out.println("Lotação máxima do evento: " + evento.getLotacaoMaxima());
                    System.out.println("Preço do ingresso: " + evento.getPrecoIngresso());
                    System.out.println("Ingressos vendidos: " + evento.getIngressosVendidos());
                    System.out.println();
                }
            }
        } else {
            System.out.println("Não há eventos cadastrados.");
        }
    }
}