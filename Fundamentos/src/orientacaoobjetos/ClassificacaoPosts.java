/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package orientacaoobjetos;

/**
 *
 * @author Aluno
 */
public interface ClassificacaoPosts {
    //Criando os Atributos da Interface
    int UMA_ESTRELA = 1;
    int DUAS_ESTRELAS = 2;
    int TRES_ESTRELAS = 3;
    int QUATRO_ESTRELAS = 4;
    int CINCO_ESTRELAS = 5;
    
    //Criando os Metodos da Interface
    
    public int avaliarPostMuitoRuim(int estrelas);
    public int avaliarPostRuim(int estrelas);
    public int avaliarPostMediano(int estrelas);
    public int avaliarPostBom(int estrelas);
    public int avaliarPostIncrivel(int estrelas);
}
