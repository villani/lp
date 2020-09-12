import java.util.Scanner;

public class IdentificaMaiorScanner {
    public static void main(String[] args) {
        int valorA, valorB;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe um valor inteiro: ");
        valorA = in.nextInt();

        System.out.print("Informe outro valor inteiro: ");
        valorB = in.nextInt();

        // Fechando o leitor do arquivo System.in
        in.close();

        // Identificando o maior valor
        if (valorA > valorB) {
            System.out.println(valorA + " é o maior.");
        } else {
            System.out.println(valorB + " é o maior.");
        }

    }
}