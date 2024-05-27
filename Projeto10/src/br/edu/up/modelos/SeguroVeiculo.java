package br.edu.up.modelos;

public class SeguroVeiculo {

    private double vlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public SeguroVeiculo(double vlrFranquia, boolean temCarroReserva, boolean cobreVidros) {
        this.vlrFranquia = vlrFranquia;
        this.temCarroReserva = temCarroReserva;
        this.cobreVidros = cobreVidros;
    }

    public double getVlrFranquia() {
        return vlrFranquia;
    }

    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public boolean isCobreVidros() {
        return cobreVidros;
    }

    public void setVlrFranquia(double vlrFranquia) {
        this.vlrFranquia = vlrFranquia;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    String getDados() {
        return "Seguro Veículo: " + (temCarroReserva ? "Tem Carro Reserva" : "") + (cobreVidros ? "Cobre Vidros" : "");
    }
}
