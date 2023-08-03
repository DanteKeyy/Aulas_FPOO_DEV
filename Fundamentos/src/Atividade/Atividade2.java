package Atividade;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do produto ");
        String nomeProduto = scanner.next();
        System.out.println("Informe o valor do profuto");
        double valor = scanner.nextDouble();
        System.out.println("Informe a quantidade de produtos");
        double quantidade = scanner.nextDouble();
        double valortotal = valor * quantidade;
        System.out.println("Metodo de pagamento. Use D para debito, e C para credito ");
        char metodo = scanner.next().charAt(0);
        if (metodo == 'D') {
            if (valortotal <= 100) {
                double desconto = valortotal * 0.95;
                System.out.println("Deseja parcelar? S para sim, e N para nao");
                char parcela = scanner.next().charAt(0);
                if (parcela == 'S') {
                    System.out.println("Informe o numero de parcelas desejadas");
                    double parcelas = scanner.nextDouble();
                    System.out.println("Nome do produto: " + nomeProduto);
                    System.out.println("Valor do produto: " + valor);
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total: " + desconto);
                    System.out.println("Valor de cada parcela: " + desconto / parcelas);

                } else {
                    System.out.println("Nome do produto: " + nomeProduto);
                    System.out.println("Valor do produto: " + valor);
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total: " + desconto);
                }
            } else {
                double desconto1 = valortotal * 0.97;
                System.out.println("Deseja parcelar? S para sim, e N para nao");
                char parcela = scanner.next().charAt(0);
                if (parcela == 'S') {
                    System.out.println("Informe o numero de parcelas desejadas");
                    double parcelas1 = scanner.nextDouble();
                    System.out.println("Nome do produto: " + nomeProduto);
                    System.out.println("Valor do produto: " + valor);
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total: " + desconto1);
                    System.out.println("Valor de cada parcela: " + desconto1 / parcelas1);

                } else {
                    System.out.println("Nome do produto: " + nomeProduto);
                    System.out.println("Valor do produto: " + valor);
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total: " + desconto1);
                }

            }

        } else {
            System.out.println("Deseja parcelar? S para sim, e N para nao");
            char parcela = scanner.next().charAt(0);
            if (parcela == 'S') {
                System.out.println("Informe o numero de parcelas desejadas");
                double parcelas = scanner.nextDouble();
                System.out.println("Nome do produto: " + nomeProduto);
                System.out.println("Valor do produto: " + valor);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Total: " + valortotal);
                System.out.println("Valor de cada parcela: " + valortotal / parcelas);

            } else {
                System.out.println("Nome do produto: " + nomeProduto);
                System.out.println("Valor do produto: " + valor);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Total: " + valortotal);
            }
        }
    }
}
