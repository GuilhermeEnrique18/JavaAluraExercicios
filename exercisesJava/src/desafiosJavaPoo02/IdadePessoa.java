package desafiosJavaPoo02;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void verificarIdade(){
        if (this.idade < 18){
            System.out.println("Você é menor de idade");
        } else{
            System.out.println("Você é maior de idade");
        }
    }
}
