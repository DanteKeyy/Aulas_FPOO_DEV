/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.Duration;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) {
        Aluno Gerundio = new Aluno("Gerundio", null, 0);
        System.out.println("Aluno 1:");
        System.out.println(Gerundio);
        System.out.println("Gerando email educacional...");
        Gerundio.criarEmailEducacional();
        System.out.println("Gerando RA...");
        Gerundio.gerarRA();
        System.out.println(Gerundio);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("\nALuno 2");
        Aluno Jeremias = new Aluno("Jeremias", null, 0);
        System.out.println(Jeremias);
        System.out.println("Gerando email educacuional...");
        Jeremias.criarEmailEducacional();
        System.out.println("Gerando RA...");
        Jeremias.gerarRA();
        System.out.println(Jeremias);
    }
}
