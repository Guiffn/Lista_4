package br.edu.up.modelos;

public class SeguroVida {

    private boolean cobreDoenca;
    private boolean cobreMorte;

    public SeguroVida(boolean cobreDoenca, boolean cobreMorte) {
        this.cobreDoenca = cobreDoenca;
        this.cobreMorte = cobreMorte;
    }

    public boolean isCobreDoenca() {
        return cobreDoenca;
    }

    public boolean isCobreMorte() {
        return cobreMorte;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public void setCobreMorte(boolean cobreMorte) {
        this.cobreMorte = cobreMorte;
    }

    String getDados() {
        return "Seguro Vida: " + (cobreDoenca ? "Cobre Doença" : "") + (cobreMorte ? "Cobre Morte" : "");
    }

}
