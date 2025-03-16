package _03OrientacaoObjetos._08_1Associacao._05AssociacaoExercicioAula38;

import _03OrientacaoObjetos._08_1Associacao._05AssociacaoExercicioAula38.Domain.Aluno;
import _03OrientacaoObjetos._08_1Associacao._05AssociacaoExercicioAula38.Domain.Local;
import _03OrientacaoObjetos._08_1Associacao._05AssociacaoExercicioAula38.Domain.Professor;
import _03OrientacaoObjetos._08_1Associacao._05AssociacaoExercicioAula38.Domain.Seminario;

public class Exercicio {
    public static void main(String[] args) {

        Local local = new Local("Universidade");
        Seminario seminario = new Seminario("Banco de dados", local);
        Aluno aluno = new Aluno("Felipe", 22, seminario);
        Professor professor = new Professor("Jiraya", "Banco de dados");

        Aluno[] alunos = {aluno};

        Seminario[] seminarios = {seminario};

        seminario.setAluno(alunos);
        seminario.setProfessor(professor);

        aluno.setSeminario(seminario);

        professor.setSeminarios(seminarios);

        seminario.imprime();

        Local local2 = new Local("Rua das Trincheiras");
        Seminario seminario2 = new Seminario("Java", local2);
        Aluno aluno2 = new Aluno("Felipe", 22, seminario2);
        Professor professor2 = new Professor("Jiraya", "POO");

        Aluno[] alunos2 = {aluno2};

        Seminario[] seminarios2 = {seminario2};

        seminario2.setAluno(alunos2);
        seminario2.setProfessor(professor2);

        aluno2.setSeminario(seminario2);

        professor2.setSeminarios(seminarios2);

        seminario2.imprime();

    }
}
