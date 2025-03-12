package _03OrientacaoObjetos.ModificadorDeAcesso.ModificadorDeAcessoAula22;

import _03OrientacaoObjetos.ModificadorDeAcesso.ModificadorDeAcessoAula22.Dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(50);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
