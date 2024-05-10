package br.edu.up.modelos;

public class Passageiro extends Pessoa {
    private String nacionalidade;
    private String identificadorBagagem;
    private String numeroAssento;
    private String classeAssento;
    private String dataVoo;

    public Passageiro(String nome, String rg, String nacionalidade, String identificadorBagagem, String numeroAssento,
            String classeAssento, String dataVoo) {
        super(nome, rg);
        this.nacionalidade = nacionalidade;
        this.identificadorBagagem = identificadorBagagem;
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

    public String getIdentificadorBagagem() {
        return identificadorBagagem;
    }

    public void setIdentificadorBagagem(String identificadorBagagem) {
        this.identificadorBagagem = identificadorBagagem;
    }

    public String getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(String numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }

    public String getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }
}
