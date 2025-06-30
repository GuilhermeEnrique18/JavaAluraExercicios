public class ExecutarClasses {
    public static void main(String[] args) {
        Musica musica01 = new Musica();

        musica01.titulo = "Me namora";
        musica01.artista = "Natiruts";
        musica01.anoLancamento = 2012;

        musica01.exibeFichaTecnica();

        musica01.avalia(4.5);
        musica01.avalia(3.8);
        musica01.avalia(5.0);

        double mediaAvaliacoes = musica01.getMedia();
        System.out.printf("Média das avaliações: %.2f", mediaAvaliacoes);


        //Pessoa pessoa01 = new Pessoa();
        /*double resp = CalculadoraDobro.dobroNumero(5);
        System.out.println(resp);
        */
    }
}
