import java.util.Scanner;

public class ConjugarPresente {

    public static void main(String[] args) {
        
        // Definir o objeto para a entrada de dados.
        Scanner in = new Scanner(System.in);

        // Obter o verbo a ser conjugado.
        System.out.print("Informe o verbo a ser conjugado: ");
        String verbo = in.next();

        // Fechar o objeto de entrada de dados.
        in.close();

        // Definir um vetor com as pessoas a serem conjugadas.
        String[] pessoas = {"Eu", "Tu", "Ele", "Nós", "Vós", "Eles"};

        // Definir um vetor com o sufixo para cada pessoa.
        String[] sufixos = {"o", "as", "a", "amos", "ais", "am"};

        // Repetição para conjugar o verbo para cada pessoa.
        for (int i = 0; i < pessoas.length; i++) {

            // - * Substituir o final do verbo pelos respectivos sufixos de cada pessoa. *
            String prefixo = verbo.substring(0, verbo.length() - 2);
            String conjugado = prefixo + sufixos[i]; 

            // - Exibir o verbo conjugado.
            System.out.println(pessoas[i] + " " + conjugado);
        }

    }
    
}