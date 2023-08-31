/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

/**
 *
 * @author Aluno
 */
public class RedeSocial {
    public static void main(String[] args) {
        //Criando as Mensagens dos posts como Strings
        String mensagem1 = "A aula de Java eh horrorosa, o professor eh chato e o SENAI eh ruim";
        String mensagem2 = "Eu gst do SENAI, mas acho o curso chato dms";
        String mensagem3 = "Eu adr o SENAI, Java eh uma linguagem de programacao fantastica e o moises eh legal dms";

        //Criando o objeto do primeiro post
        Posts post1 = new Posts("HaterdeJava6969", mensagem1, 0);
        //Imprimindo-o, definindo seu numero de estrelas e imprimindo-o novamente (para que a quantidade de estrelas apareça)
        System.out.println(post1);
        post1.avaliarPostMuitoRuim(post1.getEstrelas());
        System.out.println(post1);
        
        //Criando o objeto do segundo post
        Posts post2 = new Posts("Eletroeletronica1010", mensagem2, 0);
        ////Imprimindo-o, definindo seu numero de estrelas e imprimindo-o novamente
        System.out.println(post2);
        post2.avaliarPostRuim(post2.getEstrelas());
        System.out.println(post2);
        
        //Criando o objeto do terceiro post
        Posts post3 = new Posts("SabioSensato", mensagem3, 0);
        //Imprimindo-o, definindo seu numero de estrelas e imprimindo-o novamente
        System.out.println(post3);
        post3.avaliarPostIncrivel(post3.getEstrelas());
        System.out.println(post3);
    }
}
