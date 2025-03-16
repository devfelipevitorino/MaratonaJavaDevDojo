package _03OrientacaoObjetos._08Associacao._03AssociacaoUnidirecionalMuitosUmAula34.Domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println(this.nome);
        if (professores != null){
            System.out.println("--Lista de Professores--");
            for (Professor professor : professores)
                System.out.println(professor.getNome());
        }
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
