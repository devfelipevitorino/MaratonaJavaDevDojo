package _03OrientacaoObjetos._02Metodos.MetodosAula17;

import _03OrientacaoObjetos._02Metodos.MetodosAula17.Dominio.Estudante;
import _03OrientacaoObjetos._02Metodos.MetodosAula17.Dominio.ImprimeEstudante;

public class MetodosAula17 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante1.nome = "Kabuto";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        impressora.imprime(estudante1);

        estudante2.nome = "Sakura";
        estudante2.idade = 15;
        estudante2.sexo = 'F';

        impressora.imprime(estudante2);

    }
}
