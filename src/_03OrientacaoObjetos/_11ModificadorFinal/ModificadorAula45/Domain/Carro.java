package _03OrientacaoObjetos._11ModificadorFinal.ModificadorAula45.Domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
