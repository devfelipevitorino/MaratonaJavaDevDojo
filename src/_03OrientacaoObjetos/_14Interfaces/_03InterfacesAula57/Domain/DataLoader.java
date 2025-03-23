package _03OrientacaoObjetos._14Interfaces._03InterfacesAula57.Domain;

public interface DataLoader {

    int MAX_DATA_SIZE = 10; // Na interface todos os atributos por padrão são public static final

    void carregar(); // Na interface todos os metodos por padrão são public e abstract

    default void checarPermissao(){
        System.out.println("Fazendo checagem de permissões");
    };

    static void MaxDataSize(){
        System.out.println("Dentro do MaxDataSize na interface");
    }
}
