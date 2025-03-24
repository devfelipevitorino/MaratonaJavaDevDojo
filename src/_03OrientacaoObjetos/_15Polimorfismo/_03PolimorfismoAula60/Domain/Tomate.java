package _03OrientacaoObjetos._15Polimorfismo._03PolimorfismoAula60.Domain;

public class Tomate extends Produto {

    public static final double IMPOSTO = 0.06;
    private String dataValidade;

    public Tomate(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
