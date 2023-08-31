package orientacaoobjetos;


public class Posts implements ClassificacaoPosts{
    
    //Criando os Atributos da Classe
    
    private String nomedeUsuario;
    private String texto;
    private int estrelas;
    
    //Criando os Construtores
    
    public Posts(String nomedeUsuario, String texto, int estrelas) {
        this.nomedeUsuario = nomedeUsuario;
        this.texto = texto;
        this.estrelas = estrelas;
        
        //Criando os Getters
    }

    public String getNomedeUsuario() {
        return nomedeUsuario;
    }

    public String getTexto() {
        return texto;
    }

    public int getEstrelas() {
        return estrelas;
    }
    
    //Criando os metodos da classe

    @Override
    public String toString() {
        return "Posts{" + "nomedeUsuario=" + nomedeUsuario + ", texto=" + texto + ", estrelas=" + estrelas + '}';
    }
    

    @Override
    public int avaliarPostMuitoRuim(int estrelas) {
        System.out.println("O post foi avaliado como Muito Ruim");
        return this.estrelas = 1;
        
    }

    @Override
    public int avaliarPostRuim(int estrelas) {
        System.out.println("O post foi avaliado como Ruim");
        return this.estrelas = 2;
    }

    @Override
    public int avaliarPostMediano(int estrelas) {
        System.out.println("O post foi avaliado como Mediano");
        return this.estrelas = 3;
    }

    @Override
    public int avaliarPostBom(int estrelas) {
        System.out.println("O post foi avaliado como Bom");
        return this.estrelas = 4;
    }

    @Override
    public int avaliarPostIncrivel(int estrelas) {
        System.out.println("O post foi avaliado como Fantastico");
        return this.estrelas = 5;
    }
}
