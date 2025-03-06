public class SmartTv {
    boolean ligada = false;
    int volume = 21;
    int canal = 1;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }


    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.err.println("Aumentando volume para " + volume);

    }

}