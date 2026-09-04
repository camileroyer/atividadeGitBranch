import java.util.*;

public class App {
    private Scanner entrada;
    private ArrayList<Dvd> listaDvd;

    public App() {
        entrada = new Scanner(System.in); 
    }

    public void executar() {
        int opcao;
        do {
            System.out.println("=====================");
            System.out.println("SISTEMA DE ITENS COLECIONAVEIS");
            menu();
            System.out.print("Digite a opcao desejada: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    //cadastrarLivro();
                    break;
                case 2:
                    cadastrarCd();
                    break;
                case 3:
                    cadastrarDvd();
                    break;
                case 4:
                    //cadastrarRevista();
                    break;
                case 5:
                    //pesquisarItemEspecifico();
                case 6:
                    //pesquisarID()
                default:
                    System.out.println("=====================");
                    System.out.println("Opcao invalida. Redigite, por favor.");
            }
        } while (opcao != 0);
    }

    private void menu() {
        System.out.println("Opcoes: ");
        System.out.println("[0] Sair");
        System.out.println("[1] Cadastrar livro");
        System.out.println("[2] Cadastrar CD");
        System.out.println("[3] Cadastrar DVD");
        System.out.println("[4] Cadastrar revista");
        System.out.println("[5] Pesquisar por item específico");
        System.out.println("[6] Pesquisar por ID");
    }

    private void cadastrarCd() {
        System.out.println("=====================");
        System.out.println("Cadastrar um CD: ");
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o gênero musical: ");
        String generoMusical = entrada.nextLine();
        System.out.print("Digite a quantidade de faixas: ");
        int quantidadeFaixas = entrada.nextInt();
        entrada.nextLine();
        String[] faixas = new String[quantidadeFaixas];
        for (int i = 0; i < quantidadeFaixas; i++) {
            System.out.print("Digite o nome da faixa " + (i + 1) + ": ");
            faixas[i] = entrada.nextLine();
        }
        new Cd(nome, generoMusical, faixas);
    }

    private void cadastrarDvd() {
        System.out.println("=====================");
        System.out.println("Cadastrar um DVD: ");
        System.out.println("Digite o ID: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a data de aquisição: ");
        int dataAquisicao = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite o tipo: ");
        String tipo = entrada.nextLine();
        System.out.println("Digite a descrição do DVD: ");
        String descricao = entrada.nextLine();
        Dvd novoDvd = new Dvd(id, nome, dataAquisicao, tipo, descricao);
    
    System.out.println("\n Cadastro dos Autores: ");
    while (true) {
        System.out.print("Digite o nome de um autor (ENTER para finalizar): ");
        String autor = entrada.nextLine();
        if (autor.trim().isEmpty()) { //evitar espaços brancos e rodar
            break;
        }
        novoDvd.adicionarAutor(autor);
    }
    listaDvd.add(novoDvd);
    System.out.println("=====================");
    System.out.println("DVD cadastrado com sucesso!");
    }
}