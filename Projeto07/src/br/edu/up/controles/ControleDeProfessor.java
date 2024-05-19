package br.edu.up.controles;

import br.edu.up.modelos.Professor;

public class ControleDeProfessor {
        private int proximaPosição;
        private Professor[] professores;

        public ControleDeProfessor(int tamanhoMaximo){
            this.proximaPosição=0;
            this.professores=new Professor[tamanhoMaximo];
        }
        
        public Professor[] getProfessores() {
            return professores;
        }

        public void adicionarProfessores(Professor professor){
            if(proximaPosição<professores.length){
            professores[proximaPosição++]=professor;
            }else{
                System.out.println("Não foi possivel cadatrar professor");
            }



        }




}
