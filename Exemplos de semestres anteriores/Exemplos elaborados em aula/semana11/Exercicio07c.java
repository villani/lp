import java.util.Arrays;

public class Exercicio07c {

    public static void main(String[] args) {
        
        // Definir uma matriz 4x5 de valores reais.
        double[][] matriz = new double[4][5];

        // Definir variável para armazenar o menor número e linha.
        double menor = 0;
        int linha = -1;

        // Definir variável para armazenar o maior número e coluna.
        double maior = 0;
        int coluna = -1;

        // Preencher a matriz com valores aleatórios.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Math.random();

                // Verificar se o número é o maior já informado.
                if (matriz[i][j] < menor || linha == -1) {

                    // Se sim, armazenar referências do menor número.
                    menor = matriz[i][j];
                    linha = i;
                }
            }
        }
        
        // Repetição para procurar o maior número na linha (MINMAX).
        for (int i = 0; i < matriz[linha].length; i++) {
            if (matriz[linha][i] > maior || coluna == -1) {
                maior = matriz[linha][i];
                coluna = i;
            }
        }

        // Exibir a matriz.
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        // Exibir posição e valor do elemento MINMAX.
        System.out.println("MINMAX = matriz[" + linha + "][" + coluna + "]: " + maior);

    }
    
}