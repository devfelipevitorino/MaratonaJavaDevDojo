package _03OrientacaoObjetos._14Interfaces._01InterfacesAula55;

import _03OrientacaoObjetos._14Interfaces._01InterfacesAula55.Domain.DataBaseLoader;
import _03OrientacaoObjetos._14Interfaces._01InterfacesAula55.Domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.carregar();
        fileLoader.carregar();

    }
}
