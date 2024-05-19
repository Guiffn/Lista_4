package br.edu.up.modelos;

public class Aluno {

    private Double rg;
    private String nome;
    private String matricula;
    private int anoingresso;
    private String nomeCurso;
    private String turno;

    
    public Aluno(Double rg, String nome, String matricula, int anoingresso, String nomeCurso, String turno) {
        this.rg = rg;
        this.nome = nome;
        this.matricula = matricula;
        this.anoingresso = anoingresso;
        this.nomeCurso = nomeCurso;
        this.turno = turno;
    }
    public Double getRg() {
        return rg;
    }
    public void setRg(Double rg) {
        this.rg = rg;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getAnoingresso() {
        return anoingresso;
    }
    public void setAnoingresso(int anoingresso) {
        this.anoingresso = anoingresso;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

   




}
