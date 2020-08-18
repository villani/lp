public class EstruturaWhile {
    
    public static void main(String[] args) {
        
        // Variável de controle.
        int i = 0;

        // Gerando números aleatórios com o while.
        while (++i < 5) {

            // Armazeando em uma variável um valor aleatório 1 à 100.
            int random = (int)(Math.random() * 100) + 1;

            // Mostrando o valor armazenado.
            System.out.print(random + "\t");
        }

        System.out.println();
    }
}