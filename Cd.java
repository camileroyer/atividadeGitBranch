// Já para os CDs, é interessante manter o gênero musical e a identificação das faixas de áudio (nomes das músicas).

public class Cd extends Item {
    private String generoMusical;
    private String[] faixas;

    public Cd(String nome, String generoMusical, String[] faixas) {
        super(0, nome, 0);
        this.generoMusical = generoMusical;
        this.faixas = faixas;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String[] getFaixas() {
        return faixas;
    }

    public void setFaixas(String[] faixas) {
        this.faixas = faixas;
    }
}