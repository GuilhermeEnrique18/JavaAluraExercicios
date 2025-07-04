package desafiosJavaInterfacePolimorfismoPoo04;

public class MainClasses {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao celcius = new ConversorTemperaturaPadrao();
        ConversorTemperaturaPadrao fahrenheit = new ConversorTemperaturaPadrao();

        fahrenheit.setTempFahrenheit(77);
        System.out.println("77 fahrenheit em celcius é: " + fahrenheit.fahrenheitParaCelsius());
        celcius.celsiusParaFahrenheit(25);

    }
}
