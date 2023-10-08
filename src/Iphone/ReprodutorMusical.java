package Iphone;

public interface ReprodutorMusical {

    public default void tocarMusica(){
        System.out.println("Tocando Musica...");
    }

    public default void pausarMusica(){
        System.out.println("Pausando Musica...");
    }

    public default void selecionarMusica(){
        System.out.println("Selecionando Musica...");
    }
}
