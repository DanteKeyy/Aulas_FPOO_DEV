
package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Cliente c1 = new Cliente("Moises Olimpo da Silva");
        System.out.println(c1);
        double valorLocacaoSimples =c1.calcularLocacao(3);
        System.out.println("O valor para a locação do filme simples é: "+ valorLocacaoSimples);
        c1.validarnome(c1.getNome());
        c1.verificarEmailDominioGoogle(c1.getEmail());
        Cliente c2 = new Cliente("Marilza Silva", "marilzasilva@gmail.com");
        System.out.println(c2);
        double valorLocacaoLancamento =  c2.calcularLocacao(3, true);
       System.out.println("O valor para a locação do filme simples é: "+ valorLocacaoLancamento);
        c2.validarnome(c2.getNome());
        c2.verificarEmailDominioGoogle(c2.getEmail());
  
    }
}
