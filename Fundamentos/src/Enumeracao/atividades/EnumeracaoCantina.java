/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class EnumeracaoCantina {
    public static void main(String[] args) {
    Cantina cantina = new Cantina(EnumCantina.coxinha);
        System.out.println(cantina);
        cantina.setProdutos(EnumCantina.Esfiha);
        System.out.println(cantina);
        cantina.setProdutos(EnumCantina.croissaint);
        System.out.println(cantina);
        cantina.setProdutos(EnumCantina.Suco);
        System.out.println(cantina);
        cantina.setProdutos(EnumCantina.Refrigerante);
        System.out.println(cantina);
        cantina.setProdutos(EnumCantina.Hamnurguer);
        System.out.println(cantina);
        cantina.setProdutos(EnumCantina.XTudo);
        System.out.println(cantina);
        cantina.setProdutos(EnumCantina.Xbacon);
        System.out.println(cantina);
    }
}
