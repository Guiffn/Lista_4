package br.edu.up.controles;

import java.util.List;

import br.edu.up.modelos.Contato;

public class ExcluirContato {

    public void excluirContato(List<Contato> contatos, int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                contatos.remove(contato);
                break;
            }
        }
    }
}
