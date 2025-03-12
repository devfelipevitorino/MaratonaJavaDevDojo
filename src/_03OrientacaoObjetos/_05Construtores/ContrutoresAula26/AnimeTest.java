package _03OrientacaoObjetos._05Construtores.ContrutoresAula26;

import _03OrientacaoObjetos._05Construtores.ContrutoresAula26.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive","TV",12,"Ação");

        Anime anime2 = new Anime();

        anime.imprime();

        anime2.imprime();
    }
}
