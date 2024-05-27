package br.edu.up.controles;

import br.edu.up.modelos.Seguro;

import java.util.List;

public class ExcluirTodosSeg {
    public void excluirTodosSeg(List<Seguro> seguros) {
        seguros.clear();
        System.out.println("Todos os seguros foram excluídos com sucesso!");
    }
}