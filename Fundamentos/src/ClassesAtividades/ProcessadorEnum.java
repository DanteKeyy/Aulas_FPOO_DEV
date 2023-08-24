/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAtividades;

/**
 *
 * @author Aluno
 */
public enum ProcessadorEnum {
    //Enums
    INTEL_I3("Intel I3"),
    INTEL_I5("Intel i5"),
    INTEL_I7("Intel I7");
    
    //Enum "Completo"
    private String Processador;

    private ProcessadorEnum(String Processador) {
        this.Processador = Processador;
    }
    //Getter do Enum    
    public String getProcessador() {
        return Processador;
    }
    
}
