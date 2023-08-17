package Atividade;

import java.util.Scanner;

public class Atividade9 {
public static void main(String[] args) {
        double resultado = media(10,5,7,9,8);
        System.out.println("A media: "+ resultado);
        System.out.println("A soma: "+ (10+5+7+9+8));
    }
    
    public static int media(double ... valores) {
     int resultado = 0;
        for (int i = 0; i < valores.length; i++) {
            double valor = valores[i];
            resultado += valor/valores.length;

            
        }
        return resultado;
    }
}

