import java.util.Arrays;
import java.util.Random;

public class OrdenaVetor {
    public static void main(String[] args) {
        
        // Um vetor com cinco posições.
        int[] nums = new int[5];

        // Um objeto gerador de números aleatórios.
        Random gerador = new Random();

        // Armazenar um inteiro aleatório em cada posição do vetor.
        for (int i = 0; i < nums.length; i++) {
            nums[i] = gerador.nextInt(100) + 1;            
        }

        // Exibir o vetor desordenado.
        System.out.println(Arrays.toString(nums));

        // Colocar em ordem decrescente os elementos do vetor (bubble sort).

        // - Repetição para ordenar cada elemento do vetor.
        for (int n = nums.length; n > 0; n--) {

            // - Repetição para comparação par a par.
            for (int i = 0; i < n - 1; i++) {

                // - Troca de posição quando o elemento seguinte for menor.
                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }

        // Exibir o vetor ordenado.
        System.out.println(Arrays.toString(nums));
    }
}