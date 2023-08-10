package AulaEstruturaDecisao;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um prato \n1. Arroz, feijao, Bife"
                + "\n2. Arroz, feijao, file de frango "
                + "\n3. Arroz, feijao, fricasse de frango"
                + "\n4. Arroz, feijao, escondidinho de carne seca");
        double prato = scanner.nextDouble();
        System.out.println("Escolha a quantidade de comida em gramas");
        double quantidade = scanner.nextDouble();
        
        if (prato == 1) {
            double precoPG = 0.04;
            double preco = quantidade*precoPG;
            System.out.println("Preço total de seu almoço: "+preco);
        } else if (prato ==2) {
            double precoPG = 0.03;
            double preco = quantidade*precoPG;
            System.out.println("Preço total do seu almoço: "+preco);
        } else if (prato ==3) {
            double precoPG = 0.07;
            double preco = quantidade*precoPG;
            System.out.println("Preço total de seu almoço: "+preco);
        } else if (prato ==4) {
            double precoPG = 0.08;
            double preco = quantidade*precoPG;
            System.out.println("Preço total de seu almoço: "+preco);
        } else {
            System.out.println("Insira um valor valido.");
        }
    }
}
