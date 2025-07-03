package desafiosJavaInterfacePolimorfismoPoo04;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorEmDolar;

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }

    @Override
    public double converterDolarParaReal(){
        return valorEmDolar * 5.40;
    }


}
