package desafiosJavaPoo02;

public class MainClasses {
    public static void main(String[] args) {
    Produto produto1 = new Produto();
    produto1.setNome("Parafusadeira");
    produto1.setPreco(200);
    System.out.println(produto1.getNome());
    System.out.println(produto1.getPreco());
    System.out.println(produto1.aplicarDesconto(15));

    }
}
