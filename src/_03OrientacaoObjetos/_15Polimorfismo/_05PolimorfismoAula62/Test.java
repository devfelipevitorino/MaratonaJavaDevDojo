package _03OrientacaoObjetos._15Polimorfismo._05PolimorfismoAula62;

import _03OrientacaoObjetos._15Polimorfismo._05PolimorfismoAula62.Repository.Repositorio;
import _03OrientacaoObjetos._15Polimorfismo._05PolimorfismoAula62.Servico.RepositorioArquivo;
import _03OrientacaoObjetos._15Polimorfismo._05PolimorfismoAula62.Servico.RepositorioBancoDeDados;
import _03OrientacaoObjetos._15Polimorfismo._05PolimorfismoAula62.Servico.RepositorioMemoria;

public class Test {
    public static void main(String[] args) {

        //RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioArquivo();

        Repositorio repositorioA = new RepositorioArquivo();
        repositorioA.salvar();

        Repositorio repositorioBD = new RepositorioBancoDeDados();
        repositorioBD.salvar();

        Repositorio repositorioM = new RepositorioMemoria();
        repositorioM.salvar();

    }
}
