package Atividade;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a velocidade do carro.");
        double velocidade = scanner.nextDouble();
        if (velocidade >80) {
            double diferenca = (velocidade-80)*5;
            System.out.println("Velocidade muito alta. Valor da multa: " + diferenca);
            
            
        } else {
            System.out.println("velocidade aceitavel");
        }
    }
}
