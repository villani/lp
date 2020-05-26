import java.util.Arrays;
import java.util.Random;

public class PreencheMatriz {

    public static void main(String[] args) {
        
        // Gerador de números aleatórios.
        Random gerador = new Random();

        // Matriz 3x3
        int[][] matriz = new int[3][3];

        // Repetição para a primeira dimensão.
        for (int i = 0; i < matriz.length; i++) {

            // Repetição para a segunda dimensão.
            for (int j = 0; j < matriz[i].length; j++) {

                // Armazenando um inteiro aleatório em cada posição.
                matriz[i][j] = gerador.nextInt(100) + 1;
            }
        }
                
        // Exibindo os valores da matriz.
        for (int[] linha: matriz) {
            System.out.println(Arrays.toString(linha));
        }

    }
    
}