class Exercicio10a {
    public static void main(String[] args) {
        
        // ATIVANDO O MÉTODO DEFINIDO
        double acrescimo = identificarAcrescimo(0.8, 1);
        System.out.println("Resultado: " + acrescimo + "%");
    }

    // DEFININDO O MÉTODO
    /**
     * Contribuição do Danilo. Calculo o percentual de acréscimo.
     * @param antigo Preço antigo.
     * @param atual Preço atual.
     * @return O percentual calculado.
     */
    public static double identificarAcrescimo(double antigo, double atual) {
        
        // Definir uma variável que armazenará o percentual de acréscimo.
        double acrescimo;

        // PROCESSAMENTO - Realizar cálculo e armazenar na variável definida.
        acrescimo = ((atual / antigo) - 1) * 100;

        // Retornar o valor calculado.
        return acrescimo;
    }
}