import java.util.Scanner;

public class SelecionarOpcao {

    public static void main(String[] args) {
        
        // MOSTRANDO AS OPÇÕES DO MENU
        System.out.println("Menu de opções");
        System.out.println("1 - Somar dois números.");
        System.out.println("2 - Raiz quadrada de um número.");
        System.out.print("Escolha uma opção: ");
        
        // ENTRADA
        Scanner in = new Scanner(System.in);
        int opcao = in.nextInt();

        // PROCESSAMENTO
        switch (opcao) {
            case 1:
                int a, b;
                // ENTRADA
                System.out.print("Informe o valor de A:");
                a = in.nextInt();
                System.out.print("Informe o valor de B:");
                b = in.nextInt();

                // PROCESSAMENTO
                int soma = a + b;

                // SAÍDA
                System.out.println("Soma: " + soma);
                break;

            case 2:
                int c;

                // ENTRADA
                System.out.println("Informe o valor de C: ");
                c = in.nextInt();

                // PROCESSAMENTO
                double raiz = Math.sqrt(c);

                // SAÍDA
                System.out.println("Raiz: " + raiz);

                break;
        
            default:

                System.out.println("Opção inválida.");
                break;
        }
        in.close();


    }
    
}