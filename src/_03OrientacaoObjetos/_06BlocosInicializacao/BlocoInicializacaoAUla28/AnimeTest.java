package _03OrientacaoObjetos._06BlocosInicializacao.BlocoInicializacaoAUla28;

import _03OrientacaoObjetos._06BlocosInicializacao.BlocoInicializacaoAUla28.Domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        //Anime anime = new Anime();

        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
