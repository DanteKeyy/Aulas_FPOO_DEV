package Enumeracao.atividades;

public class EnumeracaoLivros {
    public static void main(String[] args) {
    Livros livros = new Livros(EnumLivros.romance);
        System.out.println(livros);
        livros.setGenero(EnumLivros.suspense);
        System.out.println(livros);
        livros.setGenero(EnumLivros.horror);
        System.out.println(livros);
        livros.setGenero(EnumLivros.drama);
        System.out.println(livros);
        livros.setGenero(EnumLivros.Aventura);
        System.out.println(livros);}
}
