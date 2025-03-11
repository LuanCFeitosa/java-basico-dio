public class msn extends msginstantanea{

    @Override
    public void mandarMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem enviada do jeito msn");
    }

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem recebida do jeito msn");
    }

    @Override
    public void salvarHistoricoMensagem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvarHistoricoMensagem'");
    }
    
}
