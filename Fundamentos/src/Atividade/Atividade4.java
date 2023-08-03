package Atividade;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu salario.");
        double salario = scanner.nextDouble();
        if (salario > 1350) {
            double salariofinal10 = salario*1.1;
            System.out.println("Seu novo salario e: "+salariofinal10);
            
        } else {
            double salariofinal15 = salario*1.15;
            System.out.println("Seu novo salario e: "+salariofinal15);
        }
    }
}
