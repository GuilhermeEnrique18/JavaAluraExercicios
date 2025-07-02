package exerciciosJava;

public class ExecutarClasses {
    public static void main(String[] args) {

        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Guilherme";
        meuAluno.idade = 21;

        meuAluno.exibeInformacoes();
    }
}
