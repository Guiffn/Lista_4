package br.edu.up.modelos;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[0];
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        Compromisso[] novoArray = new Compromisso[compromissos.length + 1];
        for (int i = 0; i < compromissos.length; i++) {
            novoArray[i] = compromissos[i];
        }
        novoArray[novoArray.length - 1] = compromisso;
        compromissos = novoArray;
    }

    public Compromisso consultarCompromisso(int hora) {
        for (Compromisso compromisso : compromissos) {
            if (compromisso.getHora() == hora) {
                return compromisso;
            }
        }
        return null;
    }

    public void excluirCompromisso(int hora) {
        Compromisso[] novoArray = new Compromisso[compromissos.length - 1];
        int index = 0;
        for (Compromisso compromisso : compromissos) {
            if (compromisso.getHora() != hora) {
                novoArray[index] = compromisso;
                index++;
            }
        }
        compromissos = novoArray;
    }

    public void listarCompromisso() {
        System.out.println("Comrpromisso do dia" + diaMes + ":");
        for (Compromisso compromisso : compromissos) {
            System.out.println("Hora " + compromisso.getHora() + " pessoa: " + compromisso.getPessoa() + " local: "
                    + compromisso.getLocal() + " Assunto: " + compromisso.getPessoa());
        }
    }

}
