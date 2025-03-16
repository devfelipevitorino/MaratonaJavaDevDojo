package _03OrientacaoObjetos._08Associacao._04AssociacaoBidirecionalAula35;

import _03OrientacaoObjetos._08Associacao._04AssociacaoBidirecionalAula35.Domain.Jogador;
import _03OrientacaoObjetos._08Associacao._04AssociacaoBidirecionalAula35.Domain.Time;

public class JogadorTest {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("Seedorf");
        Time time = new Time("Inter de Milão");

        jogador.setTime(time);
        jogador2.setTime(time);

        Jogador[] jogadores = {jogador, jogador2};
        time.setJogadores(jogadores);

        System.out.println("---JOGADOR---");
        jogador.imprime();

        System.out.println("---TIME---");
        time.imprime();

    }
}
