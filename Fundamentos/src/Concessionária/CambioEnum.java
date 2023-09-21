/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concessionária;

/**
 *
 * @author Aluno
 */
public enum CambioEnum {
    AUTOMATICO("Automático"),
    MANUAL("Manual");
    
    private String tipoCambio;

    private CambioEnum(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    
    
    
    
 
}
