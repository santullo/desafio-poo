package br.com.santullo.celular;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Pagina: " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void controlarVolume() {
        System.out.println("Controlando volume");
    }
}
