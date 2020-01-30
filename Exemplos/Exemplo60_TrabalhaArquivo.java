package lp;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Este exemplo contém a implementação de uma rotina que realiza a leitura do
 * conteúdo de um arquivo
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo60_TrabalhaArquivo.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo60_TrabalhaArquivo {

    /**
     * Obtém uma linha de um arquivo e exibe palavra por palavra dessa linha.
     *
     * @param args Não utiliza argumentos externos.
     * @throws IOException Se o arquivo informado não puder ser encontrado.
     */
    public static void main(String[] args) throws IOException {

        File relatorio = new File("relatorio.log");
        Scanner leitor = new Scanner(relatorio);
        String linha = leitor.nextLine();
        String[] palavras = linha.split(" ");
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Palavra " + i + ": " + palavras[i]);
        }

    }

}
