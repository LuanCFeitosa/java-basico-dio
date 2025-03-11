public abstract class msginstantanea {

    public abstract void mandarMensagem();
    public abstract void receberMensagem();

    public abstract void salvarHistoricoMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando conexão");
    }

}
