package Iphone;

// Classe que representa o iPhone
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean reproduzindoMusica;
    private String musicaAtual;
    private boolean emChamada;
    private String numeroChamada;
    private boolean navegadorAberto;
    private String siteAberto;


    @Override
    public String toString() {
        return "IPhone{" +
                "reproduzindoMusica=" + reproduzindoMusica +
                ", musicaAtual='" + musicaAtual + '\'' +
                ", emChamada=" + emChamada +
                ", numeroChamada='" + numeroChamada + '\'' +
                ", navegadorAberto=" + navegadorAberto +
                ", siteAberto='" + siteAberto + '\'' +
                '}';
    }

    public IPhone() {
        reproduzindoMusica = false;
        emChamada = false;
        navegadorAberto = false;
    }

    @Override
    public void play() {
        if (!reproduzindoMusica) {
            System.out.println("Iniciando a reprodução de música.");
            reproduzindoMusica = true;
        } else {
            System.out.println("A música já está sendo reproduzida.");
        }
    }

    @Override
    public void pause() {
        if (reproduzindoMusica) {
            System.out.println("Pausando a reprodução de música.");
            reproduzindoMusica = false;
        } else {
            System.out.println("Não há música em reprodução para pausar.");
        }
    }

    @Override
    public void stop() {
        if (reproduzindoMusica) {
            System.out.println("Parando a reprodução de música.");
            reproduzindoMusica = false;
        } else {
            System.out.println("Não há música em reprodução para parar.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (reproduzindoMusica) {
            stop();
        }
        System.out.println("Selecionando a música: " + musica);
        musicaAtual = musica;
        play();
    }

    @Override
    public void fazerChamada(String numero) {
        if (!emChamada) {
            System.out.println("Fazendo chamada para o número: " + numero);
            emChamada = true;
            numeroChamada = numero;
        } else {
            System.out.println("Já está em uma chamada. Finalize a chamada atual para fazer outra.");
        }
    }

    @Override
    public void receberChamada(String numero) {
        if (!emChamada) {
            System.out.println("Recebendo chamada de: " + numero);
            emChamada = true;
            numeroChamada = numero;
        } else {
            System.out.println("Já está em uma chamada. Finalize a chamada atual para receber outra.");
        }
    }

    @Override
    public void abrirSite(String url) {
        if (!navegadorAberto) {
            System.out.println("Abrindo o navegador na página: " + url);
            navegadorAberto = true;
            siteAberto = url;
        } else {
            System.out.println("O navegador já está aberto em uma página. Feche a página atual para abrir outra.");
        }
    }

    @Override
    public void fecharSite() {
        if (navegadorAberto) {
            System.out.println("Fechando o navegador.");
            navegadorAberto = false;
            siteAberto = null;
        } else {
            System.out.println("O navegador já está fechado.");
        }
    }
}
