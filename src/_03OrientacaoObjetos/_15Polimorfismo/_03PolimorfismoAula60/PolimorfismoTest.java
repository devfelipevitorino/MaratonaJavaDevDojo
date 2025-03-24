package _03OrientacaoObjetos._15Polimorfismo._03PolimorfismoAula60;

import _03OrientacaoObjetos._15Polimorfismo._03PolimorfismoAula60.Domain.Computador;
import _03OrientacaoObjetos._15Polimorfismo._03PolimorfismoAula60.Domain.Produto;
import _03OrientacaoObjetos._15Polimorfismo._03PolimorfismoAula60.Domain.Televisao;
import _03OrientacaoObjetos._15Polimorfismo._03PolimorfismoAula60.Domain.Tomate;
import _03OrientacaoObjetos._15Polimorfismo._03PolimorfismoAula60.Servico.CalculaImposto;

public class PolimorfismoTest {
    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 5000);

        CalculaImposto.calcularImpostoProduto(computador);
        CalculaImposto.calcularImpostoProduto(tomate);
        CalculaImposto.calcularImpostoProduto(televisao);

    }
}
