public class Exceptions{

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1234567");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            System.out.println("Não corresponde");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{

        if(cep.length() != 8)
        {
            throw new CepInvalidoException();
        }
            return "123.456.78";

    }
}
