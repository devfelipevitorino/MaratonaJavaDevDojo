package _03OrientacaoObjetos._15Polimorfismo._02PolimorfismoAula59;

import _03OrientacaoObjetos._15Polimorfismo._02PolimorfismoAula59.Domain.Computador;
import _03OrientacaoObjetos._15Polimorfismo._02PolimorfismoAula59.Domain.Produto;
import _03OrientacaoObjetos._15Polimorfismo._02PolimorfismoAula59.Domain.Tomate;

public class PolimorfismoTest {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("----------------------------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

        
    }
}
