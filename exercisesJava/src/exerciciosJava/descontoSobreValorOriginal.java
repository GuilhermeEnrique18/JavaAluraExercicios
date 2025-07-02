package exerciciosJava;

public class descontoSobreValorOriginal {
    public static void main(String args[]){
        double precoOriginal = 450.00;
        double percentualDesconto = 25;
        double desconto = precoOriginal * (percentualDesconto/100);
        double precoDescontado = precoOriginal - desconto;

        System.out.printf("O valor original do produto é: %.2f. " +
                "O desconto solicitado foi de %.2f porcento. Produto com desconto: %.2f",
                precoOriginal,percentualDesconto, precoDescontado);
    }
}
