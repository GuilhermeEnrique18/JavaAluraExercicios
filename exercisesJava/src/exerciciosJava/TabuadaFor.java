package exerciciosJava;

import java.util.Scanner;
public class TabuadaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTabuada = 0;
        int numCalculado = 0;

        System.out.println("Digite um número para calcular a tabuada: ");
        numTabuada = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            numCalculado = numTabuada * i;
            System.out.printf("%d x %d = %d\n",i,numTabuada,numCalculado);

        }
    }
}
