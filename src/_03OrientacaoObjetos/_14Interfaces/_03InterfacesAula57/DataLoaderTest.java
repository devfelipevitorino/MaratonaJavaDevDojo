package _03OrientacaoObjetos._14Interfaces._03InterfacesAula57;

import _03OrientacaoObjetos._14Interfaces._03InterfacesAula57.Domain.DataBaseLoader;
import _03OrientacaoObjetos._14Interfaces._03InterfacesAula57.Domain.DataLoader;
import _03OrientacaoObjetos._14Interfaces._03InterfacesAula57.Domain.FileLoader;

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

        DataLoader.MaxDataSize();
        DataBaseLoader.MaxDataSize();

    }
}
