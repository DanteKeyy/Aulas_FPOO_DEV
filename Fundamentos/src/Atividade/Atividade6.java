package Atividade;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor da casa desejada.");
        double valorDaCasa = scanner.nextDouble();
        System.out.println("Informe seu salario");
        double salario = scanner.nextDouble();  
        System.out.println("Insira a quantidade de anos a pagar");
        double periodoA = scanner.nextDouble();
        double valorMensal = valorDaCasa/periodoA/12;
        if (valorMensal > salario*0.3) {
            System.out.println("Emprestimo nao autorizado.");
            System.out.println("Valor mensal: "+valorMensal);
            System.out.println("salario: "+salario);
            System.out.println("valor mensal permitido: " + (salario*0.3));
            System.out.println("e preciso que o valor mensal da casa sjea ate 30% de seu salario.");
        } else {
            System.out.println("Emprestimo autorizado");
            System.out.println("Valor mensal: "+valorMensal);
            System.out.println("salario: "+salario);
            System.out.println("valor mensal maximo permitido: " + (salario*0.3));
            System.out.println("O valor mensal nao e superior a 30% do salario.");
        }
    }
}
