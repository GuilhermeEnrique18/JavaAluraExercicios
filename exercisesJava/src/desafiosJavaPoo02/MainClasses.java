package desafiosJavaPoo02;

public class MainClasses {
    public static void main(String[] args) {
    Livro livro1 = new Livro();

    livro1.setTitulo("O senhor dos anéis");
    livro1.setAutor("J. R. R. Tolkien");

    livro1.getTitulo();
    livro1.getAutor();

    livro1.exibirDetalhes();

    }
}
