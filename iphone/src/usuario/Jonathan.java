package usuario;

import aparelhos.iphone.Iphone;

public class Jonathan {
    public static void main(String[] args) {
        Iphone iphone15 = new Iphone();

        iphone15.ligar("40028922");
        iphone15.atender();
        iphone15.iniciarCorreioVoz();
        iphone15.exibirPagina("www.google.com.br");
        iphone15.adicionarNovaAba();
        iphone15.atualizarPagina();
        iphone15.selecionarMusica("System off down");
        iphone15.tocar();
        iphone15.pausar();
        
    }
}
