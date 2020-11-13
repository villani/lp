package lp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Este exemplo contém a implementação de uma rotina que insere e altera as informações de um arquivo.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class EscreveArquivo {

    /**
     * Cria um arquivo, insere conteúdo nele, salva, fecha, abre novamente o
     * arquivo e altera o conteúdo dele.
     *
     * @param args Não utiliza argumentos externos.
     * @throws IOException Se não for possível criar ou acessar o arquivo.
     */
    public static void main(String[] args) throws IOException {

        File relatorio = new File("relatorio.log");

        System.out.println("Criando arquivo.");
        relatorio.createNewFile();

        FileWriter escritor = new FileWriter(relatorio);

        System.out.println("Escrevendo no arquivo.");
        escritor.write("Arquivo de relatório criado.\n");
        escritor.write("Proximos passos:\n");
        escritor.write("Salvar e liberar recursos do S.O.\n");

        System.out.println("Garantindo que todos os dados já foram escritos no arquivo");
        escritor.flush();

        System.out.println("Salvando arquivo.");
        escritor.close();

        // Não é possível escrever no arquivo depois que ele for fechado.
//		escritor.write("Algo mais.");
        FileWriter escritor02 = new FileWriter(relatorio, true); // Acrescenta conteúdo ao invés de sobrescreve-lo
        escritor02.write("Nova linha no arquivo");
        escritor02.flush();
        escritor02.close();
        System.out.println("Nova linha acrescentada no arquivo");

    }

}
