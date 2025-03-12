package _03OrientacaoObjetos._02Metodos.MetodosAula14;

import _03OrientacaoObjetos._02Metodos.MetodosAula14.Dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumero(4,0);
        System.out.println(result);
    }
}
