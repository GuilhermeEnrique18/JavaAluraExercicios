import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double tempCel = 0, tempFahr = 0;
        System.out.println("Digite uma temperatura em graus celsiu para passar para Fahrenheit");
        tempCel = sc.nextDouble();
        tempFahr = (tempCel * 1.8) + 32;
        System.out.printf("%.2f graus Celsius em Fahrenheit é: %.2f",tempCel,tempFahr);


    }
}