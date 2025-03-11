public enum Enum {
    
    SAO_PAULO("SÃO Paulo","SP");

    private String sigla;
    
    public String getSigla() {
        return sigla;
    }

    private String nome;

public String getNome() {
        return nome;
    }

private Enum(String nome, String sigla){
    this.nome = nome;
    this.sigla = sigla;
}

}


