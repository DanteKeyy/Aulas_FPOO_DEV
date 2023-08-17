/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Cantina {
    private EnumCantina produtos;

    public Cantina(EnumCantina produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Cantina{" + "produtos=" + produtos + '}';
    }

    public void setProdutos(EnumCantina produtos) {
        this.produtos = produtos;
    }
    
}
