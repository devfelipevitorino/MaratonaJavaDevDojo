package _03OrientacaoObjetos._12Enum._04EnumAula51.Domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALOR;
    private final String NOME_RELATORIO;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }

    public static TipoCliente buscaPorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipo : values()) {
            if(tipo.getNOME_RELATORIO().equals(nomeRelatorio)){
                return tipo;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNOME_RELATORIO() {
        return NOME_RELATORIO;
    }
}
