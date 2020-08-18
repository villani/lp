import java.util.Scanner;

public class Exercicio07a {

    public static void main(String[] args) {
        // Objeto para entrada de dados.
        Scanner in = new Scanner(System.in);
        
        // Matriz 5x3 com as três notas de cinco alunos.
        double[][] notas = new double[5][3];

        // Contador de menor nota para cada uma das três avaliações.
        int[] menores = new int[3];

        // Menor nota informada.
        double menor = 0;   // - Valor da nota
        int notaMenor = 0;  // - Identificação da nota

        // Repetição para inserir as notas de cada aluno.
        for (int i = 0; i < notas.length; i++) {

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Informe a N" + (j+1) + " do Aluno " + (i+1) + ": ");
                notas[i][j] = in.nextDouble();

                // - Verifica se a nota é a menor já informada.
                if (j == 0 || notas[i][j] < menor) {
                    menor = notas[i][j];
                    notaMenor = j;
                }
            }
            System.out.println("A avaliação " + (notaMenor+1) + " foi a pior: " + menor);
            menores[notaMenor]++;
        }

        // Exibir um relatório de quantidade de menor nota em cada avaliação.
        System.out.println("AVALIAÇÕES MAIS DIFÍCEIS");
        for (int i = 0; i < menores.length; i++) {
            System.out.println("Avaliação " + (i + 1) + ": " + menores[i]);
        }

    }
    
}