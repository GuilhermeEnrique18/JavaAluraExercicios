package desafiosJavaInterfacePolimorfismoPoo04;

public class MainClasses {
    public static void main(String[] args) {
        CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular();

        sala1.setLargura(4);
        sala1.setAltura(5);
        System.out.println("A área da sala é: " + sala1.calcularArea());
        sala1.calcularPerimetro(5,4);

    }
}
