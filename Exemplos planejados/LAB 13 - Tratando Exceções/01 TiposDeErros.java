import java.util.Scanner;

public class TiposDeErros {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um valor real: ");
        double valor = in.nextDouble(); // Pode gerar uma java.util.InputMismatchException
        in.close();

        System.out.printf("Valor: R$ %.2f\n", valor);
    }
}