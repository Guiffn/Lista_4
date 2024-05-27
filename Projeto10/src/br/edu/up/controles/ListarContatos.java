package br.edu.up.controles;

import java.util.List;
import br.edu.up.modelos.Contato;

public class ListarContatos {

    public void listarContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato encontrado.");
        } else {
            System.out.println("Lista de contatos:");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}
