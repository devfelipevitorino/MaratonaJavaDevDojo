package _03OrientacaoObjetos.Metodos.MetodosAula21;

import _03OrientacaoObjetos.Metodos.MetodosAula21.Dominio.Funcionario;

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
