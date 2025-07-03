package desafioJavaHerancaPoo03;

public class ContaCorrente extends ContaBancaria{
    private int mes;
    private int mesAtual = 1;
    private double valorTarifaMensal = 150;

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void cobrarTarifaMensal(){
        mesAtual =1;
        if (mesAtual != mes) {
            this.saldo -= this.valorTarifaMensal;
        } else {
            System.out.println("Sem tarifa a aplicar");
        }
    }

}
