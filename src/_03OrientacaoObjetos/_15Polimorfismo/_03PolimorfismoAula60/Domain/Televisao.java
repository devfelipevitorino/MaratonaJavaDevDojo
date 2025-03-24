package _03OrientacaoObjetos._15Polimorfismo._03PolimorfismoAula60.Domain;

public class Televisao extends Produto{

    public static final double IMPOSTO = 0.21;

    public Televisao(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão...");
        return this.valor * IMPOSTO;
    }
}
