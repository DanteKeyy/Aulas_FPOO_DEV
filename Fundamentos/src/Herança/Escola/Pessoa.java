/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança.Escola;

/**
 *
 * @author Aluno
 */
public class Pessoa implements ValidaPessoa{
    private String nome;
    private String email;
    private int idade;
    private String genero;
    private boolean emaileGmail;
    private boolean emaileYahoo;

    public Pessoa(String nome, String email, int idade, String genero, boolean emaileGmail, boolean emaileYahoo) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.genero = genero;
        this.emaileGmail = emaileGmail;
        this.emaileYahoo = emaileYahoo;
    }



    public boolean isEmaileGmail() {
        return emaileGmail;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", idade=" + idade + ", genero=" + genero + ", emaileGmail=" + emaileGmail + ", emaileYahoo=" + emaileYahoo + '}';
    }

 

    public String getEmail() {
        return email;
    }

    public boolean isEmaileYahoo() {
        return emaileYahoo;
    }
    
        

            



    

 


    public boolean verificarMaiorIdade () {
        if (this.idade >= 18 ) {
        return true;
    } else {
            return false;
        }
    }

   

    @Override
    public boolean verificarDominioEmailGmail(String email) {
        if (this.email.contains("@gmail.com")) {
            return this.emaileGmail = true;
        } else {
            return this.emaileGmail = false;
        }
    }

    @Override
    public boolean verificarDominioEmailyahoo(String email) {
        if (this.email.contains("@yahoo.com")) {
            return this.emaileYahoo = true;
        } else {
            return this.emaileYahoo = false;
        }
    }
    

    
   
}
