import java.util.Arrays;
import java.util.Scanner;

public class PreencheVetor {
    public static void main(String[] args) {
        // Objeto de entrada de dados.
        Scanner in = new Scanner(System.in);

        // Um vetor onde serão armazenados os inteiros de entrada.
        int tamanho = 0;
        System.out.print("Informe a quantidade de valores de entrada: ");
        tamanho = in.nextInt();
        int[] nums = new int[tamanho];

        // Uma rotina para preencher cada posição do vetor.
        for (int i = 0; i < nums.length; i++) {
            System.out.print((i + 1) + "ª posição: ");
            nums[i] = in.nextInt();
        }
        in.close();

        // Exibir todos os valores lidos.
        System.out.println(Arrays.toString(nums));
    }
}