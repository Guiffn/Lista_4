package br.edu.up.controles;

import br.edu.up.modelos.Aluno;

public class ControleDeAluno {

    private Aluno[]alunos;
    private int proximaPosição;

    public ControleDeAluno(int tamanhoMaximo){
        this.proximaPosição=0;
        this.alunos=new Aluno[tamanhoMaximo];
    }
    public Aluno buscarAluno(String nomeAluno){
        for(Aluno aluno:alunos){
            if(aluno!=null && aluno.getNome().equalsIgnoreCase(nomeAluno)){
             return aluno;
            }
        }
        return null;
    }
  
    public Aluno[] getAlunos() {
        return alunos;
    }

    public void adicionarAlunos(Aluno aluno){
        if(proximaPosição<alunos.length){
            alunos[proximaPosição++]=aluno;
        }else{
            System.out.println("Não foi possivel cadastrar");
        }
    }




}
