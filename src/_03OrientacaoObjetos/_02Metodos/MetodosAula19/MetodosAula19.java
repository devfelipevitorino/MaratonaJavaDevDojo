package _03OrientacaoObjetos._02Metodos.MetodosAula19;

import _03OrientacaoObjetos._02Metodos.MetodosAula19.Dominio.Estudante;

public class MetodosAula19 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Kabuto";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 15;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();

    }
}
