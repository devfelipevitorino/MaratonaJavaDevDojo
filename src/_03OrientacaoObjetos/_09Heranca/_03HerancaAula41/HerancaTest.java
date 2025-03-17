package _03OrientacaoObjetos._09Heranca._03HerancaAula41;

import _03OrientacaoObjetos._09Heranca._03HerancaAula41.Domain.Endereco;
import _03OrientacaoObjetos._09Heranca._03HerancaAula41.Domain.Funcionario;
import _03OrientacaoObjetos._09Heranca._03HerancaAula41.Domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        endereco.setRua("Rua 3");
        endereco.setCep("12345-678");

        pessoa.setNome("Felipe");
        pessoa.setCpf("123.234.456-78");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        funcionario.setNome("Felipe");
        funcionario.setCpf("123.234.456-78");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000);
        System.out.println("-----------------");
        funcionario.imprime();
        funcionario.comprovanteRecebimento();
    }
}
