import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TratarLinhas {
    
    public static void main(String[] args) {

        // Tratando possíveis exceções que podem ser lançadas.
        try {
            // Definir o arquivo a ser lido.
            File csv = new File("imoveis.csv");

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
                    if (i != 3) {
                        System.out.println(headers[i] + ": " + dados[i]);
                    } else {
                        double moeda = Double.parseDouble(dados[i]);
                        System.out.printf("%s: R$ %.2f\n", headers[i], moeda);
                    }
                }
                System.out.println();
            }

            // Fechar objeto de leitura.
            leitor.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Erro: [" + fnfe.getMessage() + "]");
        }
        System.out.println("Programa executado até o final.");
    }
}