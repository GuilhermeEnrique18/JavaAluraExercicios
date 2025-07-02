package exerciciosJava;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para saber se par ou impar:");
        int n = sc.nextInt();

        if (n%2 == 0){
            System.out.printf("%d é par", n);
        } else{
            System.out.printf("%d é ímpar", n);
        }
    }
}
