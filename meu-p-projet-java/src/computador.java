public class computador {
    public static void main(String[] args) {

        msginstantanea smi = null;

        String redesocial = "msn";

        if(redesocial.equals("msn")){
            smi = new msn();
        }
        else if(redesocial.equals("inst")){
            smi = new insta();
        }
        else if(redesocial.equals("face")){
            smi = new face();
        }

        smi.mandarMensagem();



    }
}
