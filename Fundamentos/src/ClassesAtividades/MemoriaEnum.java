package ClassesAtividades;

public enum MemoriaEnum {
    //Enums
        DOIS_GIGABYTES("2 GB", 2),
        QUATRO_GIGABYTES("4 GB", 4),
        OITO_GIGABYTES("8 GB", 8),
        DEZESSEIS_GIGABYTES("16 GB", 16);
    //Enum "Completo"
        private String Memoria;
        private int NMemoria;
    private MemoriaEnum(String Memoria, int NMemoria) {
        this.Memoria = Memoria;
    }
    //Getter para o Enum
    public String getMemoria() {
        return Memoria;
        
    }
    public int getNMemoria() {
        return NMemoria;
    }
    
}
