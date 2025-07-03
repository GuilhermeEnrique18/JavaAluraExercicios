package desafioJavaHerancaPoo03;

public class ContaBancaria {
    protected double saldo;


    public void depositar(double valorDepositado){
        this.saldo += valorDepositado;
    }
    public void sacar(double valorSacado){
        this.saldo -= valorSacado;
    }
    public double consultarSaldo(){
        return this.saldo;
    }
}
