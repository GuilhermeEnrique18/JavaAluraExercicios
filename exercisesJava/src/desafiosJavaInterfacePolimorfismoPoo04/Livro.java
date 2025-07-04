package desafiosJavaInterfacePolimorfismoPoo04;

public class Livro implements Calculavel{
    private double precoOriginal;
    private double desconto;

    public void setPrecoOriginal(double precoOriginal){
        this.precoOriginal = precoOriginal;

    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal(){
        double valorDesconto = (precoOriginal * this.desconto) / 100;
        return precoOriginal - desconto;
    }
}
