package desafioJavaHerancaPoo03;

public class MainClasses {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();

        conta1.depositar(2500);
        System.out.println(conta1.consultarSaldo());
        conta1.sacar(500);
        System.out.println(conta1.consultarSaldo());

        ContaCorrente contaCorrente1 = new ContaCorrente();
        contaCorrente1.depositar(4000);
        System.out.println(contaCorrente1.consultarSaldo());
        contaCorrente1.sacar(500);
        System.out.println(contaCorrente1.consultarSaldo());
        contaCorrente1.setMes(2);
        contaCorrente1.cobrarTarifaMensal();
        System.out.println(contaCorrente1.consultarSaldo());

    }

}
