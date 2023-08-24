/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAtividades;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {
    //Enums
    TI("T.I"),
    ADMINISTRACAO("Administração"),
    METALURGIA("Metalurgia");
    
    //Enum "Completo"
    private String categoria;

    private CategoriaEnum(String Categoria) {
        this.categoria = categoria;
    }
    //Metodo
    public String getCategoria() {
        return categoria;
    }
    
    
    
    
}
