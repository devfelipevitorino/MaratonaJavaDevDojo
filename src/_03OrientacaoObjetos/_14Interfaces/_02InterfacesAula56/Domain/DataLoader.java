package _03OrientacaoObjetos._14Interfaces._02InterfacesAula56.Domain;

public interface DataLoader {

    void carregar(); // Na interface todos os metodos por padrão são public e abstract

    default void checarPermissao(){
        System.out.println("Fazendo checagem de permissões");
    };
}
