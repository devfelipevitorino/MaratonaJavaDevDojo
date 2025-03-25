package _03OrientacaoObjetos._15Polimorfismo._05PolimorfismoAula62.Servico;

import _03OrientacaoObjetos._15Polimorfismo._05PolimorfismoAula62.Repository.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
