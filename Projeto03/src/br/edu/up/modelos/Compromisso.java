package br.edu.up.modelos;

public class Compromisso {
    private String pessoa;
    private String local;
    private String assunto;
    private int hora;

    public Compromisso(String pessoa,String local,String assunto, int hora){
     this.assunto=assunto;
     this.pessoa=pessoa;
     this.local=local;
     this.hora=hora;

    }

    public String getPessoa() {
        return pessoa;
    }

    public String getLocal() {
        return local;
    }

    public String getAssunto() {
        return assunto;
    }

    public int getHora() {
        return hora;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

}
