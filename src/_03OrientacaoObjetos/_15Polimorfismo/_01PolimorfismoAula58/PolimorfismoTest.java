package _03OrientacaoObjetos._15Polimorfismo._01PolimorfismoAula58;

import _03OrientacaoObjetos._15Polimorfismo._01PolimorfismoAula58.Domain.Computador;
import _03OrientacaoObjetos._15Polimorfismo._01PolimorfismoAula58.Domain.Tomate;
import _03OrientacaoObjetos._15Polimorfismo._01PolimorfismoAula58.Servico.CalculaImposto;

public class PolimorfismoTest {
    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);

        Tomate tomate = new Tomate("Tomate cereja", 10);

        CalculaImposto.calcularImpostoComputador(computador);
        CalculaImposto.calcularImpostoTomate(tomate);
    }
}
