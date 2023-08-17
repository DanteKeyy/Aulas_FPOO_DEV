/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class EnumeracaoMeses {
    public static void main(String[] args) {
    Meses meses = new Meses(MesesEnum.Janeiro, 1);
        System.out.println(meses);
        meses.setMes(MesesEnum.Fevereiro);
        meses.setNumeroMes(2);
        System.out.println(meses);
        meses.setMes(MesesEnum.Marco);
        meses.setNumeroMes(3);
        System.out.println(meses);
        meses.setMes(MesesEnum.Abril);
        meses.setNumeroMes(4);
        System.out.println(meses);
        meses.setMes(MesesEnum.Maio);
        meses.setNumeroMes(5);
        System.out.println(meses);
        meses.setMes(MesesEnum.Junho);
        meses.setNumeroMes(6);
        System.out.println(meses);
        meses.setMes(MesesEnum.Julho);
        meses.setNumeroMes(7);
        System.out.println(meses);
        meses.setMes(MesesEnum.Agosto);
        meses.setNumeroMes(8);
        System.out.println(meses);
        meses.setMes(MesesEnum.Setembro);
        meses.setNumeroMes(9);
        System.out.println(meses);
        meses.setMes(MesesEnum.Outubro);
        meses.setNumeroMes(10);
        System.out.println(meses);
        meses.setMes(MesesEnum.Novembro);
        meses.setNumeroMes(11);
        System.out.println(meses);
        meses.setMes(MesesEnum.Dezembro);
        meses.setNumeroMes(12);
        System.out.println(meses);
    }
    
    
}
