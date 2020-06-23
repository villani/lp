import java.io.File;
import java.util.Scanner;

public class TratarLinhas2 {

    public static void main(String[] args) throws Exception {

        // Definir o arquivo a ser lido.
        File csv = new File("imoveis.csv2");

        // Definir o objeto que faz a leitura.
        Scanner leitor = new Scanner(csv);

        // Obter a linha de cabeçalho das colunas.
        String linha = leitor.nextLine();

        // Separar os cabeçalhos das colunas.
        String[] headers = linha.split(",");

        // Obter as demais linhas do arquivo (imóveis).
        while (leitor.hasNextLine()) {

            // - Separar os dados de cada imóvel.
            linha = leitor.nextLine();
            String[] dados = linha.split(",");

            // - Exibir cada dado com o respectivo cabeçalho.
            for (int i = 0; i < headers.length; i++) {
                System.out.println(headers[i] + ": " + dados[i]);
            }
            System.out.println();
        }

        // Fechar objeto de leitura.
        leitor.close();

        System.out.println("Programa executado até o final.");
    }

}