package lp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Este exemplo contém a implementação de uma rotina que realiza a leitura do conteúdo de um arquivo.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class LeArquivo {

    /**
     * Lê caracter por caracter de um arquivo.
     *
     * @param args Não utiliza argumentos externos.
     * @throws FileNotFoundException Se o arquivo informado não puder ser
     * encontrado.
     * @throws IOException Se não tiver permissão para acessar o arquivo.
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File relatorio = new File("relatorio.log");
        FileReader leitor = new FileReader(relatorio);

        while (leitor.ready()) {
            char c = (char) leitor.read();
            System.out.print(c);
        }

        System.out.println("Liberando arquivo para o S.O.");
        leitor.close();

    }

}
