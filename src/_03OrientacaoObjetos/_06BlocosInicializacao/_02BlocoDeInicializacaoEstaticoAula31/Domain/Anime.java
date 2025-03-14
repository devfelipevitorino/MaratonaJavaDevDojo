package _03OrientacaoObjetos._06BlocosInicializacao._02BlocoDeInicializacaoEstaticoAula31.Domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização estatico
    // 1 - Alocado espaço em memoria
    // 2 - Cada atributo de classe é criado e inicializado por padrão default
    // 3 - Bloco de execução é exeutado
    // 4 - Construtor é executado

    static {
        System.out.println("Bloco de inicialização estático 1");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Bloco de inicialização estático 2");
    }

    static {
        System.out.println("Bloco de inicialização estático 3");
    }

    {
        System.out.println("Bloco de inicialização não estatico estático");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        for(int e : episodios){
            System.out.print(e + " ");
        }
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
