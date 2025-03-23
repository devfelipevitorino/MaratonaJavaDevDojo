package _03OrientacaoObjetos._14Interfaces._02InterfacesAula56;

import _03OrientacaoObjetos._14Interfaces._02InterfacesAula56.Domain.DataBaseLoader;
import _03OrientacaoObjetos._14Interfaces._02InterfacesAula56.Domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.carregar();
        fileLoader.carregar();

        dataBaseLoader.remover();
        fileLoader.remover();

        dataBaseLoader.checarPermissao();
        fileLoader.checarPermissao();

    }
}
