public class Exercicio10b {
    public static void main(String[] args) {

        // ATIVAR O MÉTODO DEFINIDO
        System.out.println("Média: " + calcularMedia(10, 9, 8.5, 'p'));
    }

    // DEFINIR MÉTODO
    public static double calcularMedia(double p1, double p2, double p3, char tipo) {
        
        // Definir uma variável que armazenará a média calculada.
        double media = 0;

        // Identificar o tipo de média a ser calculada.
        if (tipo == 'a' || tipo == 'A') {
        
            // - Realizar o cálculo da média aritmética.
            media = (p1 + p2 + p3) / 3;
        } else {
            
            // - Realizar o cálculo da média ponderada.
            media = (p1*5 + p2*3 + p3+2) / (5+3+2);
        }

        // Retornar a média calculada.
        return media;
    }
    
}