package br.edu.up.modelos;

public class ClientePessoa extends Cliente {

    private String cpf;
    private String peso;
    private String altura;

   

    public ClientePessoa(String nome, String telefone, String email, double vlrEmprestar, double vlrMaxCredito,
            Endereco endereco, String cpf, String peso, String altura) {
        super(nome, telefone, email, 0, 10000, endereco);
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "ClientePessoa [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", peso=" + peso + ", email="
                + email + ", altura=" + altura + ", vlrEmprestar=" + vlrEmprestar + ", vlrMaxCredito=" + vlrMaxCredito
                +",saldo=" + getSaldo() + "Endereço"+endereco+"]";
    }


    

    

}
