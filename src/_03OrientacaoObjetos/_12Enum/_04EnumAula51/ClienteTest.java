package _03OrientacaoObjetos._12Enum._04EnumAula51;

import _03OrientacaoObjetos._12Enum._04EnumAula51.Domain.Cliente;
import _03OrientacaoObjetos._12Enum._04EnumAula51.Domain.TipoCliente;
import _03OrientacaoObjetos._12Enum._04EnumAula51.Domain.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));

//        TipoCliente tipoCliente1 = TipoCliente.valueOf("Pessoa Fisica");
//        System.out.println(tipoCliente1);

        TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente1);

        TipoCliente tipoCliente2 = TipoCliente.buscaPorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
