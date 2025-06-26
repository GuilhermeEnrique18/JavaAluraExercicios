import java.util.Scanner;

public class PositivoOrNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para saber se é - ou +: ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Numero positivo.");
        }else{
            System.out.println("Numero negativo.");
        }
    }

}
