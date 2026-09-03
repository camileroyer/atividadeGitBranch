//identificação única, nome, data de aquisição, lista de autores.

import java.util.ArrayList;

public abstract class Item{
    private int id;
    private String nome;
    private int dataAquisicao;
    private ArrayList<String> autores;

    public Item(int id, String nome, int dataAquisicao){
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        autores = new ArrayList<String>();
    }

    public int getId(){ return id; }
    public String getNome() {return nome; }
    public int getDataAquisicao(){ return dataAquisicao; }
    public ArrayList<String> getAutores() { return autores; }

     public void adicionarAutor(String autor) {
            this.autores.add(autor);
    }
}