package br.edu.up.modelos;
public abstract class Cliente {

    protected String nome;
    protected String telefone;
    protected String email;
    protected double vlrEmprestar;
    protected double vlrMaxCredito;
    protected Endereco endereco;

    
   
    public Cliente(String nome, String telefone, String email, double vlrEmprestar, double vlrMaxCredito,
            Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.vlrEmprestar = 0;
        this.vlrMaxCredito = vlrMaxCredito;
        this.endereco = endereco;
    }
    public void emprestar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor para empréstimo deve ser positivo.");
            return;
        }
        if (vlrEmprestar + valor > vlrMaxCredito) {
            System.out.println("Empréstimo excede o valor máximo de crédito.");
            return;
        }
        vlrEmprestar += valor;
        System.out.println("Empréstimo realizado com sucesso.");
    }
    public void devolver(double valor) {
        if (valor <= 0) {
            System.out.println("Valor para devolução deve ser positivo.");
            return;
        }
        if (valor > vlrEmprestar) {
            System.out.println("Valor de devolução excede o valor emprestado.");
            return;
        }
        vlrEmprestar -= valor;
        System.out.println("Devolução realizada com sucesso.");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo(){
        return vlrEmprestar;
    }

    
    
    
    





}
