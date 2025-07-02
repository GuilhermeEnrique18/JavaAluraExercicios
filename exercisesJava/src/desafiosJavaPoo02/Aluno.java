package desafiosJavaPoo02;

public class Aluno {
    private String nome;
    private double notas;
    private double somaNotas;
    private int quantidadeNotas;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNota(double notas){
        this.notas = notas;
        this.quantidadeNotas++;
        this.somaNotas += notas;
    }
    public String getNome(){
        return this.nome;
    }
    public double getNota(){
        return this.notas;
    }

    public double calcularMedia(){
        return somaNotas / quantidadeNotas;
    }
}