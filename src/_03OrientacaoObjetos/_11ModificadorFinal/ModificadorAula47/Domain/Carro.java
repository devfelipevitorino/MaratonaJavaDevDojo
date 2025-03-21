package _03OrientacaoObjetos._11ModificadorFinal.ModificadorAula47.Domain;

public class Carro {
    // Caso necessario é possivel utilizar "final" na classe, impedindo herança e sobrescrita
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
