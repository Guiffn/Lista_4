package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelo.Evento;

public class ControleDeEventos {
    private Evento[] eventos;
    private int proximaPosicao;

    public ControleDeEventos(int tamanhoMaximo) {
        this.eventos = new Evento[tamanhoMaximo];
        this.proximaPosicao = 0;
    }

    public void adicionarEvento(Evento evento) {
        if (proximaPosicao < eventos.length) {
            eventos[proximaPosicao++] = evento;
        } else {
            System.out.println("Não foi possível adicionar o evento. Limite de eventos alcançado.");
        }
    }

    public Evento[] getEventos() {
        return eventos;
    }

    public Evento buscarEvento(String nomeEvento) {
        for (Evento evento : eventos) {
            if (evento != null && evento.getNome().equalsIgnoreCase(nomeEvento)) {
                return evento;
            }
        }
        return null;
    }

    public void excluirEvento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do evento que deseja excluir:");
        String nomeEvento = scanner.nextLine();

        for (int i = 0; i < proximaPosicao; i++) {
            if (eventos[i] != null && eventos[i].getNome().equalsIgnoreCase(nomeEvento)) {
                for (int j = i; j < proximaPosicao - 1; j++) {
                    eventos[j] = eventos[j + 1];
                }
                eventos[proximaPosicao - 1] = null;
                proximaPosicao--;
                System.out.println("Evento excluído com sucesso.");
                return;
            }
        }
        System.out.println("Evento não encontrado.");
    }

    public void alterarEvento(String nomeEvento, String novoNome, String novaData, String novoLocal,
            int novaLotacaoMaxima) {
        Evento evento = buscarEvento(nomeEvento);
        if (evento != null) {
            evento.setNome(novoNome);
            evento.setData(novaData);
            evento.setLocal(novoLocal);
            evento.setLotacaoMaxima(novaLotacaoMaxima);
        } else {
            System.out.println("Evento não encontrado.");
        }
    }
}