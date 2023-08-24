package ClassesAtividades;

public class SalaClasses {
    //Atributos da classe
    private int estudantes;
    private int  Carteiras;
   private String Sala;
   private String Status;
   
   //Construtor 

    public SalaClasses(int estudantes, int Carteiras, String Sala) {
        this.estudantes = estudantes;
        this.Carteiras = Carteiras;
        this.Sala = Sala;
        
    }
   
   //Metodos
public void abrirSala() {
    this.Status = "Aberta";
    System.out.println("A sala "+ Sala + " Esta aberta");
    
}
    public void fecharSala() {
        this.Status = "fechado";
        System.out.println("A sala" + Sala + " Esta fechada");
    }
    
    
    
    
    //toString para poder imprimir os atributos
    @Override
    public String toString() {
        return "SalaClasses{" + "estudantes=" + estudantes + ", Carteiras=" + Carteiras + ", Sala=" + Sala + ", Status=" + Status +'}';
    }

    public String getStatus() {
        return Status;
    }
    
    
   
 
}
