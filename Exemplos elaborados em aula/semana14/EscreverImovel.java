import java.io.File;
import java.io.FileWriter;

public class EscreverImovel {

    public static void main(String[] args) throws Exception {

        // Definir o arquivo que será usado.
        File csv = new File("imoveis.csv");

        // Definir um objeto escritor de arquivos.
        FileWriter escritor = new FileWriter(csv, true);

        // Escrever a linha no arquivo definido.
        escritor.write("5,casa,Caiçara,300000\n");
        
        // "Garantir" que tudo foi escrito no arquivo.
        escritor.flush();

        // Fechar o escritor de arquivo.
        escritor.close();

        System.out.println("Imóvel inserido no arquivo");
    }
    
}