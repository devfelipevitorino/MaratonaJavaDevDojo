package _03OrientacaoObjetos._12Enum._02EnumAula49;

import _03OrientacaoObjetos._12Enum._02EnumAula49.Domain.Cliente;
import _03OrientacaoObjetos._12Enum._02EnumAula49.Domain.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISCA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}
