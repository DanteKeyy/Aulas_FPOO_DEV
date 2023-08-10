package AulaEstruturaDecisao;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um produto:\n"
                + "1.Notebook Lenovo RS3299\n"
                + "2.Celular MotoG22 RS1789\n"
                + "3.Carro Hb20 RS68000\n"
                + "4.Apartamento 180000");
        int produto = scanner.nextInt();
        if (produto ==1) {
            System.out.println("Economizando 5% do valor do notebook por mês:");
            double preco = 3299;
            double economizar = 3299*0.05;
            double tempo = 3299/economizar;
            System.out.println("valor de cada percentual a economizar: RS"+economizar);
            System.out.println("tempo levado para economizar tudo: "+tempo+"meses");
            
        } else if (produto ==2) {
             System.out.println("Economizando 10% do valor do celular por mês:");
            double preco = 1789;
            double economizar = 1789*0.1;
            double tempo = 1789/economizar;
            System.out.println("valor de cada percentual a economizar: RS"+economizar);
            System.out.println("tempo levado para economizar tudo: "+tempo+"meses");
        } else if (produto == 3) {
             System.out.println("Economizando 2% do valor da Hb20 por mês:");
            double preco = 68000;
            double economizar = 6800*0.02;
            double tempo = 6800/economizar;
            System.out.println("valor de cada percentual a economizar: RS"+economizar);
            System.out.println("tempo levado para economizar tudo: "+tempo+"meses");
        } else if (produto == 4) {
            System.out.println("Economizando 1% do valor do apartamento por mês:");
            double preco = 180000;
            double economizar = 180000*0.01;
            double tempo = 180000/economizar;
            System.out.println("valor de cada percentual a economizar: RS"+economizar);
            System.out.println("tempo levado para economizar tudo: "+tempo+"meses");
        } else {
            System.out.println("insira um produto valido.");
        }
    }
}
