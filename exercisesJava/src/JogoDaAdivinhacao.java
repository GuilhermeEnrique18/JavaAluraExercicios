import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100);
        int numEscolhido = 0;
        int tentativas = 5;

        System.out.println(numAleatorio);
        System.out.println("Bem vindo ao jogo da adivinhação!");

        while(tentativas != 0){

            System.out.printf("Digite um número entre 0 e 100 para descobrir! Você tem %d tentativas!", tentativas);
            numEscolhido = sc.nextInt();
            tentativas--;

            if (numEscolhido == numAleatorio ){
                System.out.printf("Parabéns! Você acertou com %d tentativas. O número era %d.",tentativas, numAleatorio);
                break;
            }else if (tentativas == 0){
                System.out.println("Você não conseguiu acertar o número em 5 tentativas. O número era: %d\",numAleatorio");
            } else if (numEscolhido > numAleatorio) {
                System.out.printf("Errado! Você tem mais %d tentativas e o número é menor! \n",tentativas);
            }else{
                System.out.printf("Errado! Você tem mais %d tentativas e o número é maior! \n",tentativas);
            }

        }
    }
}



