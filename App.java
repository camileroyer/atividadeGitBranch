import java.util.*;

public class App {
    private Scanner entrada;
<<<<<<< HEAD
=======
    private ArrayList<Livro> listaLivro;
    private ArrayList<Cd> listaCd;
>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
    private ArrayList<Dvd> listaDvd;
    private ArrayList<Revista> listaRevista;

    public App() {
        entrada = new Scanner(System.in);
<<<<<<< HEAD
=======
        listaLivro = new ArrayList<Livro>();
        listaCd = new ArrayList<Cd>();
        listaDvd = new ArrayList<Dvd>();
>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
        listaRevista = new ArrayList<Revista>();
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
<<<<<<< HEAD
                    //cadastrarLivro();
=======
                    cadastrarLivro(); 
>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
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
<<<<<<< HEAD
                    //pesquisarID()
=======
                    pesquisarPorId();
                    break;
>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
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
        Cd novoCd = new Cd(nome, generoMusical, faixas);
<<<<<<< HEAD
=======
        listaCd.add(novoCd);
>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
    }

    private void cadastrarDvd() {
        System.out.println("=====================");
        System.out.println("Cadastrar um DVD: ");
<<<<<<< HEAD
        System.out.println("Digite o ID: ");
=======
        System.out.print("Digite o ID: ");
>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a data de aquisição: ");
        int dataAquisicao = entrada.nextInt();
        entrada.nextLine();
<<<<<<< HEAD
        System.out.println("Digite o tipo: ");
        String tipo = entrada.nextLine();
        System.out.println("Digite a descrição do DVD: ");
        String descricao = entrada.nextLine();
        Dvd novoDvd = new Dvd(id, nome, dataAquisicao, tipo, descricao);
    
=======
        System.out.print("Digite o tipo: ");
        String tipo = entrada.nextLine();
        System.out.print("Digite a descrição do DVD: ");
        String descricao = entrada.nextLine();
        Dvd novoDvd = new Dvd(id, nome, dataAquisicao, tipo, descricao);
    
        System.out.println("\n Cadastro dos Autores: ");
        while (true) {
            System.out.print("Digite o nome de um autor (ENTER para finalizar): ");
            String autor = entrada.nextLine();
            if (autor.trim().isEmpty()) {
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

>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
    System.out.println("\n Cadastro dos Autores: ");
    while (true) {
        System.out.print("Digite o nome de um autor (ENTER para finalizar): ");
        String autor = entrada.nextLine();
<<<<<<< HEAD
        if (autor.trim().isEmpty()) { //evitar espaços brancos e rodar
            break;
        }
        novoDvd.adicionarAutor(autor);
    }
    listaDvd.add(novoDvd);
    System.out.println("=====================");
    System.out.println("DVD cadastrado com sucesso!");
    }

    //Cadastro de revista - Antônia
=======
        if (autor.trim().isEmpty()) { 
            break;
        }
        novoLivro.adicionarAutor(autor);
    }

    listaLivro.add(novoLivro);
    System.out.println("=====================");
    System.out.println("Livro cadastrado com sucesso!");
}

>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
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

<<<<<<< HEAD
=======

>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
    private void pesquisarRevistaPorAssunto() {
        System.out.println("=====================");
        System.out.print("Digite o assunto que deseja pesquisar: ");
        String assuntoBuscado = entrada.nextLine();

        ArrayList<Revista> encontradas = new ArrayList<Revista>();
        for (Revista revista : listaRevista) {
<<<<<<< HEAD
            if (revista.trataDoAssunto(assuntoBuscado)) {
                encontradas.add(revista);
=======
            
            for (String assunto : revista.getAssuntos()) {
                if (assunto.toLowerCase().contains(assuntoBuscado.toLowerCase())) {
                    encontradas.add(revista);
                    break;
                }
>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
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

<<<<<<< HEAD
}
=======
    private void pesquisarPorId() {
        System.out.println("=====================");
        System.out.print("Digite o ID do item que deseja pesquisar: ");
        int idBuscado = entrada.nextInt();
        entrada.nextLine();

        Item itemEncontrado = null;

        
        for (Livro livro : listaLivro) {
            if (livro.getId() == idBuscado) {
                itemEncontrado = livro;
                break;
            }
        }

        
        if (itemEncontrado == null) {
            for (Cd cd : listaCd) {
                if (cd.getId() == idBuscado) {
                    itemEncontrado = cd;
                    break;
                }
            }
        }

        
        if (itemEncontrado == null) {
            for (Dvd dvd : listaDvd) {
                if (dvd.getId() == idBuscado) {
                    itemEncontrado = dvd;
                    break;
                }
            }
        }

        
        if (itemEncontrado == null) {
            for (Revista revista : listaRevista) {
                if (revista.getId() == idBuscado) {
                    itemEncontrado = revista;
                    break;
                }
            }
        }

        System.out.println("=====================");
        if (itemEncontrado != null) {
            System.out.println("Item encontrado:");
            System.out.println(itemEncontrado);
        } else {
            System.out.println("Nenhum item foi encontrado com o ID: " + idBuscado);
        }
    }
}
>>>>>>> 5e2469b0f50d4d7488371e2c29d84c879779b5d4
