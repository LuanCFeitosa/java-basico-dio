public class Usuário {
    
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);

        smartTv.ligar();

        System.out.println(smartTv.ligada);
        smartTv.aumentarVolume();

        System.out.println(smartTv.volume);

        smartTv.mudarCanal(13);

        System.err.println(smartTv.canal);



    }

}
