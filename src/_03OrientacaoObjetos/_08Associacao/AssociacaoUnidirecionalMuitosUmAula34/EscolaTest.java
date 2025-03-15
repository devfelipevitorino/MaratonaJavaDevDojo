package _03OrientacaoObjetos._08Associacao.AssociacaoUnidirecionalMuitosUmAula34;

import _03OrientacaoObjetos._08Associacao.AssociacaoUnidirecionalMuitosUmAula34.Domain.Escola;
import _03OrientacaoObjetos._08Associacao.AssociacaoUnidirecionalMuitosUmAula34.Domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");

        Professor[] professores = {professor1, professor2};

        Escola escola = new Escola("Academia da folha");
        escola.setProfessores(professores);
        escola.imprime();

    }
}
