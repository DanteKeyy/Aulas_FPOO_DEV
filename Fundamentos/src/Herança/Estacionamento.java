
package Herança;

import Enumeracao.TiposuarioEnum;
import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro gol = new Carro(5, CambioEnum.MANUAL, CombustivelEnum.GASOLINA,
                "Gol muito conservado",1999, "Azul", "G2", "Volkswagen", 13999, false, false);
        System.out.println(gol);
        System.out.println("---------------------");
        Moto hornet = new Moto(CombustivelEnum.GNV, PartidaEnum.PEDAL, "Moto Hornet com 2 cilindros", 2014, "Preta", 
                "Hornet", "Honda", 40000, true, true);
        System.out.println(hornet);
                System.out.println("---------------------");
                Scooter scooter = new Scooter(2200, "Scooter elétrica", 2023, "Cinza",
                        "ELEKTRA", "Honda", 10000, true, true);
                System.out.println(scooter);
        
    }
}
