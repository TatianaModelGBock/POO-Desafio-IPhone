public abstract class IPhone implements ReprodutorMusical, AparelhoTelefonico , NavegadorInternet {

    // Implementação de métodos da interface AparelhoTelefonico
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação de métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir página:" + url);
    }


    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");


    }

    // Implementação de métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música....");

    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada:." + musica);


    }

    public static void main(String[] args) {
        IPhone meuIphone = new MeuIphone();

        //Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.pausar();

        //Testando AparelhoTelefonico
        meuIphone.ligar("123-456-789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        //Testando NavegadoeInternet
        meuIphone.exibirPagina("https://www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

    }
}