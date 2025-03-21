package _03OrientacaoObjetos._12Enum._04EnumAula51.Domain;

public enum TipoPagamento{
    DEBITO{
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calculaDesconto (double valor);
}