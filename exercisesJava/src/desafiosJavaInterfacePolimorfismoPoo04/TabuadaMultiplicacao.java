package desafiosJavaInterfacePolimorfismoPoo04;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int n) {
        for(int i = 0; i <= 10; i++){
            int numMultiplicado = n * i;
            System.out.printf("%d x %d = %d\n", n, i, numMultiplicado);
        }
    }
}
