package br.edu.up;

import br.edu.up.modelos.Livro;

public class Programa {
    public static void main(String[] args) {

        Livro livro01 = new Livro();
        livro01.setCodigo("1598FHK");
        livro01.setTitulo("Core Java 2");
        livro01.setAutores("Cay S. Horstmann e Gary Cornell");
        livro01.setIsbn("0130819336");
        livro01.setAno(2005);

        Livro livro02 = new Livro();
        livro02.setCodigo("9865PLO");
        livro02.setTitulo("Java, Como programar");
        livro02.setAutores("Harvey Deitel");
        livro02.setIsbn("0130341517");
        livro02.setAno(2015);
        
        System.out.println("LIVRO 1");
        System.out.println("Codigo:"+livro01.getCodigo());
        System.out.println("Titulo:"+livro01.getTitulo());
        System.out.println("Autor:"+livro01.getAutores());
        System.out.println("ISBN: "+livro01.getIsbn());
        System.out.println("Ano: "+livro01.getAno());
        System.out.println();
        System.out.println("LIVRO 2");
        System.out.println("Codigo:"+livro02.getCodigo());
        System.out.println("Titulo:"+livro02.getTitulo());
        System.out.println("Autor:"+livro02.getAutores());
        System.out.println("ISBN: "+livro02.getIsbn());
        System.out.println("Ano: "+livro02.getAno());
   
    }
}
