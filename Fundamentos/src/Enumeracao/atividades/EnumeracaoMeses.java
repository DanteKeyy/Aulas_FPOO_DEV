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
    Meses meses = new Meses(MesesEnum.Janeiro.getMeses(), 1);
        System.out.println(meses);
        meses.setMes(MesesEnum.Fevereiro.getMeses());
        meses.setNumeroMes(2);
        System.out.println(meses);
        meses.setMes(MesesEnum.Marco.getMeses());
        meses.setNumeroMes(3);
        System.out.println(meses);
        meses.setMes(MesesEnum.Abril.getMeses());
        meses.setNumeroMes(4);
        System.out.println(meses);
        meses.setMes(MesesEnum.Maio.getMeses());
        meses.setNumeroMes(5);
        System.out.println(meses);
        meses.setMes(MesesEnum.Junho.getMeses());
        meses.setNumeroMes(6);
        System.out.println(meses);
        meses.setMes(MesesEnum.Julho.getMeses());
        meses.setNumeroMes(7);
        System.out.println(meses);
        meses.setMes(MesesEnum.Agosto.getMeses());
        meses.setNumeroMes(8);
        System.out.println(meses);
        meses.setMes(MesesEnum.Setembro.getMeses());
        meses.setNumeroMes(9);
        System.out.println(meses);
        meses.setMes(MesesEnum.Outubro.getMeses());
        meses.setNumeroMes(10);
        System.out.println(meses);
        meses.setMes(MesesEnum.Novembro.getMeses());
        meses.setNumeroMes(11);
        System.out.println(meses);
        meses.setMes(MesesEnum.Dezembro.getMeses());
        meses.setNumeroMes(12);
        System.out.println(meses);
    }
    
    
}
