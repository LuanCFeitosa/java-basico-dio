public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIPhone = new Iphone();

        // Testando ReprodutorMusical
        meuIPhone.selecionarMusica("Bohemian Rhapsody");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Testando AparelhoTelefonico
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIPhone.exibirPagina("https://www.exemplo.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }

}
