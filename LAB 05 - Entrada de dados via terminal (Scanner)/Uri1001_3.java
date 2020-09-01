import java.util.Scanner;

// NOME DO PROGRAMA
class Uri1001_3 {

    // AÇÃO PRINCIPAL
    public static void main(String[] args) {
        
        // ENTRADA DE DADOS
        // - Criando objeto de entrada de dados
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        int a = in.nextInt();

        System.out.print("Informe outro valor inteiro: ");
        int b = in.nextInt();
        
        in.close(); // - Finalizando o objeto.

        // PROCESSAMENTO
        int x = a + b;

        // SAÍDA DE DADOS
        System.out.println("X=" + x);

        // SAÍDA DE DADOS ALTERNATIVA
        System.out.printf("X = %d\n", x);
        // %d - para 'encaixar' valores inteiros
        // %f - para 'encaixar' valores reais
        // %s - para 'encaixar' textos (String)
    }
}