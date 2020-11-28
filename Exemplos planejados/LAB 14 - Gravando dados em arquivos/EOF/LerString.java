import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

class LerString {
    public static void main(String[] args) throws Exception {

        // Define o arquivo padrão de entradas
        System.setIn(new FileInputStream("entradas.txt"));
        
        // Define um leitor de arquivos
        Scanner in = new Scanner(System.in);

        // Variáveis do programa
        String s = "";
        String saida = "";

        // Itera ENQUANTO houverem INTEIROS a serem lidos
        while(in.hasNext()) {
            s = in.next();
            saida += s;
            if(s.equals("\n")) break;
        }
        in.close();
        System.out.println("EOF");

        // Altera o local padrão de saída
        //System.setOut(new PrintStream("saida.txt"));

        System.out.print(saida);
        
    }
}