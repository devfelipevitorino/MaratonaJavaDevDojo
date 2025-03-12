package _03OrientacaoObjetos._03ModificadorDeAcesso.ModificadorDeAcessoAula22_23;

import _03OrientacaoObjetos._03ModificadorDeAcesso.ModificadorDeAcessoAula22_23.Dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(50);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
