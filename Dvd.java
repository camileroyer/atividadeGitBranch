//tipo (musical, filme ou dados), e uma descrição geral sobre o item ou os extras

public class Dvd extends Item {
    private String tipo;
    private String descricao;

    public Dvd(int id, String nome, int dataAquisicao, String tipo, String descricao) {
        super(id, nome, dataAquisicao); 
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() { return tipo; }
    public String getDescricao() {return descricao; }
    
}