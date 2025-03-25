package _03OrientacaoObjetos._15Polimorfismo._04PolimorfismoAula61;


import _03OrientacaoObjetos._15Polimorfismo._04PolimorfismoAula61.Domain.Computador;
import _03OrientacaoObjetos._15Polimorfismo._04PolimorfismoAula61.Domain.Produto;
import _03OrientacaoObjetos._15Polimorfismo._04PolimorfismoAula61.Domain.Tomate;
import _03OrientacaoObjetos._15Polimorfismo._04PolimorfismoAula61.Servico.CalculaImposto;

public class PolimorfismoTest {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryen 9", 3000);

        Tomate tomate = new Tomate("Tomate Cereja", 10);
        tomate.setDataValidade("11/12/2026");

        CalculaImposto.calcularImpostoProduto(tomate);
        CalculaImposto.calcularImpostoProduto(produto);

    }
}
