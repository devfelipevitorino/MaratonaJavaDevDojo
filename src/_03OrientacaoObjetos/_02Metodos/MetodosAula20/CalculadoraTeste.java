package _03OrientacaoObjetos._02Metodos.MetodosAula20;

import _03OrientacaoObjetos._02Metodos.MetodosAula20.Dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int[] arr = {19,42,21,66,4};

        calculadora.somaArray(arr);
//      calculadora.somaArray(new int[]{1,2,3,4,5});

        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9);

    }
}
