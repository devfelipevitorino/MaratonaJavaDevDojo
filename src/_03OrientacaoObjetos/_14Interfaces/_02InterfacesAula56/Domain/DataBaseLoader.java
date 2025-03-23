package _03OrientacaoObjetos._14Interfaces._02InterfacesAula56.Domain;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do banco...");
    }

    @Override
    public void checarPermissao() {
        System.out.println("Checando permissões no banco...");
    }
}
