import java.util.Scanner;

// NOME DO PROGRAMA
class Uri1004 {

    // AÇÃO PRINCIPAL
    public static void main(String[] args) {
        
        // ENTRADA DE DADOS
        // - Criando objeto de entrada de dados
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        
        in.close(); // - Finalizando o objeto.

        // PROCESSAMENTO
        int x = a * b;

        // SAÍDA DE DADOS
        System.out.println("PROD = " + x);
    }
}