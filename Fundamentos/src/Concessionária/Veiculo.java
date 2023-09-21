package Concessionária;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Veiculo {
    	private String descricao;
	private int ano;
	private String cor;
	private String modelo;
	private String marca;
	private double valor;
	private boolean zerokm;
	private boolean freioABs;

    public Veiculo(String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm, boolean freioABs) {
        this.descricao = descricao;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.zerokm = zerokm;
        this.freioABs = freioABs;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isZerokm() {
        return zerokm;
    }

    public void setZerokm(boolean zerokm) {
        this.zerokm = zerokm;
    }

    public boolean isFreioABs() {
        return freioABs;
    }

    public void setFreioABs(boolean freioABs) {
        this.freioABs = freioABs;
    }
    

    @Override
    public String toString() {
        return "Veiculo{" + "descricao=" + descricao + ", ano=" + ano + ", cor=" + cor + ", modelo=" + modelo + ", marca=" + marca + ", valor=" + valor + ", zerokm=" + zerokm + ", freioABs=" + freioABs + '}';
    }
    
        
}
