package _03OrientacaoObjetos._06BlocosInicializacao._01BlocoInicializacaoAula28;

import _03OrientacaoObjetos._06BlocosInicializacao._01BlocoInicializacaoAula28.Domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        //Anime anime = new Anime();

        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
