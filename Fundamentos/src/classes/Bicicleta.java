package classes;

public class Bicicleta {
    //Atributos da classe: São as características, neste caso, as características da bicicleta.

    private int qtdeRodas;
    private boolean marchas;
    private int qtdeMarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidade;

    //Construtor da classe 
    public Bicicleta() {

    }

    // Construtor com argumentos
    public Bicicleta(int qtdeRodas, boolean marchas, int qtdeMarchas, String modelo, boolean temFreio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.marchas = marchas;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situacao = "parado";
       this.velocidade = 0;

    }

    // Metodos
    
    
   
    
    public void andar(int velocidade) {
        System.out.println("Bicicleta andando");
        this.situacao = ("Andando");
        this.velocidade =  velocidade;
        
    }
    
    
    
  public void freiar() {
      this.situacao = ("Freiando");
      this.velocidade -= 1;
  }  
  
  
    public boolean verificarFreio() {
        return this.temFreio;
    }
    

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", marchas=" + marchas + ", qtdeMarchas=" + qtdeMarchas + ", modelo=" + modelo + ", temFreio=" + temFreio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

    
    
    
}
