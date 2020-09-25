import java.util.Scanner;

public class Exercicio04b {
    
    public static void main(String[] args) {
        
        // Objeto para entrada de dados.
        Scanner in = new Scanner(System.in);

        // Entrada da quantidade de valores da sequência de Fibonacci.
        System.out.print("Informe a quantidade de valores da sequência: ");
        int n = in.nextInt();
        in.close();
        
        // Cálculo da sequência de Fibonacci.
        int ant = 0;
        int atual = 1;
        System.out.print(ant + " - " + atual);
        for (int i = 2; i < n; i++) {
            int prox = ant + atual;
            System.out.print(" - " + prox);
            ant = atual;
            atual = prox;
        }
        System.out.println();
    }
}