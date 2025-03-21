package _03OrientacaoObjetos._12Enum._03EnumAula50.Domain;

public enum TipoCliente {
    PESSOA_FISCA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }
}
