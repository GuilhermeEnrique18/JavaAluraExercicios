public class ExecutarClasses {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.cor = "vermelho";
        carro1.ano = 2010;
        carro1.modelo = "SUV";

        int resp = carro1.calculaIdadeCarro();
        carro1.exibirFichaTecnica();
        System.out.printf("\nIdade do carro: %d",resp);

    }
}
