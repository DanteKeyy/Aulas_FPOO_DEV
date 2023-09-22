/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança.Escola;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) {
            Professor Moises = new Professor(true, "Moises Olimpo Filho"
                    , "MoisesOlimpo@gmail.com", 40, "Masculino", true, true);
            Moises.verificarDominioEmailGmail(Moises.getEmail());
            Moises.verificarDominioEmailyahoo(Moises.getEmail());
            Moises.verificarDedicacaoExclusiva(Moises.isDedicacaoExclusiva());
            System.out.println(Moises);
            Aluno Gabriel = new Aluno("2312", "Gabriel Fonseca", "Gabriel@gmail.com", 16, 
                    "Masculino", false, true);
            Gabriel.verificarDominioEmailGmail(Gabriel.getEmail());
            Gabriel.verificarDominioEmailyahoo(Gabriel.getEmail());
            Gabriel.caracteresRM(Gabriel.getRM());
            System.out.println(Gabriel);
            Professor Lucas = new Professor(true, "Lucas Alves de Nascimento"
                    , "LucasAN@yahoocom", 32, "Masculino", true, false);
            Lucas.verificarDominioEmailGmail(Lucas.getEmail());
            Lucas.verificarDominioEmailyahoo(Lucas.getEmail());
            Lucas.verificarDedicacaoExclusiva(Lucas.isDedicacaoExclusiva());
            System.out.println(Lucas);
            Aluno Laura = new Aluno("4921", "Laura Santos","LauraSantos@yahoo.com", 17,"Feminino",
                    true, true);
            Laura.verificarDominioEmailGmail(Laura.getEmail());
            Laura.verificarDominioEmailyahoo(Lucas.getEmail());
            Laura.caracteresRM(Laura.getRM());
            System.out.println(Laura);
    }
    
    
}
