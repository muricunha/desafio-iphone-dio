package Iphone;

public interface Telefone {
    public default void ligando(){
        System.out.println("Realizando ligação");
    }

    public default void atender(){
        System.out.println("Atendendo ligação");
    }

    public default void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

}
