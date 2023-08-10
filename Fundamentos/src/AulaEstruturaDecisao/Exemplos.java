package AulaEstruturaDecisao;

import java.util.Scanner;

public class Exemplos {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu nome. ");
        String nome = scanner.next();
        System.out.println("Insira seu cpf. ");
        long cpf = scanner.nextLong();
        System.out.println("Insira sua idade ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Senhor(a) "+nome+", do CPF: "+cpf+" esta autorizado a frequentar a festa.");
        } else {
            System.out.println("Senhor(a) "+nome+", do CPF: "+cpf+" nao esta autorizado a frequentar a festa.");
        }
                System.out.println("A temperatura está a cerca de quantos graus celsius? ");
        int temperatura = scanner.nextInt();
        if (temperatura == 10) {
            System.out.println("De fato, esta frio hoje");
        } else if (temperatura == 20 ) {
            System.out.println("Esta uma temperatura agradavel");
        } else if (temperatura == 30) {
            System.out.println("De fato, esta quente hoje");
        }
        switch (temperatura) {
            case 15:
                System.out.println("Esta comecando a ficar frio");
                break;
            case 20:
                System.out.println("esta ameno");
                break;
            case 25:
                System.out.println("esta ficando quente");
                break;
        }
    }
}
