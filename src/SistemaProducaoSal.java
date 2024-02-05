import java.time.LocalDate;
import java.util.Scanner;

public class SistemaProducaoSal {
    private static Utilizador utilizadorAutenticado;
    private static GestaoUtilizadores gestaoUtilizadores = new GestaoUtilizadores();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        gestaoUtilizadores.carregarUtilizadores();

        boolean registoNovoUtilizador = false;
        do {
            // Opção para login ou registo
            System.out.println("╔══════### Bem-vindo ao Sistema de Produção de Sal ###══════╗");
            System.out.println("║ 1. Login                                                  ║");
            System.out.println("║ 2. Registar novo utilizador                               ║");
            System.out.println("║ 3. Sair do sistema                                        ║");
            System.out.println("╚═══════════════════════════════════════════════════════════╝");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    utilizadorAutenticado = login();
                    break;
                case 2:
                    registarNovoUtilizador();
                    registoNovoUtilizador = true;
                    break;
                case 3:
                    System.out.println("A sair do sistema. Obrigado pela sua companhia!");
                    gestaoUtilizadores.salvarObjetoSerializado(gestaoUtilizadores.getUtilizadores());
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (utilizadorAutenticado == null && !registoNovoUtilizador);

        // Se o utilizador autenticado não for nulo, continue com os menus
        if (utilizadorAutenticado != null) {
            int escolha;
            do {
                switch (utilizadorAutenticado.getPerfil()) {
                    case CLIENTE:
                        escolha = exibirMenuCliente();
                        processarEscolhaCliente(escolha);
                        break;
                    case ADMIN:
                        escolha = exibirMenuAdmin();
                        processarEscolhaAdmin(escolha);
                        break;
                    case GESTOR_PRODUCAO:
                        escolha = exibirMenuGestorProducao();
                        processarEscolhaGestorProducao(escolha);
                        break;
                    case GESTOR_VENDAS:
                        escolha = exibirMenuGestorVendas();
                        processarEscolhaGestorVendas(escolha);
                        break;
                    default:
                        System.out.println("Perfil de utilizador não reconhecido. Saindo do sistema.");
                        return;
                }
            } while (escolha != 5);
        } else {
            System.out.println("Falha na autenticação. Saindo do sistema.");
        }

        // Fechar o scanner no final
        scanner.close();
    }

    private static Utilizador login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome de utilizador: ");
        String username = scanner.next();
        System.out.print("Palavra-passe: ");
        String password = scanner.next();

        // Retorna o utilizador autenticado ou null se falhar
        utilizadorAutenticado = gestaoUtilizadores.autenticarUtilizador(username, password);

        return utilizadorAutenticado;
    }

    private static void registarNovoUtilizador() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Novo nome de utilizador: ");
        String novoUsername = scanner.next();
        System.out.print("Nova palavra-passe: ");
        String novaPassword = scanner.next();

        // Restantes dados para o registo de um cliente
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Número de Cartão de Cidadão (CC): ");
        int nCC = scanner.nextInt();
        System.out.print("Número de Identificação Fiscal (NIF): ");
        int nif = scanner.nextInt();
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();
        System.out.print("Morada: ");
        String morada = scanner.next();
        System.out.print("Localidade: ");
        String localidade = scanner.next();

        // Crie um novo Cliente com perfil padrão (CLIENTE)
        Cliente novoCliente = new Cliente(novoUsername, novaPassword, nome, nCC, nif, telefone, morada, localidade);

        // Adiciona o novo cliente no gestor de utilizadores
        gestaoUtilizadores.adicionarUtilizador(novoCliente);
        System.out.println("Novo utilizador registado com sucesso!");

        // Esperar pela pressão de uma tecla antes de retornar ao menu de login
        esperarTecla();
    }

    private static int exibirMenuCliente() {
        System.out.println("╔═══════════### Menu Cliente ###═══════════╗");
        System.out.println("║ 1. Listar encomendas                     ║");
        System.out.println("║ 2. Realizar outra operação de cliente    ║");
        System.out.println("║ 3. Sair do menu                          ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.print("Escolha uma opção: ");
        return new Scanner(System.in).nextInt();
    }

    private static void processarEscolhaCliente(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Listar encomendas do Cliente");
                break;
            case 2:
                System.out.println("Executar outra operação de cliente");
                break;
            case 3:
                System.out.println("Sair do menu cliente");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static int exibirMenuAdmin() {
        System.out.println("╔═══════════### Menu Admin ###═══════════╗");
        System.out.println("║ 1. Criar novos utilizadores            ║");
        System.out.println("║ 2. Outras operações de administração   ║");
        System.out.println("║ 3. Sair do menu                        ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print("Escolha uma opção: ");
        return new Scanner(System.in).nextInt();
    }

    private static void processarEscolhaAdmin(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Criar novos utilizadores");
                break;
            case 2:
                System.out.println("Outras operações de administração");
                break;
            case 3:
                System.out.println("Sair do menu admin");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static int exibirMenuGestorProducao() {
        System.out.println("╔══════### Menu Gestor de Produção ###═════╗");
        System.out.println("║ 1. Criar lotes de produtos               ║");
        System.out.println("║ 2. Outras operações de produção          ║");
        System.out.println("║ 3. Sair do menu                          ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.print("Escolha uma opção: ");
        return new Scanner(System.in).nextInt();
    }

    private static void processarEscolhaGestorProducao(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Criar lotes de produtos");
                break;
            case 2:
                System.out.println("Outras operações de produção");
                break;
            case 3:
                System.out.println("Sair do menu de produção");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static int exibirMenuGestorVendas() {
        System.out.println("╔══════### Menu Gestor de Vendas ###══════╗");
        System.out.println("║ 1. Tratar encomendas                    ║");
        System.out.println("║ 2. Listar expedição                     ║");
        System.out.println("║ 3. Outras operações de vendas           ║");
        System.out.println("║ 4. Sair do menu                         ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.print("Escolha uma opção: ");
        return new Scanner(System.in).nextInt();
    }

    private static void processarEscolhaGestorVendas(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Tratar encomendas");
                break;
            case 2:
                System.out.println("Listar expedição");
                break;
            case 3:
                System.out.println("Outras operações de vendas");
                break;
            case 4:
                System.out.println("Sair do menu de vendas");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void esperarTecla() {
        System.out.println("Pressione Enter para continuar...");
        new java.util.Scanner(System.in).nextLine();
    }
}
