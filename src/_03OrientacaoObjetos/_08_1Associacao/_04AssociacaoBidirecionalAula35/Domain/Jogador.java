package _03OrientacaoObjetos._08_1Associacao._04AssociacaoBidirecionalAula35.Domain;

public class Jogador {

    private String nome;
    private Time time;

    public void imprime(){
        System.out.println("Jogador: " +this.nome);
        if (time != null){
            System.out.println("Time: " +time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
