import java.util.Scanner;

class Exercicio07b {
    public static void main(String[] args) {
        
        // Definindo vetor com o nome de quatro lojas.
        String[] lojas = {"McDonalds", "Burguer King", "Giraffas", "McTude"};

        // Definindo vetor com o nome de três produtos.
        String[] produtos = {"X-Salada", "Hot Dog", "X-Tudo"};

        // Definindo a matriz de preços.
        double[][] precos = {
            {8.50, 5.00, 15.00}, // 0 - McDonalds
            {7.50, 4.50, 13.00}, // 1 - Burguer King
            {8.00, 4.75, 13.50}, // 2 - Giraffas
            {2.50, 1.50, 4.00}   // 3 - McTude
        };

        // Definindo o objeto para leitura de dados.
        Scanner in = new Scanner(System.in);
        
        // Definindo o valor do filtro.
        System.out.print("Informe quanto há na carteira? R$ ");
        double filtro = in.nextDouble();

        // Fechando o objeto de leitura dos dados.
        in.close();

        // Repetição para a primeira dimensão da matriz.
        for (int loja = 0; loja < lojas.length; loja++) {

            // Repetição para a segunda dimensão da matriz.
            for (int produto = 0; produto < produtos.length; produto++) {
            
                // Seleção para verificar se produto está abaixo do filtro informado.
                if (precos[loja][produto] < filtro) {
                    
                    // Exibir nome da loja, do produto e o respectivo preço.
                    System.out.print(lojas[loja] + " - " + produtos[produto] + ": ");
                    System.out.printf("R$ %.2f\n", precos[loja][produto]);
                }
            }
        }
    }
}