package _03OrientacaoObjetos._15Polimorfismo._01PolimorfismoAula58.Servico;

import _03OrientacaoObjetos._15Polimorfismo._01PolimorfismoAula58.Domain.Computador;
import _03OrientacaoObjetos._15Polimorfismo._01PolimorfismoAula58.Domain.Tomate;

public class CalculaImposto {

    public static void calcularImpostoComputador(Computador computador){
        System.out.println("------------------------------------------");
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.CalcularImposto();

        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto do computador: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("------------------------------------------");
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.CalcularImposto();

        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto do tomate: " + imposto);
    }

}
