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
     Carro gol = new Carro(4, "Volkswagen", "gol 2000", "Vermleho", 2, 0, "Parado");
        System.out.println(gol);
       gol.andar();
       gol.andar();
       gol.andar();
       gol.andar();
       gol.freio();
        System.out.println(gol);
        
        Carro Civic = new Carro(4, "Honda", "Civic 2010", "Prateado", 4, 0, "Parado");
        System.out.println(Civic);
        Civic.andar();
        Civic.andar();
        Civic.freio();
        System.out.println(Civic);
        
    }
    
}
