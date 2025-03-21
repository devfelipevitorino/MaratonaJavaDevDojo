package _03OrientacaoObjetos._12Enum._01EnumAula48;

import _03OrientacaoObjetos._12Enum._01EnumAula48.Domain.Cliente;
import _03OrientacaoObjetos._12Enum._01EnumAula48.Domain.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISCA);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}
