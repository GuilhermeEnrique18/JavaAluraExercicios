package exerciciosJava;

public class Carro {
    String modelo;
    int ano;
    String cor;
    int anoAtual = 2025;

    public void exibirFichaTecnica(){
        System.out.printf("Modelo: %s\nAno:%d\nCor: %s",modelo,ano,cor);
    }
    public int calculaIdadeCarro(){
        return anoAtual - ano;
    }
}