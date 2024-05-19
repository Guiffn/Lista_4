package br.edu.up.modelos;

public class Professor {

    private Double rg;
    private String nome;
    private String matricula;
    private int curriIdentificação;
    private String nomeInstitição;
    private int anoConclu;
    private String nomeTitulo;
    private String tituloConclu;

    
    public Professor(Double rg, String nome, String matricula, int curriIdentificação, String nomeInstitição,
            int anoConclu, String nomeTitulo, String tituloConclu) {
        this.rg = rg;
        this.nome = nome;
        this.matricula = matricula;
        this.curriIdentificação = curriIdentificação;
        this.nomeInstitição = nomeInstitição;
        this.anoConclu = anoConclu;
        this.nomeTitulo = nomeTitulo;
        this.tituloConclu = tituloConclu;
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
    public int getCurriIdentificação() {
        return curriIdentificação;
    }
    public void setCurriIdentificação(int curriIdentificação) {
        this.curriIdentificação = curriIdentificação;
    }
    public String getNomeInstitição() {
        return nomeInstitição;
    }
    public void setNomeInstitição(String nomeInstitição) {
        this.nomeInstitição = nomeInstitição;
    }
    public int getAnoConclu() {
        return anoConclu;
    }
    public void setAnoConclu(int anoConclu) {
        this.anoConclu = anoConclu;
    }
    public String getNomeTitulo() {
        return nomeTitulo;
    }
    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getTituloConclu() {
        return tituloConclu;
    }

    public void setTituloConclu(String tituloConclu) {
        this.tituloConclu = tituloConclu;
    }

    



}
