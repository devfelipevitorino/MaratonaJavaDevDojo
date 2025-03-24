package _03OrientacaoObjetos._15Polimorfismo._01PolimorfismoAula58.Domain;

public class Tomate extends Produto{

    public static final double IMPOSTO = 0.06;

    public Tomate(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double CalcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * IMPOSTO;
    }

}
