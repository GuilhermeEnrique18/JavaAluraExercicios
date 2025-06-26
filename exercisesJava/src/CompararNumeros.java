import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero 1");
        int num1 = sc.nextInt();

        System.out.println("Digite o numero 2");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Iguais.");
        }else if (num1 != num2){
            System.out.println("Diferentes");
        }else if(num1 > num2){
            System.out.println("Numero 1 é maior");
        }else if(num1 < num2){
            System.out.println("Numero 2 é maior");
        }
    }

}
