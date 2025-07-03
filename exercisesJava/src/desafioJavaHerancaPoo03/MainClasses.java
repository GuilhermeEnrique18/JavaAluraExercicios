package desafioJavaHerancaPoo03;

public class MainClasses {
    public static void main(String[] args) {

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificaSePrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

    }

}
