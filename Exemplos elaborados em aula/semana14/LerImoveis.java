 import java.io.File;
import java.util.Scanner;

class LerImoveis {
    public static void main(String[] args) throws Exception {
        
        // Definindo o arquivo que será lido.
        File csv = new File("imoveis.csv");

        // Definindo um objeto leitor de arquivos.
        Scanner leitor = new Scanner(csv);

        // Lendo uma linha do arquivo.
        String linha = leitor.nextLine();

        // Fechando o objeto leitor de arquivos.
        leitor.close();

        // Exibindo a linha lida.
        System.out.println(linha);

    }
}