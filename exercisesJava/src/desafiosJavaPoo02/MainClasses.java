package desafiosJavaPoo02;

public class MainClasses {
    public static void main(String[] args) {
    Aluno aluno1 = new Aluno();
    aluno1.setNome("Guilherme");
    aluno1.setNota(7);
    aluno1.setNota(7);
    aluno1.setNota(7);
    aluno1.setNota(7);
    System.out.println(aluno1.getNome());
    if (aluno1.calcularMedia() < 7) {
        System.out.println("Média do aluno foi: " + aluno1.calcularMedia() + " e ele foi reprovado.");
    } else {
        System.out.println("Média do aluno foi: " + aluno1.calcularMedia() + " e ele foi aprovado.");
    }
    }
}
