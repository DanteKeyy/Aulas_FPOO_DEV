/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    //Atributos dos carros
private int rodas;
private String marca;
private String modelo;
private corEnum cor;
private int ndePortas;
private int velocidade;
private String status;
private int marcha;

//Construtor 

    public Carro(int rodas, String marca, String modelo, corEnum cor, int ndePortas, int velocidade, String status, int marcha) {
        this.rodas = rodas;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ndePortas = ndePortas;
        this.velocidade = velocidade;
        this.status = status;
        this.marcha = marcha;
    }

  

    
    //Metodos
    
    public void trocarDeMarcha(marchaEnum novaMarcha) {
        int diferenca = novaMarcha.getNumeroMarcha();
        
        if (diferenca ==1) {
            this.marcha = novaMarcha.getNumeroMarcha();
        } else {
            System.out.println("Voce não pode pular a marcha");
        }
       
    }
    
    public void andar() {
        System.out.println("Carro em movimento");
        this.status = "Em movimento";
        this.velocidade += 10;
    }
    
    public void freio() {
        System.out.println("Freio Iniciado");
        this.status = "freiando";
        this.velocidade -= 20;
    }

    @Override
    public String toString() {
        return "Carro{" + "rodas=" + rodas + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", ndePortas=" + ndePortas + ", velocidade=" + velocidade + ", status=" + status + ", marcha=" + marcha + '}';
    }
    

    
}
