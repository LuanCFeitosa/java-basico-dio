public class IBGE {
    public static void main(String[] args) {
        for(Enum e:Enum.values()){
            System.out.println(e.getNome() +" " + e.getSigla());
        
        }

        Nacionalidade brasil = new Nacionalidade();

        brasil.Nacionalidad = "Brasil";

        System.out.println("Nacionalidade " + brasil.Nacionalidad);


    }
}
