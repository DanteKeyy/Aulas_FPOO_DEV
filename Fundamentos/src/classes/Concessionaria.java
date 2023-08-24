/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Concessionaria {
    public static void main(String[] args) {
     Carro gol = new Carro(4, "Volkswagen", "gol 2000", corEnum.PRATA, 2, 0, "Parado", 0 );
        System.out.println(gol);
        gol.trocarDeMarcha(marchaEnum.PRIMEIRA_MARCHA);
       gol.andar();
       gol.andar();
       gol.andar();
       gol.trocarDeMarcha(marchaEnum.SEGUNDA_MARCHA);
        System.out.println(gol);
       gol.andar();
       gol.freio();
       gol.trocarDeMarcha(marchaEnum.PRIMEIRA_MARCHA);
        System.out.println(gol);
        
        Carro Civic = new Carro(4, "Honda", "Civic", corEnum.AZUL, 4, 0, "Parado", 0);
        System.out.println(Civic);
        gol.trocarDeMarcha(marchaEnum.PRIMEIRA_MARCHA);
        Civic.andar();
        Civic.andar();
        System.out.println(Civic);
        Civic.freio();
        System.out.println(Civic);
        
    }
    
}

