package br.edu.up.modelos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
        for (int i = 0; i < 12; i++) {
            this.meses[i] = new Mes(numeroDiasNoMes(i + 1), nomeMes(i + 1));
        }
    }

    private int numeroDiasNoMes(int mes) {
        switch (mes) {
            case 2:
                return bissexto ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private String nomeMes(int mes) {
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "";
        }
    }

    public void adicionarMes(int numeroDias, String nomeMes) {
        for (int i = 0; i < meses.length; i++) {
            if (meses[i] == null) {
                meses[i] = new Mes(numeroDias, nomeMes);
                break;
            }
        }
    }
    public void adicionarCompromisso(String nomeMes, int diaMes, int hora, Compromisso compromisso) {
        for (Mes mes : meses) {
            if (mes != null && mes.getNome().equals(nomeMes)) {
                mes.adicionarCompromisso(compromisso, diaMes);
                break;
            }
        }
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        for (Mes mes : meses) {
            if (mes.getNome().equals(nomeMes)) {
                mes.excluirCompromisso(diaMes, hora);
                break;
            }
        }
    }

    public void listarCompromisso(String nomeMes) {
        for (Mes mes : meses) {
            if (mes.getNome().equals(nomeMes)) {
                mes.listarCompromisso();
                break;
            }
        }
    }

    public void listarCompromisso() {
        System.out.println("Compromissos do ano de" + ano + ":");
        for (Mes mes : meses) {
            mes.listarCompromisso();
        }
    }
}
