package _03OrientacaoObjetos.Metodos.MetodosAula16;

import _03OrientacaoObjetos.Metodos.MetodosAula16.Dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2);

        System.out.println(num1);
        System.out.println(num2);

        // Variáveis de tipo primitivo enviam uma cópia para o metodo, mantendo o valor original inalterado.

    }
}
