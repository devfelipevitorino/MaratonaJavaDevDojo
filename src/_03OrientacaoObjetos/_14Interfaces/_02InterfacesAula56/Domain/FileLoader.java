package _03OrientacaoObjetos._14Interfaces._02InterfacesAula56.Domain;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void carregar() {
        System.out.println("Carregando dados do arquivo...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do arquivo...");
    }

//    @Override
//    public void checarPermissao() {
//        System.out.println("Checando permissões no arquivo...");
//    }
}
