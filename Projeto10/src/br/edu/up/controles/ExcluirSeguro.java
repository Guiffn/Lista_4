package br.edu.up.controles;

import br.edu.up.modelos.Seguro;

import java.util.List;
import java.util.Scanner;

public class ExcluirSeguro {
    private Scanner scanner = new Scanner(System.in);

    public void excluirSeguro(List<Seguro> seguros) {
        System.out.println("Digite o número da apólice do seguro que deseja excluir: ");
        String apolice = scanner.nextLine();

        Seguro seguro = null;
        for (Seguro s : seguros) {
            if (s.getApolice().equals(apolice)) {
                seguro = s;
                break;
            }
        }

        if (seguro != null) {
            seguros.remove(seguro);
            System.out.println("Seguro excluído com sucesso!");
        } else {
            System.out.println("Seguro não encontrado!");
        }
    }
}
