package Iphone;

public class Iphone implements Navegador, ReprodutorMusical, Telefone{
    @Override
    public void exibirPagina() {
        Navegador.super.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        Navegador.super.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        Navegador.super.atualizarPagina();
    }

    @Override
    public void tocarMusica() {
        ReprodutorMusical.super.tocarMusica();
    }

    @Override
    public void pausarMusica() {
        ReprodutorMusical.super.pausarMusica();
    }

    @Override
    public void selecionarMusica() {
        ReprodutorMusical.super.selecionarMusica();
    }

    @Override
    public void ligando() {
        Telefone.super.ligando();
    }

    @Override
    public void atender() {
        Telefone.super.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        Telefone.super.iniciarCorreioVoz();
    }
}
