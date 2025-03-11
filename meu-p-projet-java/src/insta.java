public class insta extends msginstantanea {

    @Override
    public void mandarMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem enviada do jeito insta");    }

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem recebido do jeito insta");    }

    @Override
    public void salvarHistoricoMensagem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvarHistoricoMensagem'");
    }
    
}
