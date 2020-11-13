package lp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Este exemplo contém a implementação de uma rotina que realiza a leitura do conteúdo de um arquivo.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class LeArquivoAlternativo {

    /**
     * Lê linha por linha de um arquivo
     *
     * @param args Não utiliza argumentos externos.
     * @throws FileNotFoundException Se o arquivo informado não puder ser
     * encontrado.
     */
    public static void main(String[] args) throws FileNotFoundException {

        File relatorio = new File("relatorio.log");
        Scanner leitor = new Scanner(relatorio);

        while (leitor.hasNextLine()) {
            System.out.println(leitor.nextLine());
        }

        leitor.close();

    }

}
