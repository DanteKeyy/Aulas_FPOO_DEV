/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAtividades;

/**
 *
 * @author Aluno
 */
public class Salas {
    public static void main(String[] args) {
        //Declaração de Objetos
        SalaClasses salaA = new SalaClasses(30, 28, "A");
        SalaClasses salaB = new SalaClasses(30, 32, "B");
        SalaClasses salaC = new SalaClasses(27, 27, "C");
        
        //Execução de Metodos e print de Atributos de Objetos
        salaA.fecharSala();
        System.out.println(salaA );
        salaA.abrirSala();
        System.out.println(salaA );
        salaB.abrirSala();
        System.out.println(salaB );
        salaC.abrirSala();
        System.out.println(salaC);
        salaC.fecharSala();
        System.out.println(salaC);
    }
}
