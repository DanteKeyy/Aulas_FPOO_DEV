package AulaEstruturaDecisao;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a largura do imovel em m2");
        double largura = scanner.nextDouble();
        System.out.println("Insira o comprimento do imovel em m2");
        double comprimento = scanner.nextDouble();
        double area = largura*comprimento;
        if (area <=250) {
            double preco = area*8.50;
            System.out.println("Valor a pagar: RS"+preco);
        } else if (area <=350) {
            double preco = area*9.50;
            System.out.println("Valor a pagar: RS"+preco);            
        } else {
            double preco = area*11.50;
            System.out.println("Valor a pagar: RS"+preco);
        }
    }
}
