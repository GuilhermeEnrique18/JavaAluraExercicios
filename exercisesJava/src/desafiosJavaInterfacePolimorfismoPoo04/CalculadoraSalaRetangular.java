package desafiosJavaInterfacePolimorfismoPoo04;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double altura;
    private double largura;

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double calcularArea(){
        return this.largura * this.altura;
    }

    public void calcularPerimetro(double altura, double largura){
        double perimetro = 2 * (altura + largura);
        System.out.println("O perimetro da sala é: " + perimetro);
    }
}
