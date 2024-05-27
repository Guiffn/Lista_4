package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;
    


    public ClienteEmpresa(String nome, String telefone, String email, double vlrEmprestar, double vlrMaxCredito,
            Endereco endereco, String cnpj, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, 0,250000, endereco);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }


    @Override
    public String toString() {
        return "ClienteEmpresa [nome=" + nome + ", cnpj=" + cnpj + ", telefone=" + telefone + ", inscEstadual="
                + inscEstadual + ", email=" + email + ", anoFundacao=" + anoFundacao + ", vlrEmprestar=" + vlrEmprestar
                + ", vlrMaxCredito=" + vlrMaxCredito +",saldo=" + getSaldo() +",Endereço"+endereco+ "]";
    }



    






}
