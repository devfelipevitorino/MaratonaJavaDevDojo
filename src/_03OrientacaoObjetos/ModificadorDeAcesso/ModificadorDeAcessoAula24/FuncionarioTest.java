package _03OrientacaoObjetos.ModificadorDeAcesso.ModificadorDeAcessoAula24;

import _03OrientacaoObjetos.ModificadorDeAcesso.ModificadorDeAcessoAula24.Dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Elon Musk");
        funcionario.setIdade(53);
        funcionario.setSalario(new double[]{1200, 1450, 1512});

        funcionario.imprimeDadosFuncionario();
        funcionario.MediaSalario();
    }
}
