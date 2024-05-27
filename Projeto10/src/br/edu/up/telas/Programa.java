package br.edu.up.telas;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Seguro;

public class Programa {

    public static void main(String[] args) {
        List<Seguro> listaSeguros = new ArrayList<>();
        MenuInicial menu = new MenuInicial(listaSeguros);
        menu.mostrar();
    }
}
