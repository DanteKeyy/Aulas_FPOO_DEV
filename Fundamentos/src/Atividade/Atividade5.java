package Atividade;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a distancia em km que se deseja percorrer");
        double distancia = scanner.nextDouble();
        if (distancia <= 200) {
            double valor0 = 0.5*distancia;
            System.out.println("Valor a pagar: "+valor0);
        } else {
            double valor1 = 0.45*distancia;
            System.out.println("Valor a pagar: "+valor1);
        }
    
    
    }
}
