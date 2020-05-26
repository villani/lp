import java.util.Arrays;

class TrocarPosicao {
    public static void main(String[] args) {

        // Vetor com dois elementos.
        int[] vetor = {5, 9};

        // Exibir os elementos do vetor.
        System.out.println(Arrays.toString(vetor));

        // Definir uma variável temporário de apoio.
        int temp;

        // Troca a posição dos elementos.
        temp = vetor[0];
        vetor[0] = vetor[1];
        vetor[1] = temp;

        // Exibir os elementos do vetor.
        System.out.println(Arrays.toString(vetor));
    }
}