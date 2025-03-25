package _03OrientacaoObjetos._15Polimorfismo._04PolimorfismoAula61.Servico;

import _03OrientacaoObjetos._15Polimorfismo._04PolimorfismoAula61.Domain.Produto;
import _03OrientacaoObjetos._15Polimorfismo._04PolimorfismoAula61.Domain.Tomate;

public class CalculaImposto {
    public static void calcularImpostoProduto(Produto produto){
        System.out.println("------------------------------------------");
        System.out.println("Relatório de imposto do tomate");
        double imposto = produto.calcularImposto();

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto do produto: " + imposto);

        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            //((Tomate) produto).getDataValidade();
            System.out.println(tomate.getDataValidade());
        }
    }
}
