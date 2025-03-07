import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmentro:");

        int first = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");

        int second = scanner.nextInt();

        try {
            contar(first, second);
        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int first,int second) throws ParametrosInvalidosException{

        int diferenca = second - first;

        if(first>second){

            throw new ParametrosInvalidosException();

        }

        for(int n = 1;n <= diferenca ; n++)
        {
            System.out.println("Imprimindo o número " + n);
        }
    }


   
}
