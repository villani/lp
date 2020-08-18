import java.util.Arrays;
import java.util.Random;

public class Exercicio06a {

    public static void main(String[] args) {
        
        // Objeto gerador de números aleatórios.
        Random gerador = new Random();

        // Vetor onde serão armazenados.
        int[] nums = new int[5];

        // Estrutura para preencher o vetor.
        for (int i = 0; i < nums.length; i++) {
            nums[i] = gerador.nextInt(101) + 1;
        }

        // Exibir o vetor com os números.
        System.out.println(Arrays.toString(nums));

        // Estrutura para verificar número por número do vetor.
        for (int i = 0; i < nums.length; i++) {

            // Estrutura para verificar se um número é primo.
            int divisores = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if (nums[i] % j == 0) divisores++;
                if (divisores > 2) break;
            }

            // Exibir número e posição dos valores primos.
            if (divisores == 2) {
                System.out.println(nums[i] + " é primo. Posição: " + i);
            }
        }
    }
}