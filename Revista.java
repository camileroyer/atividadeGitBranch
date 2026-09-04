import java.util.ArrayList;

public class Revista extends Item {
    private int anoPublicacao;
    private String volume;
    private String editora;
    private ArrayList<String> assuntos;

    public Revista(int id, String nome, int dataAquisicao, int anoPublicacao, String volume, String editora) {
        super(id, nome, dataAquisicao);
        this.anoPublicacao = anoPublicacao;
        this.volume = volume;
        this.editora = editora;
        this.assuntos = new ArrayList<String>();
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String getVolume() {
        return volume;
    }
    public String getEditora() {
        return editora;
    }
    public ArrayList<String> getAssuntos() {
        return assuntos;
    }

    public void adicionarAssunto(String assunto) {
        this.assuntos.add(assunto);
    }
    
    public boolean trataDoAssunto(String assuntoBuscado) {
        for (String assunto : assuntos) {
            if (assunto.equalsIgnoreCase(assuntoBuscado)) {
                return true;
            }
        }
        return false;
    }

    @Override 
    public String toString() {
        return "Revista{id= "+ getId() + ", nome=" + getNome() +
               ", anoPublicacao=" + anoPublicacao + ", volume=" + volume +
               ", editora=" + editora + ", assuntos=" + assuntos + "}";
        }
    }
