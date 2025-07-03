package desafioJavaHerancaPoo03;

public class MainClasses {
    public static void main(String[] args) {
        ModeloCarro suv = new ModeloCarro();
        suv.defineModelo("suv");
        suv.definirPrecos(2000,5200,6770);
        suv.exibirInfo();
    }

}
