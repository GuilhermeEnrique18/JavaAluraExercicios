package desafiosJavaInterfacePolimorfismoPoo04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private double tempFahrenheit;

    public void setTempFahrenheit(double tempFahrenheit){
        this.tempFahrenheit = tempFahrenheit;
    }

    @Override
    public void celsiusParaFahrenheit(double tempCelcius) {
        double fahrenheitConvertido = (tempCelcius * 1.8) + 32;
        System.out.println(tempCelcius + "º em Fahrenheit é: " + fahrenheitConvertido);
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (this.tempFahrenheit - 32) * 5/9;
    }
}
