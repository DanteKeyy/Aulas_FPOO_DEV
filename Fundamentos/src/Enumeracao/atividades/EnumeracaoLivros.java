/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class EnumeracaoLivros {
    public static void main(String[] args) {
    Livros livros = new Livros(EnumLivros.romance);
        System.out.println(livros);
        livros.setGenero(EnumLivros.suspense);
        System.out.println(livros);
        livros.setGenero(EnumLivros.horror);
        System.out.println(livros);
        livros.setGenero(EnumLivros.drama);
        System.out.println(livros);
        livros.setGenero(EnumLivros.Aventura);
        System.out.println(livros);
        
    
    
    
    }
   
}
