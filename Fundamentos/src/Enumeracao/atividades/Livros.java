/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Livros {
    private EnumLivros genero;

    public Livros(EnumLivros genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livros{" + "genero=" + genero + '}';
    }

    public void setGenero(EnumLivros genero) {
        this.genero = genero;
    }
    
}
