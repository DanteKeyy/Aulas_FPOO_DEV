/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAtividades;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Cursos {
    public static void main(String[] args) {
        CursoClasses DEV = new CursoClasses("DEV", "Um curso de programação web-back end", CategoriaEnum.TI);
        CursoClasses ADM = new CursoClasses("ADM", "Curso de administração financeira e principios de contabilidade", CategoriaEnum.ADMINISTRACAO);
        CursoClasses Calderaria = new CursoClasses("Calderaria", "Um curso que explora as caracteristicas e propriedades de metais, forjando itens na pratica ", CategoriaEnum.METALURGIA);
        System.out.println(DEV);
        DEV.verificarDisponibildiade();
        DEV.entrarNoCurso();
        System.out.println(ADM);
        ADM.verificarDisponibildiade();
        ADM.entrarNoCurso();
        System.out.println(Calderaria);
        Calderaria.verificarDisponibildiade();
        Calderaria.entrarNoCurso();

    
   
    }
}
