package _03OrientacaoObjetos._08_1Associacao._05AssociacaoExercicioAula38.Domain;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public void imprime(){
        System.out.println("---SEMINÁRIO---");
        System.out.println("TÍTULO: " +this.titulo);
        if (alunos != null){
            System.out.println("---ALUNOS---");
            for (Aluno aluno : alunos){
                System.out.println("NOME: " +aluno.getNome());
                System.out.println("IDADE: " +aluno.getIdade());
            }
        }
        if (professor != null) {
            System.out.println("---PROFESSOR---");
            System.out.println("NOME: " +this.professor.getNome());
            System.out.println("ESPECIALIDADE: " +this.professor.getEspecialidade());
        }
        if (local != null) {
            System.out.println("---LOCAL---");
            System.out.println("ENDEREÇO: " +this.local.getEndereco());
        }
        System.out.println(" ");
        System.out.println("<------------------------------->");
        System.out.println(" ");
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] aluno, Local local) {
        this.titulo = titulo;
        this.alunos = aluno;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return alunos;
    }

    public void setAluno(Aluno[] aluno) {
        this.alunos = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
