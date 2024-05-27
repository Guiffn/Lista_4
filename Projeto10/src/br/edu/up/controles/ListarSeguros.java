package br.edu.up.controles;

import java.util.List;
import br.edu.up.modelos.Seguro;

public class ListarSeguros {
    public void listarSeguros(List<Seguro> seguros) {
        if (seguros.isEmpty()) {
            System.out.println("Não há seguros cadastrados!");
        } else {
            for (Seguro s : seguros) {
                System.out.println(s.getDados());
            }
        }
    }
}