import java.util.Scanner;

public class Exercicio04c {

    public static void main(String[] args) {
        
        // Inserindo o objeto de entrada de dados.
        Scanner in = new Scanner(System.in);

        // Variáveis para armazenar os valores dos lados de um triângulo.
        int base, altura;

        // Recebendo os dados de um triângulo.
        do {
            System.out.print("Informe o valor da base do triângulo: ");
            base = in.nextInt();
            System.out.print("Informe o valor da altura do triângulo: ");
            altura = in.nextInt();
            if (base <=0 || altura <= 0) {
                System.out.println("Os valores informados devem ser maior que 0");
            }
        } while (base <=0 || altura <= 0);
        in.close();

        // Calculando a área do triângulo.
        int area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
    }
    
}