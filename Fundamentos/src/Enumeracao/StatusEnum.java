
package Enumeracao;


public enum StatusEnum {
    EM_PREPARACAO("Em prepatação"),
    EM_TRANSPORTE("Em transporte"),
    ENTREGUE("Entregue ao cliente");
    
    private String stauts;
    
    private StatusEnum(String status) {
        this.stauts = status;
    }
    public String getStatus() {
        return this.stauts;
}
}
