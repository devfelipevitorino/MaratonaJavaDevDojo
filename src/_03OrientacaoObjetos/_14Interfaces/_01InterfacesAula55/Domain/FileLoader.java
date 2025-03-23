package _03OrientacaoObjetos._14Interfaces._01InterfacesAula55.Domain;

public class FileLoader implements DataLoader{

    @Override
    public void carregar() {
        System.out.println("Carregando dados do arquivo...");
    }

}
