package lp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Este exemplo utiliza um arquivo para gerenciar os dados de uma aplicação
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo61_GerenciadorDeImoveis.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo61_GerenciadorDeImoveis {

    /**
     * Apresenta um menu de opções e executa o método escolhido pelo usuário.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            int opcao;
            do {
                listarOpcoes();
                opcao = leitor.nextInt();
                switch (opcao) {
                    case 1:
                        listarImoveis();
                        break;
                    case 2:
                        detalharImovel();
                        break;
                    case 3:
                        inserirImovel();
                        break;
                    case 4:
                        removerImovel();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente!");

                }
            } while (opcao != 5);
        } catch (FileNotFoundException fnfe) { // TRATANDO AS EXCEÇÕES DAS CLASSES UTILIZADAS
            System.out.println("O arquivo não foi encontrado! Detalhes: ["
                    + fnfe.getMessage() + "]");
        } catch (IOException ioe) {
            System.out.println("Falha ao manipular "
                    + "arquivo: " + ioe.getMessage());
        }
    }

    /**
     * Calcula a quantidade de imoveis cadastrados.
     *
     * @return A quantidade de imóveis gravados no arquivo.
     * @throws FileNotFoundException Se o arquivo não puder ser acessado.
     */
    public static int atualizaQdteImoveis() throws FileNotFoundException {
        int qtdeImoveis = 0;
        File arquivo = new File("imoveis.csv");
        Scanner leitor = new Scanner(arquivo);

        // CONTA AS LINHAS DO ARQUIVO, EXCETO A LINHA DE CABEÇALHO
        if (leitor.hasNextLine()) {
            leitor.nextLine(); // dispensando o cabeçalho
        }
        while (leitor.hasNextLine()) {
            leitor.nextLine();
            qtdeImoveis++;
        }
        return qtdeImoveis;
    }

    /**
     * Apresenta um lista de métodos que o usuário pode escolher para executar.
     */
    public static void listarOpcoes() {
        System.out.println("\n\nSELECIONE UMA DAS OPÇÕES A SEGUIR:");
        System.out.println("1 - Listar imóveis");
        System.out.println("2 - Mostrar detalhe do imóvel");
        System.out.println("3 - Inserir imóvel");
        System.out.println("4 - Remover imóvel");
        System.out.println("5 - Sair");
        System.out.print("OPÇÃO: ");
    }

    /**
     * Lê e exibe os imóveis gravados no arquivo.
     *
     * @throws FileNotFoundException Se o arquivo não puder ser acessado.
     */
    public static void listarImoveis() throws FileNotFoundException {
        File arquivo = new File("imoveis.csv");
        Scanner leitor = new Scanner(arquivo);

        // VERIFICA SE O ARQUIVO NÃO ESTÁ VAZIO PARA MOSTRAR O CABEÇALHO 
        // DAS COLUNAS
        if (leitor.hasNextLine()) {
            String[] rotulos = leitor.nextLine().split(",");
            System.out.println(rotulos[0] + "\t" + rotulos[4]);
        }

        // IMPRIME OS CAMPOS ESPECÍFICOS ENQUANTO HOUVER REGISTROS
        while (leitor.hasNextLine()) {
            String[] campos = leitor.nextLine().split(",");
            System.out.println(campos[0] + "\t\t" + campos[4]);
        }
        leitor.close();
    }

    /**
     * Exibe os dados do imóvel selecionado pelo usuário.
     */
    public static void detalharImovel() {
        // IMPLEMENTAR
    }

    /**
     * Grava os dados de um novo imóvel no arquivo.
     */
    public static void inserirImovel() {
        // IMPLEMENTAR
    }

    /**
     * Remove do arquivo os dados do imóvel selecionado.
     *
     * @throws FileNotFoundException Se o arquivo não puder ser acessado.
     * @throws IOException Se o arquivo não puder ser acessado.
     */
    public static void removerImovel() throws FileNotFoundException, IOException {
        // OBTÉM A REFERÊNCIA DO IMÓVEL QUE O USUÁRIO DESEJA EXCLUIR
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a referencia do imóvel: ");
        String referencia = leitor.nextLine();

        File arquivo = new File("imoveis.csv");
        leitor = new Scanner(arquivo);

        // DEFINE UM VETOR PARA FAZER UMA CÓPIA DO ARQUIVO NA MEMÓRIA
        int qtdeImoveis = atualizaQdteImoveis();
        String[] conteudo = new String[qtdeImoveis + 1];
        int iLinha = 0;

        // FAZENDO UMA CÓPIA NA RAM DO CONTEÚDO DO ARQUIVO
        while (leitor.hasNextLine()) {
            conteudo[iLinha] = leitor.nextLine();
            iLinha++;
        }
        leitor.close();

        // RESCREVENDO CÓPIA DO CONTEÚDO NO ARQUIVO
        FileWriter escritor = new FileWriter(arquivo);
        for (int i = 0; i < iLinha; i++) {
            String[] campos = conteudo[i].split(",");

            // CUIDANDO PARA NÃO RESCREVER A LINHA QUE O USUÁRIO SOLICITOU
            if (!campos[0].equals(referencia)) {
                escritor.write(conteudo[i]);
                if (i != iLinha - 1) {
                    escritor.write("\n");
                }
            }
        }
        escritor.flush();
        escritor.close();
        System.out.println("Imóvel removido com sucesso!");
    }
}
