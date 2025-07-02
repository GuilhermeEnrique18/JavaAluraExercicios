package exerciciosJava;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber seu fatorial: ");
        int n = sc.nextInt();

        int nFatorial = 1;

        for(int i = 1; i <= n; i++){
            nFatorial *= i;
        }
       System.out.println(nFatorial);
    }
}
