
package br.edu.up.modelos;

import java.time.LocalDate;

public class Seguro {

    private String apolice;
    private Segurado segurado;
    private double valorApolice;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Seguro(String apolice, Segurado segurado, double valorApolice, LocalDate dataInicio, LocalDate dataFim) {
        this.apolice = apolice;
        this.segurado = segurado;
        this.valorApolice = valorApolice;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public Segurado getSegurado() {
        return segurado;
    }

    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }

    public double getValorApolice() {
        return valorApolice;
    }

    public void setValorApolice(double valorApolice) {
        this.valorApolice = valorApolice;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getDados() {
        return "Seguro: " + apolice + " - " + segurado.getNome() + " - " + valorApolice + " - " + dataInicio + " - "
                + dataFim;
    }
}
