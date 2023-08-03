package Atividade;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o consumo em kw/h");
        double kw = scanner.nextDouble();
        System.out.println("Informe o tipo de instalacao");
        System.out.println("R para residencia, I para industira e C para comercio");
        String tipoInstalacao = scanner.next();
        if (tipoInstalacao == "R") {
            if (kw <= 500) {
                double valorR1 = kw*0.4;
                System.out.println("Valor a pagar: "+valorR1);
            } else {
                double valorR2 = kw*0.65;
                System.out.println("Valor a pagar: "+valorR2);
            }
            
        } if (tipoInstalacao == "I") {
         if (kw <= 1000) {
            double valorC1 = kw*0.55;
             System.out.println("Valor a pagar: "+valorC1);
        } else {
             double valorC2 = kw*0.6;
             System.out.println("Valor a pagar: "+valorC2);
             
         }
   
        } else {
            if (kw <= 5000) {
            double valorI1 = kw*0.55;
                System.out.println("Valor a pagar: "+valorI1);
        } else {
                double valorI2 = kw*0.6;
                System.out.println("Valor a pagar: "+valorI2);
            }
            
        }
  
    }
}
