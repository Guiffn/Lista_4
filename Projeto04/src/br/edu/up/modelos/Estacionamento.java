package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private List<Carro> carrosEstacionados;
    private static final int NUM_VAGAS = 10;

    public Estacionamento() {
        carrosEstacionados = new ArrayList<>(NUM_VAGAS);
    }

    public void estacionarCarro(Carro carro) {
        if (carrosEstacionados.size() < NUM_VAGAS) {
            carrosEstacionados.add(carro);
            System.out.println("O carro de modelo " + carro.getModelo() + " e placa " + carro.getPlaca()
                    + " foi estacionado com sucesso!");
        } else {
            System.out.println("Não há vagas disponíveis no estacionamento.");
        }
    }

    public void removerCarro(String placa) {
        for (Carro carro : carrosEstacionados) {
            if (carro.getPlaca().equals(placa)) {
                carrosEstacionados.remove(carro);
                System.out.println("O carro de placa " + placa + " foi removido do estacionamento.");
                return;
            }
        }
        System.out.println("Carro com placa " + placa + " não encontrado no estacionamento.");
    }

    public void limparEstacionamento() {
        carrosEstacionados.clear();
        System.out.println("Estacionamento limpo!");
    }

    public List<Carro> getCarrosEstacionados() {
        return carrosEstacionados;
    }
}
