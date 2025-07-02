package exerciciosJava;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 3;
        double ladoQuadrado=0;

        double baseT=0,alturaT=0;

        while (opcao == 3){
            System.out.println("1. Calcular a área do quadrado:\n" +
                    "2. Calcular área do círculo:\n" +
                    "3. Continuar");
            opcao = sc.nextInt();

            if (opcao == 1){

                System.out.println("Digite o 1º lado do quadrado");
                ladoQuadrado = sc.nextDouble();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.printf("A área do Quadrado é: %.2f\n",areaQuadrado);

            } else if (opcao == 2) {

                System.out.println("Digite a base do triangulo: ");
                baseT = sc.nextDouble();

                System.out.println("Digite a altura do triangulo: ");
                alturaT = sc.nextDouble();

                double areaT = (baseT * alturaT) / 2;
                System.out.printf("A área do Triangulo é: %.2f\n",areaT);

            }
            opcao = 3;
            System.out.println("Deseja continuar?\n" +
                    "3. Sim\n" +
                    "2. Não");
            opcao = sc.nextInt();

        }
    }
}
