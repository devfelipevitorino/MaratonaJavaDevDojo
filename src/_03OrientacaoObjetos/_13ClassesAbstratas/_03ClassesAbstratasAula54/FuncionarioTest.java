package _03OrientacaoObjetos._13ClassesAbstratas._03ClassesAbstratasAula54;

import _03OrientacaoObjetos._13ClassesAbstratas._03ClassesAbstratasAula54.Domain.Desenvolvedor;
import _03OrientacaoObjetos._13ClassesAbstratas._03ClassesAbstratasAula54.Domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {

//      Funcionario funcionario = new Funcionario("Zoro", 2000);
//      System.out.println(funcionario);

        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(desenvolvedor);

        desenvolvedor.imprime();
        gerente.imprime();
    }
}
