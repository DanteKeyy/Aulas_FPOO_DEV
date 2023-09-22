/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

public class  Moto extends Veiculo {
private String comubstivel;
private String  tipoPartida;

    public Moto(CombustivelEnum combustivelEnum, PartidaEnum partidaEnum, String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm, boolean freioABs) {
        super(descricao, ano, cor, modelo, marca, valor, zerokm, freioABs);
        this.comubstivel = combustivelEnum.getTipoCombustivel();
        this.tipoPartida = partidaEnum.getTipoPartida();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Moto{" + "comubstivel=" + comubstivel + ", tipoPartida=" + tipoPartida + '}';
    }



    
}
