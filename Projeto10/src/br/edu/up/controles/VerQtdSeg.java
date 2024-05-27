package br.edu.up.controles;

import java.util.List;
import br.edu.up.modelos.Seguro;

public class VerQtdSeg {

    public void verQtdSeg(List<Seguro> seguros) {
        System.out.println("Quantidade de seguros cadastrados: " + seguros.size());
    }

}