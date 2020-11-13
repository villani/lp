class Exercicio10a {
    public static void main(String[] args) {
        
        // ATIVANDO O MÉTODO DEFINIDO
        int horas = toHour(7200);
        System.out.println("Hora: " + horas);
        double acrescimo = identificarAcrescimo(0.8, 1.0);
        System.out.println("Resultado: " + acrescimo + "%");
    }

    /**
     * Convert to hour the informed param.
     * @param seconds The second to be converter.
     * @return The seconds converted to hour.
     */
    public static int toHour(int seconds) {
        int hour = 0;
        hour = seconds / 3600;
        return hour;
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