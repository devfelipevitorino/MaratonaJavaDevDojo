package _03OrientacaoObjetos._08_1Associacao._05AssociacaoExercicioAula38.Domain;

public class Aluno {

    private String nome;
    private int idade;
    private Seminario seminario;

    public void imprime(){
        System.out.println("---Informações do aluno---");
        System.out.println("NOME: " +nome);
        System.out.println("IDADE: " +idade);
        if (seminario != null){
            System.out.println("SEMINÁRIO: " +seminario.getTitulo());
        }else {
            System.out.println("ALUNO NÃO VINCULADO A UM SEMIRÁRIO");
        }
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
