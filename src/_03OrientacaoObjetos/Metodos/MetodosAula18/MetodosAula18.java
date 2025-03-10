package _03OrientacaoObjetos.Metodos.MetodosAula18;

import _03OrientacaoObjetos.Metodos.MetodosAula18.Dominio.Estudante;
import _03OrientacaoObjetos.Metodos.MetodosAula18.Dominio.ImprimeEstudante;

public class MetodosAula18 {
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

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

    }
}
