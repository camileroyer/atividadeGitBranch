import java.util.*;

public class App {
    private Scanner entrada;
    private ArrayList<Dvd> listaDvd;
    private ArrayList<Revista> listaRevista;
    private ArrayList<Cd> listaCd;
    private ArrayList<Livro> listaLivro;

    public App() {
        entrada = new Scanner(System.in);
        listaRevista = new ArrayList<Revista>();
        listaCd = new ArrayList<Cd>();
        listaDvd = new ArrayList<Dvd>();
        listaLivro = new ArrayList<Livro>();
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
                    cadastrarLivro();
                    break;
                case 2:
                    cadastrarCd();
                    break;
                case 3:
                    cadastrarDvd();
                    break;
                case 4:
                    cadastrarRevista();
                    break;
                case 5:
                    pesquisarRevistaPorAssunto();
                    break;
                case 6:
                    pesquisarID();
                    break;
                case 7:
                    listarItens();
                    break;

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
        System.out.println("[5] Pesquisar revista por assunto");
        System.out.println("[6] Pesquisar item por ID");
        System.out.println("[7] Ver listas");

    }

   private void cadastrarCd() {
        System.out.println("==============================");
        System.out.println("Cadastrar um CD: ");
        System.out.println("Digite o ID: ");
        int id = entrada.nextInt();
        entrada.nextLine();
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
    Cd novoCd = new Cd(id, nome, generoMusical, faixas);
    listaCd.add(novoCd);
}

    private void listarItens() {
    System.out.println("=====================");
    System.out.println("LISTA GERAL:");

    System.out.println("\nRevistas:");
    if (listaRevista.isEmpty()) {
        System.out.println("Nenhuma revista cadastrada.");
    } else {
        for (Revista revista : listaRevista) {
            System.out.println(revista);
        }
    }

    System.out.println("\nLivros:");
    if (listaLivro.isEmpty()) {
        System.out.println("Nenhum livro cadastrado.");
    } else {
        for (Livro livro : listaLivro) {
            System.out.println(livro);

        }
    }
    System.out.println("\nDvds:");
    if (listaDvd.isEmpty()) {
        System.out.println("Nenhum DVD cadastrado.");
    } else {
        for (Dvd dvd : listaDvd) {
            System.out.println(dvd);
        }
    }

    System.out.println("\nCds:");
    if (listaCd.isEmpty()) {
        System.out.println("Nenhum CD cadastrado.");
    } else {
        for (Cd cd : listaCd) {
            System.out.println(cd);
        }
    }
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

    private void cadastrarLivro() {
    
        System.out.println("=====================");
        System.out.println("Cadastrar um Livro: ");
        System.out.print("Digite o ID: ");
    int id = entrada.nextInt();
    entrada.nextLine();
    
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a data de aquisição: ");
    int dataAquisicao = entrada.nextInt();
    entrada.nextLine();

        System.out.print("Digite a editora: ");
        String editora = entrada.nextLine();
        System.out.print("Digite o ano de publicação: ");
    int anoPublicacao = entrada.nextInt();
    entrada.nextLine();

    Livro novoLivro = new Livro(id, nome, dataAquisicao, editora, anoPublicacao);

    System.out.println("\n Cadastro dos Autores: ");
    while (true) {
        System.out.print("Digite o nome de um autor (ENTER para finalizar): ");
        String autor = entrada.nextLine();
        if (autor.trim().isEmpty()) {
            break;
        }
        novoLivro.adicionarAutor(autor);
    }

    listaLivro.add(novoLivro);
    System.out.println("=====================");
    System.out.println("Livro cadastrado com sucesso!");
}

    private void pesquisarID() {
    System.out.println("=====================");
    System.out.print("Digite o ID que deseja pesquisar: ");
    int idBuscado = entrada.nextInt();
    entrada.nextLine();

    Item encontrado = null;

    for (Livro livro : listaLivro) {
        if (livro.getId() == idBuscado) {
            encontrado = livro;
            break;
        }
    }

    if (encontrado == null) {
        for (Cd cd : listaCd) {
            if (cd.getId() == idBuscado) {
                encontrado = cd;
                break;
            }
        }
    }

    if (encontrado == null) {
        for (Dvd dvd : listaDvd) {
            if (dvd.getId() == idBuscado) {
                encontrado = dvd;
                break;
            }
        }
    }

     if (encontrado == null) {
        for (Revista revista : listaRevista) {
            if (revista.getId() == idBuscado) {
                encontrado = revista;
                break;
            }
        }
    }

    System.out.println("=====================");
    if (encontrado == null) {
        System.out.println("Nenhum item encontrado com o ID: " + idBuscado);
    } else {
        System.out.println("Item encontrado:");
        System.out.println(encontrado);
    }
}

    //Cadastro de revista - Antônia
    private void cadastrarRevista() {
        System.out.println("=====================");
        System.out.println("Cadastrar uma Revista: ");
        System.out.print("Digite o ID: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a data de aquisição: ");
        int dataAquisicao = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o ano de publicação: ");
        int anoPublicacao = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o volume: ");
        String volume = entrada.nextLine();
        System.out.print("Digite a editora: ");
        String editora = entrada.nextLine();

        Revista novaRevista = new Revista(id, nome, dataAquisicao, anoPublicacao, volume, editora);
    
        System.out.println("\n Cadastro dos Autores: ");
        while (true) {
            System.out.print("Digite o nome de um autor (ENTER para finalizar): ");
            String autor = entrada.nextLine();
            if (autor.trim().isEmpty()) { 
                break;
            }
            novaRevista.adicionarAutor(autor);
        }

        System.out.println("\n Cadastro dos Assuntos tratados: ");
        while (true) {
            System.out.print("Digite um assunto tratado na revista (ENTER para finalizar): ");
            String assunto = entrada.nextLine();
            if (assunto.trim().isEmpty()) { 
                break;
            }
            novaRevista.adicionarAssunto(assunto);
        }

        listaRevista.add(novaRevista);
        System.out.println("=====================");
        System.out.println("Revista cadastrada com sucesso!");
    }

    private void pesquisarRevistaPorAssunto() {
        System.out.println("=====================");
        System.out.print("Digite o assunto que deseja pesquisar: ");
        String assuntoBuscado = entrada.nextLine();

        ArrayList<Revista> encontradas = new ArrayList<Revista>();
        for (Revista revista : listaRevista) {
            if (revista.trataDoAssunto(assuntoBuscado)) {
                encontradas.add(revista);
            }
        }

        System.out.println("=====================");
        if (encontradas.isEmpty()) {
            System.out.println("Nenhuma revista encontrada para o assunto: " + assuntoBuscado);
        } else {
            System.out.println("Revistas encontradas:");
            for (Revista revista : encontradas) {
                System.out.println(revista);
            }
        }
    }

}
