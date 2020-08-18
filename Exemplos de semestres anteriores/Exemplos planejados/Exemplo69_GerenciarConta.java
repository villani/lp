package lp;

import java.util.Scanner;

/**
 * Este exemplo utiliza um novo tipo de dado para gerenciar as informações de
 * uma aplicação
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo69_GerenciarConta.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo69_GerenciarConta {

    /**
     * Atributo no escopo da classe (pode ser usado por todos os métodos da
     * classe).
     */
    public static Scanner leitor;

    /**
     * Apresenta um menu de opções e executa o método escolhido pelo usuário.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        // INICIALIZANDO VARIÁVEL DA CLASSE
        leitor = new Scanner(System.in);
        // - Como o método main sempre é executado, os demais métodos
        // não terão problemas em usar essa variável leitor, pois ela
        // já terá sido inicializada.

        // DEFININDO UM VETOR DE UM NOVO TIPO DE DADO
        Exemplo68_Conta[] contas = new Exemplo68_Conta[5]; // O vetor terá cinco posições

        // CONTROLE PARA EXECUTAR A OPÇÃO ESCOLHIDA PELO USUÁRIO
        int opcao;
        do {

            // EXIBINDO AS OPÇÕES DISPONÍVEIS
            System.out.println("Escolha uma das opções:");
            System.out.println("1. Cadastrar contas");
            System.out.println("2. Visualizar contas");
            System.out.println("3. Excluir conta");
            System.out.println("4. Sair");
            System.out.print("OPÇÃO: ");
            opcao = leitor.nextInt(); // - Capturando a opção do usuário

            // EXECUTANDO A OPÇÃO ESCOLHIDA
            switch (opcao) {
                case 1:
                    cadastrarContas(contas);
                    break;
                case 2:
                    visualizarContas(contas);
                    break;
                case 3:
                    excluirConta(contas);
                    break;
                case 4:
                    System.out.println("Programa finalizado!");
                    break;
                default:// - Para o caso do usuário informar qualquer
                    // opção além daquelas possíveis
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4); // Faça enquanto o usuário não escolhe sair.

    }

    /**
     * Cria e insere objetos diferentes do tipo conta em cada posição do vetor.
     *
     * @param contas Vetor de objetos do tipo conta.
     */
    public static void cadastrarContas(Exemplo68_Conta[] contas) {

        // CADASTRANDO AS CINCO CONTAS DE UMA VEZ        
        for (int i = 0; i < contas.length; i++) {

            contas[i] = new Exemplo68_Conta();// Necessário inicializar o objeto
            // para poder acessar seus atributos

            System.out.print("Informe o número da conta: ");
            contas[i].numero = leitor.nextInt();
            System.out.print("Informe o nome do cliente: ");
            contas[i].cliente = leitor.next();
            System.out.print("Informe o saldo da conta: ");
            contas[i].saldo = leitor.nextDouble();
        }
    }

    /**
     * Apresenta os valores dos atributos de todos os objetos inseridos no
     * vetor.
     *
     * @param contas Vetor de objetos do tipo conta.
     */
    private static void visualizarContas(Exemplo68_Conta[] contas) {

        String cliente;

        // DEFININDO FILTRO DAS CONTAS QUE SERÃO EXIBIDAS
        System.out.print("Informe o nome do cliente: ");
        cliente = leitor.next();

        // SÓ EXIBIR AS CONTAS DO CLIENTE INFORMADO
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].cliente.equals(cliente)) {
                System.out.println("");
                System.out.println("---------------");
                System.out.println("Número: " + contas[i].numero);
                System.out.println("Saldo: " + contas[i].saldo);
                System.out.println("---------------");
                System.out.println("");
            }
        }
    }

    /**
     * Zera todos os valores dos atributos do objeto selecionado pelo usuário.
     *
     * @param contas Vetor de objetos do tipo conta.
     */
    public static void excluirConta(Exemplo68_Conta[] contas) {

        int menor = 0;
        // IDENTIFICANDO CONTA COM MENOR SALDO
        for (int i = 0; i < contas.length; i++) {
            if (i == 0 || contas[i].saldo < contas[menor].saldo) {
                menor = i;
            }
        }

        // LIMPANDO DADOS DA CONTA
        contas[menor].numero = 0;
        contas[menor].cliente = "";
        contas[menor].saldo = 0;
    }

}
