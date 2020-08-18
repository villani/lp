import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerTodoArquivo {

    public static void main(String[] args) {
        
        // Tentar executar os passos a seguir.
        try {

            // - Definir o arquivo a ser lido.
            File csv = new File("imoveis.csv");

            // - Definir o objeto leitor de arquivos.
            Scanner leitor = new Scanner(csv);

            // - Obter e exibir as linhas do arquivo.
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }

            // - Fechar objeto leitor.
            leitor.close();
        } catch (FileNotFoundException fnfe) { // Capturar exceções que forem lançadas.
            // - Exibir mensagem da exceção capturada.
        }

        // Exibir mensagem de finalização do programa.
        System.out.println("Fim da execução do programa.");
    }
    
}