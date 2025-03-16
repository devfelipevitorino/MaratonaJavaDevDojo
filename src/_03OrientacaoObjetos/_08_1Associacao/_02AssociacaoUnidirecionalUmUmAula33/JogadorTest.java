package _03OrientacaoObjetos._08_1Associacao._02AssociacaoUnidirecionalUmUmAula33;

import _03OrientacaoObjetos._08_1Associacao._02AssociacaoUnidirecionalUmUmAula33.Domain.Jogador;
import _03OrientacaoObjetos._08_1Associacao._02AssociacaoUnidirecionalUmUmAula33.Domain.Time;

public class JogadorTest {
    public static void main(String[] args) {

        Jogador j1 = new Jogador("Ronaldo");
        Time time = new Time("Seleção Brasileira");

        j1.setTime(time);

        j1.imprime();
    }
}
