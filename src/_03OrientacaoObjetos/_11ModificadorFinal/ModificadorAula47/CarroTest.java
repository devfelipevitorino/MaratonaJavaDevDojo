package _03OrientacaoObjetos._11ModificadorFinal.ModificadorAula47;

import _03OrientacaoObjetos._11ModificadorFinal.ModificadorAula47.Domain.Carro;
import _03OrientacaoObjetos._11ModificadorFinal.ModificadorAula47.Domain.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari");
        ferrari.imprime();
    }
}
