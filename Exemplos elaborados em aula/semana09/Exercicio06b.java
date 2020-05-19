import java.util.Arrays;
import java.util.Random;

public class Exercicio06b {

    public static void main(String[] args) {
        
        // Objeto gerador de número aleatórios.
        Random gerador = new Random();

        // Vetores para armazenar o números gerados.
        int[] vet1, vet2, vet3;

        // Inicializando os vetores com cinco elementos
        vet1 = new int[5];
        vet2 = new int[5];
        vet3 = new int[vet1.length + vet2.length];

        // Estrutura para armazenar um número em cada elemento.
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = gerador.nextInt(201) - 100;
            vet2[i] = gerador.nextInt(201) - 100;
        }

        // Exibir os dois primeiros vetores gerados.
        System.out.println(Arrays.toString(vet1));
        System.out.println(Arrays.toString(vet2));

        // Estrutura para gerar o terceiro vetor a partir da intercalação dos dois primeiros.
        int j = 0;
        for (int i = 0; i < vet3.length; i++) {
            vet3[i++] = vet1[j];
            vet3[i] = vet2[j++];
        }

        // Exibir o vetor resultante.
        System.out.println(Arrays.toString(vet3));

    }
    
}