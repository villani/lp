package lp;

import java.util.Scanner;

/**
 * Este exemplo contém usa um novo tipo de dado implementado em outro arquivo
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo66_MaisCaro.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo66_MaisCaro {

    /**
     * Cria um vetor de objetos do tipo carro e identifica qual dos modelos
     * inseridos no vetor é o mais caro e qual é o mais barato.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        // DECLARANDO UMA VARIÁVEL DO TIPO Carro
        Exemplo63_Carro obj = new Exemplo63_Carro();

        // DEFININDO OS VALORES DOS ATRIBUTOS DO OBJETO Carro
        obj.modelo = "Corcel";
        obj.valor = 15000.00;

        // MOSTRANDO OS VALORES DOS ATRIBUTOS DO OBJETO Carro
        System.out.println("Modelo: " + obj.modelo);
        System.out.println("Valor: " + obj.valor);

        // IMPLEMENTANDO PSEUDOCÓDIGO DESENVOLVIDO
        Exemplo63_Carro[] carros = new Exemplo63_Carro[5];
        Scanner leitor = new Scanner(System.in);
        int menor, maior;
        menor = 0;
        maior = 0;
        System.out.println("CADASTRANDO CARROS:");
        for (int i = 0; i < carros.length; i++) {
            carros[i] = new Exemplo63_Carro();
            System.out.print("Informe o modelo: ");
            carros[i].modelo = leitor.next();
            System.out.print("Informe o valor: ");
            carros[i].valor = leitor.nextDouble();
            if (i == 0 || carros[i].valor < carros[menor].valor) {
                menor = i;
            }
            if (i == 0 || carros[i].valor > carros[maior].valor) {
                maior = i;
            }
        }
        System.out.println("O modelo mais caro é: " + carros[maior].modelo);
        System.out.println("O modelo mais barato é: " + carros[menor].modelo);
        leitor.close();
    }
}
