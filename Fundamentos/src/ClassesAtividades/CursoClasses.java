/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAtividades;

/**
 *
 * @author Aluno
 */
public class CursoClasses {
    //Atributos da Classe
    private String nome;
    private String descricao;
    private CategoriaEnum categoria;
    
    //Construtor

    public CursoClasses(String nome, String descricao, CategoriaEnum categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    
    //Metodos
    
    
    public void verificarDisponibildiade(){
        if (nome == "DEV") {
            System.out.println("Curso disponivel");
            System.out.println("Categoria do curtso: " + categoria);
            System.out.println("Descrição: "+ descricao );
        } if (nome == "ADM") {
            System.out.println("Curso Disponivel");
             System.out.println("Categoria do curtso: " + categoria);
            System.out.println("Descrição: "+ descricao );
        } else {
            System.out.println("Curso indisponivel");
            System.out.println("Categoria do curtso: " + categoria);
            System.out.println("Descrição: "+ descricao );
        }
    }
    public void entrarNoCurso() {
        if (nome == "DEV") {
            System.out.println("Entrada Aprovada, voce faz parte do curso de DEV");
        } if (nome == "ADM") {
            System.out.println("Entrada aprovada, voce faz parte do curso de ADM");
        } else {
            System.out.println("Entrada negada");
        }
        
    }

    @Override
    public String toString() {
        return "CursoClasses{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + '}';
    }

    
}
