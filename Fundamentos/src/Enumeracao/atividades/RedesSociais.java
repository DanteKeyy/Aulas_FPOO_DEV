/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class RedesSociais {
    private EnumRedesSociais Rede;

    public RedesSociais(EnumRedesSociais Rede) {
        this.Rede = Rede;
    }

    @Override
    public String toString() {
        return "RedesSociais{" + "Rede=" + Rede + '}';
    }

    public void setRede(EnumRedesSociais Rede) {
        this.Rede = Rede;
    }
    
}
