package _03OrientacaoObjetos._11Modificador.ModificadorAula46;

import _03OrientacaoObjetos._11Modificador.ModificadorAula46.Domain.Carro;
import _03OrientacaoObjetos._11Modificador.ModificadorAula46.Domain.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
