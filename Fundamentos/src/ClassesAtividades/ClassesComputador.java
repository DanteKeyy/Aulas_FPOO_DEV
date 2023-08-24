/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAtividades;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ClassesComputador {
    //Atributos da classe (Computador)
    private String SisOperacional;
    private MemoriaEnum Memoria;
    private ProcessadorEnum Processador;
    private int usoRAM = 0;
    private String computador = "Desligado";
    
    //Construtor 

    public ClassesComputador(String SisOperacional, MemoriaEnum Memoria, ProcessadorEnum Processador, int usoRAM, String Computador) {
        this.SisOperacional = SisOperacional;
        this.Memoria = Memoria;
        this.Processador = Processador;
        this.usoRAM = usoRAM;
        this.computador = Computador;
    }
    
    //Metodos
    public void ligarComputador() {
        this.computador = "Ligado";
        this.usoRAM = 1;
        System.out.println("Computador ligado!");
        System.out.println("Uso de memoria RAM atual: " + usoRAM +"GB");
    }
    
    
    public void abrirJogo(MemoriaEnum MemoriaRAM) {
        this.usoRAM = 4;
        System.out.println("Jogo sendo executado...");
        System.out.println("Uso de memoria RAM atual: " + usoRAM +"GB");
        int maximo = MemoriaRAM.getNMemoria();
        if (usoRAM == maximo) {
            System.out.println(JOptionPane.ERROR_MESSAGE);
            System.out.println("Memoria RAM insuficiente");
        } 
    }
    
    
    
    
        //toString para poder imprimir os Atributos

    @Override
    public String toString() {
        return "ClassesComputador{" + "SisOperacional=" + SisOperacional + ", Memoria=" + Memoria + ", Processador=" + Processador + ", usoRAM=" + usoRAM + ", computador=" + computador + '}';
    }
    
                

    
    
}
