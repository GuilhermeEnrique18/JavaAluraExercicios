package desafioJavaHerancaPoo03;

public class GeradorPrimo extends NumerosPrimos{

    public int gerarPrimo(int ultimoPrimoConhecido){
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }

}
