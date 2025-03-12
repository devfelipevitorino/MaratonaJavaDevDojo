package _03OrientacaoObjetos._04SobrecargaDeMetodos.SobrecargaDeMetodosAula25;

import _03OrientacaoObjetos._04SobrecargaDeMetodos.SobrecargaDeMetodosAula25.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive","TV",12);
        anime.init("Akudama Drive","TV",12,"Ação");

        anime.imprime();
    }
}
