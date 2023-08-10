package AulaEstruturaDecisao;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o veiculo a ser alugado:\n"
                + "1.Fiat Argo RS98/d RS2.39/km\n"
                + "2.Fiat Mobi RS79/d RS1.99/km\n"
                + "3. RS102/d  RS2.99/km  ");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            System.out.println("por quantos dias o veiculo sera alugadp?");
            int dias = scanner.nextInt();
            System.out.println("quantos quilometros serao rodados em media?");
            double kmr = scanner.nextDouble();
            double alugueldia = dias*98;
            double aluguelkm = kmr*2.39;
            double valortotal = alugueldia+aluguelkm;
            System.out.println("Valor por dia: RS"+alugueldia);
            System.out.println("valor por km: RS"+aluguelkm);
            System.out.println("valor total: RS"+valortotal);
        } else if (escolha == 2) {
            System.out.println("por quantos dias o veiculo sera alugadp?");
            int dias = scanner.nextInt();
            System.out.println("quantos quilometros serao rodados em media?");
            double kmr = scanner.nextDouble();
            double alugueldia = dias*79;
            double aluguelkm = kmr*1.99;
            double valortotal = alugueldia+aluguelkm;
            System.out.println("Valor por dia: RS"+alugueldia);
            System.out.println("valor por km: RS"+aluguelkm);
            System.out.println("valor total: RS"+valortotal);
    } else if (escolha == 3) {
        System.out.println("por quantos dias o veiculo sera alugadp?");
            int dias = scanner.nextInt();
            System.out.println("quantos quilometros serao rodados em media?");
            double kmr = scanner.nextDouble();
            double alugueldia = dias*102;
            double aluguelkm = kmr*2.99;
            double valortotal = alugueldia+aluguelkm;
            System.out.println("Valor por dia: RS"+alugueldia);
            System.out.println("valor por km: RS"+aluguelkm);
            System.out.println("valor total: RS"+valortotal);
    }
}
}