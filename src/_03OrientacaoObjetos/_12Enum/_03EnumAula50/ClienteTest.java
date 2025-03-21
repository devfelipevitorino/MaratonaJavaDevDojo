package _03OrientacaoObjetos._12Enum._03EnumAula50;

import _03OrientacaoObjetos._12Enum._03EnumAula50.Domain.Cliente;
import _03OrientacaoObjetos._12Enum._03EnumAula50.Domain.TipoCliente;
import _03OrientacaoObjetos._12Enum._03EnumAula50.Domain.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISCA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));
    }
}
