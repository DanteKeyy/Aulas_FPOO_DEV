
package Enumeracao;


public enum StatusEnum {
    EM_PREPARACAO("Em prepatação"),
    EM_TRANSPORTE("Em transporte"),
    ENTREGUE("Entregue ao cliente");
    
    private String status;
    
    private StatusEnum(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
}
}
