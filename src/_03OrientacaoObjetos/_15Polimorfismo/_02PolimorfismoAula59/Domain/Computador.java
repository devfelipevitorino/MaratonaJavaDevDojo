package _03OrientacaoObjetos._15Polimorfismo._02PolimorfismoAula59.Domain;

public class Computador extends Produto {

    public static final double IMPOSTO = 0.21;

    public Computador(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.valor * IMPOSTO;
    }


}
