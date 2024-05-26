package br.edu.up.modelos;
import java.util.List;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    

    public Endereco(String rua, String numero, String bairro, String cep, List<Cidade> cidades) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
     
    }
    

    public String getRua() {
        return rua;
    }



    public void setRua(String rua) {
        this.rua = rua;
    }



    public String getNumero() {
        return numero;
    }



    public void setNumero(String numero) {
        this.numero = numero;
    }



    public String getBairro() {
        return bairro;
    }



    public void setBairro(String bairro) {
        this.bairro = bairro;
    }



    public String getCep() {
        return cep;
    }



    public void setCep(String cep) {
        this.cep = cep;
    }



    @Override
    public String toString() {
        System.out.println("");
        return "Endereco [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + "]";
    }

    

   
    
    

    

}
