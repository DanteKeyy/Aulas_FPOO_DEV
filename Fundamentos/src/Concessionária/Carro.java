package Concessionária;


public class Carro extends Veiculo {
    private int qtdePortas;
    private String modeloCambio;
    private String combustivel;

    public Carro(int qtdePortas, CambioEnum cambioEnum, CombustivelEnum combustivelEnum, String descricao, int ano, 
            String cor, String modelo, String marca, double valor, boolean zerokm, boolean freioABs) {
        super(descricao, ano, cor, modelo, marca, valor, zerokm, freioABs);
        this.qtdePortas = qtdePortas;
        this.modeloCambio = cambioEnum.getTipoCambio();
        this.combustivel = combustivelEnum.getTipoCombustivel();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +  "Carro{" + "qtdePortas=" + qtdePortas + ", modeloCambio=" + modeloCambio + ", combustivel=" + combustivel + '}';
   
    }

 
    
    
}
