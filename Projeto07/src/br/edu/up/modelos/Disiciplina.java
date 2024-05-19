package br.edu.up.modelos;

public class Disiciplina {
      
    private String nome;
    private String curriculo;
    private int identificação;
    private int quantComp;
    private String[] CompNecessaria;
    private String[] CompComplementar;
  
    
    
     
    

    public Disiciplina(String nome, String curriculo, int identificação, int quantComp, String[] compNecessaria,
            String[] compComplementar) {
        this.nome = nome;
        this.curriculo = curriculo;
        this.identificação = identificação;
        this.quantComp = quantComp;
        CompNecessaria = compNecessaria;
        CompComplementar = compComplementar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public int getIdentificação() {
        return identificação;
    }

    public void setIdentificação(int identificação) {
        this.identificação = identificação;
    }

    public int getQuantComp() {
        return quantComp;
    }

    public void setQuantComp(int quantComp) {
        this.quantComp = quantComp;
    }

    public String[] getCompNecessaria() {
        return CompNecessaria;
    }

    public void setCompNecessaria(String[] compNecessaria) {
        CompNecessaria = compNecessaria;
    }

    public String[] getCompComplementar() {
        return CompComplementar;
    }

    public void setCompComplementar(String[] compComplementar) {
        CompComplementar = compComplementar;
    }




}
