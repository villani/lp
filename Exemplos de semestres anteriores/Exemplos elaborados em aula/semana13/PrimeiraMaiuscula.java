import java.util.Scanner;

public class PrimeiraMaiuscula {

    public static void main(String[] args) {
        
        // Definir um objeto para entrada de dados.
        Scanner in = new Scanner(System.in);

        // Obter uma frase do usuário.
        System.out.print("Informe uma frase: ");
        String frase = in.nextLine();

        // Fechar o objeto de entrada de dados.
        in.close();

        // Definir "flag".
        boolean maiusculo = true;

        // Imprimir caractere por caractere da frase.
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            
            // - Se o caractere impresso for um espaço, então deixar em maiúsculo o próximo.
            if (maiusculo) {

                // Converte o caractere para maiúsculo e imprime 
                System.out.print(String.valueOf(caractere).toUpperCase());

                // Deixa a "flag" como falsa.
                maiusculo = false;

            } else {

                System.out.print(caractere);

                // Se o caratere impresso foi um espaço, o próximo deve ser impresso em maiúsculo.
                if (caractere == ' ') maiusculo = true;
            }
        }
        System.out.println();
    }
}