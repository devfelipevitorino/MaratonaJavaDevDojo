package _03OrientacaoObjetos.Classes.ClassesAula10;

import _03OrientacaoObjetos.Classes.ClassesAula10.Dominio.Estudante;
import _03OrientacaoObjetos.Classes.ClassesAula10.Dominio.Professor;

public class ClassesAula10 {
    public static void main(String[] args) {

        Professor professor = new Professor();

        System.out.println("Nome: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);

    }
}
