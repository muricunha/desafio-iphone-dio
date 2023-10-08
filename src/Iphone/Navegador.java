package Iphone;

public interface Navegador {

    public default void exibirPagina(){
        System.out.println("Exibindo Página");
    }

    public default void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    public default void atualizarPagina(){
        System.out.println("Atualizando Página");
    }


}
