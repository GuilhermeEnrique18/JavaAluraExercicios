package desafiosJavaInterfacePolimorfismoPoo04;

public class MainClasses {
    public static void main(String[] args) {
    Produto produto1 = new Produto();
    Servico servico1 = new Servico();
    produto1.setNome("Sandalia Havaiana");
    produto1.setPrecoUnitario(50);
    produto1.calcularPrecoTotal(5);
    produto1.aplicarDesconto(5);

    System.out.println(produto1.calcularPrecoTotal(1));
    servico1.aplicarDesconto(10);


    }
}
