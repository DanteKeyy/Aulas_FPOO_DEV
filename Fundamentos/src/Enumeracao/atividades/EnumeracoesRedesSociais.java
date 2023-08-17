/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class EnumeracoesRedesSociais {
    public static void main(String[] args) {
        RedesSociais redesSociais = new RedesSociais(EnumRedesSociais.facebook);
        System.out.println(redesSociais);
        redesSociais.setRede(EnumRedesSociais.instagram);
        System.out.println(redesSociais);
        redesSociais.setRede(EnumRedesSociais.twiiter);
        System.out.println(redesSociais);
    }
}
