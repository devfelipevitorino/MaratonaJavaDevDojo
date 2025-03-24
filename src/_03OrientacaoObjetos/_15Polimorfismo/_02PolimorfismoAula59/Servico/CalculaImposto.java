package _03OrientacaoObjetos._15Polimorfismo._02PolimorfismoAula59.Servico;

import _03OrientacaoObjetos._15Polimorfismo._02PolimorfismoAula59.Domain.Computador;
import _03OrientacaoObjetos._15Polimorfismo._02PolimorfismoAula59.Domain.Tomate;

public class CalculaImposto {

    public static void calcularImpostoComputador(Computador computador){
        System.out.println("------------------------------------------");
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();

        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto do computador: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("------------------------------------------");
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();

        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto do tomate: " + imposto);
    }

}
