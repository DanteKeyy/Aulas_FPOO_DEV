package AulaEstruturaDecisao;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu cargo\n1. Gerente \n2. Supervisor "
                + "\n3. Tecnico \n4. Auxiliar");
        int cargo = scanner.nextInt();
        if (cargo == 1) {
            String cargoAtual = "Gerente";
            double salario = 5590;
            double INSS = salario * 0.08;
            double salarioFinal = salario - INSS - 289;
            System.out.println("Cargo: "+cargoAtual);
            System.out.println("salario: "+salario);
            System.out.println("INSS: "+INSS);
            System.out.println("convenio: 289");
            System.out.println("Salario final: " + salarioFinal);
        } else if (cargo == 2) {
            String cargoAtual = "Supervisor";
            double salario = 4128;
            double INSS = salario * 0.07;
            double salarioFinal = salario - INSS - 239;
            System.out.println("Cargo: "+cargoAtual);
            System.out.println("salario: "+salario);
            System.out.println("INSS: "+INSS);
            System.out.println("convenio: 239");
            System.out.println("Salario final: " + salarioFinal);
        } else if (cargo == 3) {
            String cargoAtual = "Tecnico";
            double salario = 3789;
           double INSS = salario*0.04;
            double salarioFinal = salario-INSS-189;
            System.out.println("Cargo: "+cargoAtual);
            System.out.println("salario: "+salario);
            System.out.println("INSS: "+INSS);
            System.out.println("convenio: 189");
            System.out.println("Salario final: "+salarioFinal);
        } else if (cargo == 4) {
            String cargoAtual = "Auxiliar";
             double salario = 2345;
            double INSS = salario * 0.02;
            double salarioFinal = salario - INSS - 156;
            System.out.println("Cargo: "+cargoAtual);
            System.out.println("salario: "+salario);
            System.out.println("INSS: "+INSS);
            System.out.println("convenio: 156");
            System.out.println("Salario final: " + salarioFinal);
        } else {
            System.out.println("Insira um cargo valido");
        }
    }
}
