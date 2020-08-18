import java.util.Scanner;

public class EstruturaDoWhile {
    
    public static void main(String[] args) {
        
        // Objeto para entrada de dados.
        Scanner in = new Scanner(System.in);

        // Usando uma estrutura de repetição para criar uma validação de dados.
        int entrada = 0;
        do {
            System.out.print("Informe um valor inteiro par: ");
            entrada = in.nextInt();
            if (entrada % 2 != 0 || entrada == 0) {
                System.out.println("Um inteiro acima de 0 deve ser informado.");
            }
        } while (entrada % 2 != 0 || entrada == 0);

        // Entrada fornecida corretamente.
        System.out.println("A entrada foi fornecida corretamente. Valor: " + entrada);
        in.close();
    }
}