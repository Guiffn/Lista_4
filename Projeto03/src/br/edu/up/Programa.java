package br.edu.up;

import br.edu.up.modelos.Compromisso;
import br.edu.up.modelos.Ano;

public class Programa {
    public static void main(String[] args) {

        Ano ano = new Ano(2024, true);

        // Criando um objeto Compromisso
        Compromisso compromisso = new Compromisso("Maria", "Cafeteria", "Café com Maria", 14);

        // Adicionando o compromisso ao mês de janeiro
        ano.adicionarCompromisso("Janeiro", 10, 14, compromisso);

        // Listando compromissos do mês de janeiro
        ano.listarCompromisso("Janeiro");
    }
}
