/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança.Escola;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa {
    private boolean dedicacaoExclusiva;

    public Professor(boolean dedicacaoExclusiva, String nome, String email, int idade, String genero, boolean emaileGmail, boolean emaileYahoo) {
        super(nome, email, idade, genero, emaileGmail, emaileYahoo);
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    public boolean isDedicacaoExclusiva() {
        return dedicacaoExclusiva;
    }

 

 

    @Override
    public boolean verificarMaiorIdade() {
        return super.verificarMaiorIdade(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Professor{" + "dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }
    

      

    @Override
    public boolean isEmaileGmail() {
        return super.isEmaileGmail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getEmail() {
        return super.getEmail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean verificarDominioEmailyahoo(String email) {
        return super.verificarDominioEmailyahoo(email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public boolean verificarDedicacaoExclusiva(boolean dedicacaoExclusiva ) {
        if (this.dedicacaoExclusiva = true) {
            System.out.println("O professor tem uma dedicação exclusiva");
            return true;
        } else {
            System.out.println("O professor não tem uma dedicação exclusiva");
            return false;
        }
    }
    
    
}
