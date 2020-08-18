import java.util.Arrays;

public class Exercicio10c {

    public static void main(String[] args) {
        int[] inteiros = {23, 87, 89, 12, 6};
        System.out.println("Vetor: " + Arrays.toString(inteiros));

        // ATIVANDO O MÉTODO.
        int[] resp = identificarMaiorMenor2(inteiros);
        System.out.println("Menor: " + resp[0]);
        System.out.println("Maior: " + resp[1]);
    }

    // DEFINE O MÉTODO.
    public static int[] identificarMaiorMenor2(int[] vetor) {
        int[] resposta = new int[2];
        Arrays.sort(vetor);
        resposta[0] = vetor[0];
        resposta[1] = vetor[vetor.length - 1];
        return resposta;
    }

    public static int[] identificarMaiorMenor(int[] vetor) {
        int[] resposta = new int[2];

        // Repetição para examinar cada valor do vetor.
        for (int i = 0; i < vetor.length; i++) {
        
            // - Se for a primeira iteração armazenar os valores em ambas as posições de resposta.
            // - Verificar se o elemento atual é menor do que o que está na primeira posição de resposta.
            if (vetor[i] < resposta[0] || i == 0) {
                resposta[0] = vetor[i];
            } 
            
            // - Verificar se o elemento atual é maior do que o que está na segunda posição de resposta.
            if (vetor[i] > resposta[1] || i == 0) {
                resposta[1] = vetor[i];
            }
        }

        return resposta;
    }
    
}