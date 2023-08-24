/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
        // Atributos dos  alunos
    private String nome;
    private String email;
    private long ra;
    
    //Construtor da classe

    public Aluno(String nome, String email, long ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
    }
    
    //Metodos 

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + '}';
    }
    
    public String criarEmailEducacional() {
        this.email = this.nome + "escola@educacao.com";
        
        
        return this.email;
    }
    
    public long gerarRA() {
        this.ra = System.currentTimeMillis();
        return this.ra;
    }
    
    
    
    
}
