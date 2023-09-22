/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança.Escola;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa {
    private String RM;

    public Aluno(String RM, String nome, String email, int idade, String genero, boolean emaileGmail, boolean emaileYahoo) {
        super(nome, email, idade, genero, emaileGmail, emaileYahoo);
        this.RM = RM;
    }

    

    public String getRM() {
        return RM;
    }







    @Override
    public boolean verificarMaiorIdade() {
        return super.verificarMaiorIdade(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

      
              
    @Override
    public String toString() {
        return  super.toString() + "\n" + "Aluno{" + "RM=" + RM + '}';
    }

    @Override
    public boolean verificarDominioEmailGmail(String email) {
        return super.verificarDominioEmailGmail(email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getEmail() {
        return super.getEmail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean verificarDominioEmailyahoo(String email) {
        return super.verificarDominioEmailyahoo(email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void caracteresRM(String RM) {
        System.out.println("O RM do aluno tem "+ RM.length() + " caracteres");
    }

    
}



        

