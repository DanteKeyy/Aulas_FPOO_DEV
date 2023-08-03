package Atividade;

import java.util.Scanner;


public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        double raio = scanner.nextDouble();
        double area = raio*2*Math.PI;
        System.out.println("Area do circulo: " + area);
       
       
    }
}
