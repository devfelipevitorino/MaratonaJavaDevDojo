package _03OrientacaoObjetos._15Polimorfismo._05PolimorfismoAula62.Servico;

import _03OrientacaoObjetos._15Polimorfismo._05PolimorfismoAula62.Repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
