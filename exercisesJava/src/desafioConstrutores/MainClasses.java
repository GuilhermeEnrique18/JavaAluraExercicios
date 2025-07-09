package desafioConstrutores;

import java.util.ArrayList;

public class MainClasses {
    public static void main(String[] args) {
        Produto p1 = new Produto("Escova de Dentes",2.50,18);
        Produto p2 = new Produto("Pasta de Dentes",5.00,15);
        Produto p3 = new Produto("Fosfoto",2.50,10);
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Carne", 15.50, 5, "2025-09-12");
        System.out.println(produtoPerecivel1);

        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        System.out.println(listaProdutos.size());
        System.out.println(listaProdutos.get(2));
        System.out.println(p1.toString()); // Não é obrigatorio colocar o toString() pois está implicito so soutLN o toString. E como esse objeto é uma instancia da classe que tem o metodo que sobrescrevi, por herança e polimorfismo o java ja entende.
        System.out.println(p2);
        System.out.println(listaProdutos);
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }


    }

}
