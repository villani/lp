package lp;

import java.util.Scanner;

/**
 * Este exemplo contém uma possível implementação de programa que identifica a
 * avaliação que o aluno teve maior dificuldade e também qual das avaliações foi
 * a mais difícil.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo24_RelatorioNotas {

    /**
     * Recebe três notas de cinco alunos, identifica qual foi a menor nota de
     * cada aluno e qual a avaliação com maior número de notas baixas.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        // Definição das variáveis.
        double[][] notas = new double[5][3];
        double menor;
        int a1, a2, a3, a_menor, i, j;

        // Definição do objeto responsável pela entrada de dados no programa.
        Scanner leitor = new Scanner(System.in);

        // Iteração para a entrada da nota de cada aluno.
        for (i = 0; i < notas.length; i++) {
            for (j = 0; j < notas[0].length; j++) {
                System.out.print("Informe a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                notas[i][j] = leitor.nextDouble();
            }
            System.out.println();
        }

        // Fechando o objeto de entrada de dados.
        leitor.close();

        // Realizando os calculos do programa.
        a1 = 0;
        a2 = 0;
        a3 = 0;
        for (i = 0; i < notas.length; i++) {
            System.out.print("Aluno " + (i + 1) + " - Menor nota: ");

            // Identificando menor nota.
            menor = notas[i][0];
            a_menor = 0;
            for (j = 1; j < notas[0].length; j++) {
                if (notas[i][j] < menor) {
                    menor = notas[i][j];
                    a_menor = j;
                }
            }
            System.out.println(menor);

            // Contabilizando avaliação com menor nota.
            if (a_menor == 0) {
                a1++;
            }
            if (a_menor == 1) {
                a2++;
            }
            if (a_menor == 2) {
                a3++;
            }
        }

        // Exibindo a quantidade de notas baixa por avaliação.
        System.out.println("QUANTIDADE DE NOTAS BAIXA POR AVALIAÇÃO");
        System.out.println("Nota 1: " + a1);
        System.out.println("Nota 2: " + a2);
        System.out.println("Nota 3: " + a3);
    }

}
