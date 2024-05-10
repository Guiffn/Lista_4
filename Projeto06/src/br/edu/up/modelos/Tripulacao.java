package br.edu.up.modelos;

public class Tripulacao extends Registro {
    private String identificacaoAeronautica;
    private String matriculaFuncionario;
    private Aeronave aeronave;

    public Tripulacao(String nome, String rg, String nacionalidade, String identificacaoAeronautica2,
            String matriculaFuncionario2) {
        // TODO Auto-generated constructor stub
    }

    public Tripulacao() {
        // TODO Auto-generated constructor stub
    }

    public String getIdentificacaoAeronautica() {
        return identificacaoAeronautica;
    }

    public void setIdentificacaoAeronautica(String identificacaoAeronautica) {
        this.identificacaoAeronautica = identificacaoAeronautica;
    }

    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }
}
