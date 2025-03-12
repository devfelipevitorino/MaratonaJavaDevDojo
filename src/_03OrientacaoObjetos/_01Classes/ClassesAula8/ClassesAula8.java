package _03OrientacaoObjetos._01Classes.ClassesAula8;

import _03OrientacaoObjetos._01Classes.ClassesAula8.Dominio.Pessoa;

public class ClassesAula8 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        p1.nome = "Luffy";
        p1.idade = 19;
        p1.sexo = 'M';

        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.sexo);

    }
}
