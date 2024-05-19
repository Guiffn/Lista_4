package br.edu.up.controles;

import br.edu.up.modelos.Disiciplina;

public class ControleDeDisciplina {

    private Disiciplina[] disiciplinas;
    private int proximaPosição;

    public ControleDeDisciplina(int tamanhoMaximo){
    this.proximaPosição=0;
    this.disiciplinas=new Disiciplina[tamanhoMaximo];
    }

    public Disiciplina[] getDisiciplinas() {
        return disiciplinas;
    }
    

    public void setDisiciplinas(Disiciplina[] disiciplinas) {
        this.disiciplinas = disiciplinas;
    }

    public void adicionarDisiciplinas(Disiciplina disiciplina){
    if(proximaPosição<disiciplinas.length){
        disiciplinas[proximaPosição++]=disiciplina;
     }else{
        System.out.println("Não foi possivel adicionar");
     }
    }

}
