package _03OrientacaoObjetos._02Metodos.MetodosAula21_Exercicio;

import _03OrientacaoObjetos._02Metodos.MetodosAula21_Exercicio.Dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Elon Musk";
        funcionario.idade = 53;
        funcionario.salario = new double[]{1200, 1450, 1512};

        funcionario.imprimeDadosFuncionario();
        funcionario.MediaSalario();
    }
}
