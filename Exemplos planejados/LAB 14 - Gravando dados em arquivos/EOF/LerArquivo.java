import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

class LerArquivos {
    public static void main(String[] args) throws Exception {

        // Define o arquivo padrão de entradas
        //System.setIn(new FileInputStream("entradas.txt"));
        
        // Define um leitor de arquivos
        Scanner in = new Scanner(System.in);

        // Variáveis do programa
        int elementos = 0;
        int[][] matriz;
        String saida = "";

        // Itera ENQUANTO houverem INTEIROS a serem lidos
        while(in.hasNextInt()) {
            elementos = in.nextInt();
            matriz = new int[elementos][elementos];
            for(int[] vetor: matriz) {

                // Preenche matriz com o valor lido
                Arrays.fill(vetor, elementos);

                // Monta texto de saída
                saida += Arrays.toString(vetor) + "\n";
            }

        }
        in.close();
        System.out.println("EOF");

        // Altera o local padrão de saída
        System.setOut(new PrintStream("saida.txt"));

        System.out.println(saida);
        
    }
}