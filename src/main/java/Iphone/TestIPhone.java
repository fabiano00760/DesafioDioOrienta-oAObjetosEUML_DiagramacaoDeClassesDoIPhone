package Iphone;

public class TestIPhone {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.selecionarMusica("Música 1");
        iPhone.fazerChamada("5511982576466");
        iPhone.abrirSite("www.example.com");
        iPhone.pause();
        iPhone.fecharSite();
        iPhone.play();
        iPhone.receberChamada("987-654-321");

    }
}
