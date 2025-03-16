package _03OrientacaoObjetos._08_1Associacao._05AssociacaoExercicioAula38.Domain;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprime(){
        System.out.println("---Informações do professor---");
        System.out.println("NOME: " +nome);
        System.out.println("ESPECIALIDADE: " +especialidade);
        if (seminarios != null){
            for (Seminario seminario : seminarios){
                System.out.println("SEMINÁRIO: " +seminario.getTitulo());
            }
        }else {
            System.out.println("PROFESSOR NÃO VINCULADO A UM SEMIRÁRIO");
        }
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
