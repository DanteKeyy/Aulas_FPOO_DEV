package AulaEstruturaDecisao;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um prato \n1. Arroz, feijao, Bife"
                + "\n2. Arroz, feijao, file de frango "
                + "\n3. Arroz, feijao, fricasse de frango"
                + "\n4. Arroz, feijao, escondidinho de carne seca");
        int prato = scanner.nextInt();
        System.out.println("Escolha a quantidade de pratos");
        double quantidade = scanner.nextDouble();
        
        if (prato == 1) {
            double preco = 19.99;
            double precoT = quantidade*preco;
            System.out.println("Preço total de seu almoço: "+precoT);
        } else if (prato ==2) {
            double preco = 18.99;
            double precoT = quantidade*preco;
            System.out.println("Preço total do seu almoço: "+precoT);
        } else if (prato ==3) {
            double preco = 23.99;
            double precoT = quantidade*preco;
            System.out.println("Preço total de seu almoço: "+precoT);
        } else if (prato ==4) {
            double preco = 25;
            double precoT = quantidade*preco;
            System.out.println("Preço total de seu almoço: "+precoT);
        } else {
            System.out.println("Insira um valor valido.");
        }
    }
}
