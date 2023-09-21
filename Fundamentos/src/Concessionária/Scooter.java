package Concessionária;


public class Scooter extends Veiculo{
    private int potenciaBateria;

    public Scooter(int potenciaBateria, String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm, boolean freioABs) {
        super(descricao, ano, cor, modelo, marca, valor, zerokm, freioABs);
        this.potenciaBateria = potenciaBateria;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Scooter{" + "potenciaBateria=" + potenciaBateria + '}';
    }
    
    
}
