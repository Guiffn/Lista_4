package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelo.Reserva;

public class ControleDeReservas {
    private Reserva[] reservas;
    private int proximaPosicao;

    public ControleDeReservas(int tamanhoMaximo) {
        this.reservas = new Reserva[tamanhoMaximo];
        this.proximaPosicao = 0;
    }

    public void adicionarReserva(Reserva reserva) {
        if (proximaPosicao < reservas.length) {
            reservas[proximaPosicao++] = reserva;
        } else {
            System.out.println("Não foi possível adicionar a reserva. Limite de reservas alcançado.");
        }
    }

    public void excluirReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do responsável pela reserva que deseja excluir:");
        String nomeResponsavel = scanner.nextLine();

        for (int i = 0; i < proximaPosicao; i++) {
            if (reservas[i] != null && reservas[i].getNomeResponsavel().equalsIgnoreCase(nomeResponsavel)) {
                for (int j = i; j < proximaPosicao - 1; j++) {
                    reservas[j] = reservas[j + 1];
                }
                reservas[proximaPosicao - 1] = null;
                proximaPosicao--;
                System.out.println("Reserva excluída com sucesso.");
                return;
            }
        }
        System.out.println("Reserva não encontrada.");
    }

    public Reserva buscarReserva(String nomeResponsavel) {
        for (Reserva reserva : reservas) {
            if (reserva != null && reserva.getNomeResponsavel().equals(nomeResponsavel)) {
                return reserva;
            }
        }
        return null; // Retorna null se a reserva não for encontrada
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void alterarReserva(String nomeReponsavelReserva, String novoNomeResponsavel,int novaQuantidadePessoa ){
         Reserva reserva = buscarReserva(novoNomeResponsavel);
         if(reserva!=null){
            reserva.setNomeResponsavel(novoNomeResponsavel);
            reserva.setQuantidadePessoas(novaQuantidadePessoa);
         }else{
            System.out.println("Reserva não encontrada");
         }
        }
    }
