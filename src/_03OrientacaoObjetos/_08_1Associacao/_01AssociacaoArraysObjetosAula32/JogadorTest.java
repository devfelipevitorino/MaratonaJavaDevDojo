package _03OrientacaoObjetos._08_1Associacao._01AssociacaoArraysObjetosAula32;

import _03OrientacaoObjetos._08_1Associacao._01AssociacaoArraysObjetosAula32.Domain.Jogador;

public class JogadorTest {
    public static void main(String[] args) {

        Jogador j1 = new Jogador("Ronaldo");
        Jogador j2 = new Jogador("Romario");
        Jogador j3 = new Jogador("Cafu");

        Jogador[] jogadores = {j1,j2,j3};

        for (Jogador jogador : jogadores ){
            jogador.imprime();
        }

    }
}
