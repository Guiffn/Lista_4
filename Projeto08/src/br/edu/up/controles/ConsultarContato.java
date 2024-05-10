package br.edu.up.controles;

import java.util.List;
import br.edu.up.modelos.Contato;

public class ConsultarContato {

    public Contato consultarContato(List<Contato> contatos, int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }
}
