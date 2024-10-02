package br.com.santullo;

import br.com.santullo.celular.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone13 = new Iphone();
        iphone13.ligar("619999999");
        iphone13.atender();
        iphone13.iniciarCorreioVoz();
        iphone13.exibirPagina("https://web.dio.me/course/pilares-da-programacao-orientada-a-objetos-em-java/learning/1e7be79c-1988-47d1-8a44-55c69c19f3f0?back=/track/formacao-java-developer&tab=undefined&moduleId=undefined");
        iphone13.adicionarNovaAba();
        iphone13.atualizarPagina();
        iphone13.tocar();
        iphone13.pausar();
        iphone13.selecionarMusica();
        iphone13.controlarVolume();
    }
}