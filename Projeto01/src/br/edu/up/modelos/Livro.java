package br.edu.up.modelos;

public class Livro {
    private String codigo;
    private String titulo;
    private String autores;
    private String isbn;
    private int ano;

    public String getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutores() {
        return autores;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getAno() {
        return ano;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutores(String autores) {
        this.autores = autores;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
       
 


}
