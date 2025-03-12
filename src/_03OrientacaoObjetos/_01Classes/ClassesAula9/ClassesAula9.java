package _03OrientacaoObjetos._01Classes.ClassesAula9;

import _03OrientacaoObjetos._01Classes.ClassesAula9.Dominio.Estudante;

public class ClassesAula9 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println(" ");

        estudante2.nome = "Goku";

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
