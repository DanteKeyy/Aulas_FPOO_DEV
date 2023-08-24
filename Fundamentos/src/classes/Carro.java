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
private String cor;
private int ndePortas;
private int velocidade;
private String status;

//Construtor 

    public Carro(int rodas, String marca, String modelo, String cor, int ndePortas, int velocidade, String status) {
        this.rodas = rodas;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ndePortas = ndePortas;
        this.velocidade = velocidade;
        this.status = status;
    }

  

    
    //Metodos
    
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
        return "Carro{" + "rodas=" + rodas + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", ndePortas=" + ndePortas + ", velocidade=" + velocidade + ", status=" + status + '}';
    }
    

    
}
