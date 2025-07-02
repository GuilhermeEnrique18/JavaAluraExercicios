package desafiosJavaPoo02;

public class Produto {
    private String nome;
    private double preco;


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }

    public double aplicarDesconto( double porcentagemDesconto){
        double valorDescontado = (this.preco * porcentagemDesconto) / 100;
        return this.preco - valorDescontado;
    }
}
