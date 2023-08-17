/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Meses {
    private int numeroMes;
    private String mes;

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    

    public Meses(String mes, int numeroMes) {
        this.mes = mes;
        this.numeroMes = numeroMes;
    }

    @Override
    public String toString() {
        return "Meses{" + "mes=" + mes + ", numeroMes=" + numeroMes + '}';
    }
    
    
}
