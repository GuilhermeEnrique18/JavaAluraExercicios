package exerciciosJava;

public class ProdutoXQuantidade {
    public static void main(String args[]){
        double precoProduto = 10.50;
        int quantidade = 250;
        double total = precoProduto * quantidade;

        System.out.printf("O valor total do estoque é de: %.2f", total);

    }
}
