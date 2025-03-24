package _03OrientacaoObjetos._15Polimorfismo._01PolimorfismoAula58.Domain;

public class Computador extends Produto{

    public static final double IMPOSTO = 0.21;

    public Computador(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double CalcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.valor * IMPOSTO;
    }


}
