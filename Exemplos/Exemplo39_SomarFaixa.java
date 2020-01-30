package lp;

import java.util.Scanner;

/**
 * Este exemplo contém a implementação de uma classe que possui dois métodos,
 * sendo um deles o método principal (main), usado para obter as entradas do
 * usuário e executar o segundo método
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo39_SomarFaixa.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo39_SomarFaixa {

    /**
     * Usa outro método da própria classe para calcular a soma de um intervalo
     * entre dois números
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {
        int inicio, fim, soma;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o inicio do intervalo: ");
        inicio = leitor.nextInt();
        System.out.print("Informe o fim do intervalo: ");
        fim = leitor.nextInt();
        soma = somarIntervalo(inicio, fim);
        System.out.println("A soma do intervalo é: " + soma);
    }

    /**
     * O soma o intervalo entre dois valores inteiros.
     *
     * @param ini Número que determina o início do intervalo.
     * @param fim Número que determinal o final do intervalo.
     * @return A soma do intervalo definido.
     */
    public static int somarIntervalo(int ini, int fim) {
        int soma, i;
        soma = 0;
        for (i = ini + 1; i <= fim - 1; i++) {
            soma = soma + i;
        }
        return soma;
    }
}
