public class Livro extends Item {
    private String editora;
    private int anoPublicacao;

    public Livro(int id, String nome, int dataAquisicao, String editora, int anoPublicacao) {
        super(id, nome, dataAquisicao);
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro {" +
               "ID=" + getId() +
               ", Nome='" + getNome() + '\'' +
               ", Data de Aquisição=" + getDataAquisicao() +
               ", Editora='" + editora + '\'' +
               ", Ano de Publicação=" + anoPublicacao +
               ", Autores=" + getAutores() +
               '}';
    }
}