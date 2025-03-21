package _03OrientacaoObjetos._11ModificadorFinal.ModificadorAula47.Domain;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Nome do comprador: "+this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
