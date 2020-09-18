import java.util.Scanner;

public class CalculaFatorial {
    
    public static void main(String[] args) {

        // Objeto para entrada de dados.
        Scanner in = new Scanner(System.in);

        // Obter a quantidade de cálculos fatoriais.
        System.out.print("Informe a quantidade de cálculos a serem realizados: ");
        int n = in.nextInt();

        while (n-- > 0) {
            // Calcula o fatorial de um número.
            System.out.print("Informe um inteiro positivo: ");
            int fat = in.nextInt();
            for (int i = fat - 1; i > 0; i--) {
                fat *= i;
            }
            System.out.println("O fatorial desse número é: " + fat);
        }
        in.close();
    }
}