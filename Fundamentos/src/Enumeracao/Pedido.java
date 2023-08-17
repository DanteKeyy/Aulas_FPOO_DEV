
package Enumeracao;

public class Pedido {
private String descricao;
private double valor;
private String Status;

    public Pedido(String descricao, double valor, String Status) {
        this.descricao = descricao;
        this.valor = valor;
        this.Status = Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    

    @Override
    public String toString() {
        return "Pedido{" + "descricao=" + descricao + ", valor=" + valor + ", Status=" + Status + '}';
    }


}
