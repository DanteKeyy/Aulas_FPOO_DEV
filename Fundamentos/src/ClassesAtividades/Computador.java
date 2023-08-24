/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAtividades;

/**
 *
 * @author Aluno
 */
public class Computador {
    public static void main(String[] args) {
        //Criação de Objeytos
        ClassesComputador notebook = new ClassesComputador("Windows", MemoriaEnum.QUATRO_GIGABYTES, ProcessadorEnum.INTEL_I3, 0, "Desligado");
        ClassesComputador computadorLinux = new ClassesComputador("Linux", MemoriaEnum.OITO_GIGABYTES, ProcessadorEnum.INTEL_I5, 0, "Desligado");
        ClassesComputador computadorWindows = new ClassesComputador("Windows", MemoriaEnum.DEZESSEIS_GIGABYTES, ProcessadorEnum.INTEL_I7, 0, "Desligado");
        //Executar os metodos e printar os atributos dos Objetos
        System.out.println(notebook);
        notebook.ligarComputador();
        System.out.println(notebook);
        notebook.abrirJogo(MemoriaEnum.QUATRO_GIGABYTES);
        System.out.println(computadorLinux);
        computadorLinux.ligarComputador();
        System.out.println(computadorLinux);
        computadorLinux.abrirJogo(MemoriaEnum.OITO_GIGABYTES);
        System.out.println(computadorWindows);
        computadorWindows.ligarComputador();
        System.out.println(computadorWindows);
        computadorWindows.abrirJogo(MemoriaEnum.DEZESSEIS_GIGABYTES);

    }
}
