package exerciciosJava;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numAvaliacoes;




    void exibeFichaTecnica(){
        System.out.printf("Titulo: %s\nArtista: %s\nAno de lançamento: %d\n",titulo,artista,anoLancamento);
    }
    void avalia(double nota) {
        somaAvaliacao += nota;
        numAvaliacoes++;
    }
    double getMedia(){
        return somaAvaliacao / numAvaliacoes;
    }

}
