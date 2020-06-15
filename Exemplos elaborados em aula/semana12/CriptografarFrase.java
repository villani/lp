import java.util.Scanner;

public class CriptografarFrase {
    public static void main(String[] args) {
        
        // DEFINIR UM OBJETO PARA A ENTRADA DE DADOS.
        Scanner in = new Scanner(System.in);

        // OBTER A FRASE DO USUÁRIO
        System.out.print("Informe uma frase: ");
        String frase = in.nextLine();

        // FECHAR OBJETO DE ENTRADA DE DADOS.
        in.close();

        // CRIPTOGRAFAR A FRASE RECEBIDA.
        frase = criptografarFrase(frase);

        // EXIBIR A FRASE CRIPTOGRAFADA.
        System.out.println("CRIPTOGRAFIA: " + frase);
    }

    public static String criptografarFrase(String frase) {

        // DEFINIR OS CARACTERES QUE SERÃO CRIPTOGRAFADOS.
        String minusculas = "aeiouáéíóúàèìòùäëïöüãẽĩõũâêîôû";
        String maiusculas = minusculas.toUpperCase();
        String vogais = minusculas + maiusculas;

        // REPETIÇÃO PARA OBTER CADA CARACTERE.
        for (int i = 0; i < vogais.length(); i++) {
            char vogal = vogais.charAt(i);

            // - SUBSTITUIR CADA CARACTERE ESPECIFICADO POR "*".
            frase = frase.replace(vogal, '*');
        }

        // RETORNA A FRASE CRIPTOGRAFADA.
        return frase;
    }
}