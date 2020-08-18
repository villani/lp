import java.util.Arrays;
import java.util.Scanner;

class OrdenarPalavras {
    public static void main(String[] args) {
        
        // Definir um objeto para entrada de dados.
        Scanner in = new Scanner(System.in);

        // Obter uma frase do usuário.
        System.out.println("Informe uma frase: ");
        String frase = in.nextLine();

        // Fechar o objeto de entrada de dados.
        in.close();

        // Dividir a frase em pedaços usando o caractere espaço " ".
        String[] palavras = frase.split(" ");

        // Ordenar os elementos do vetor (ordenar as palavras).
        Arrays.sort(palavras);

        // Apresentar as palavras ordenadas.
        for (String palavra: palavras) {
            System.out.print(palavra + " ");
        }
    }
}