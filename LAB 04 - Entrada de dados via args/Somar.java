public class Somar {

    public static void main(String[] args) {

        // Recebe dois argumentos do vetor args e concatena
        // - Verifica se a quantidade necessário de argumentos foi informada.
        if (args.length < 2) {
            System.out.println("Ao menos dois elementos devem ser informados.");
        } else {

            // Criando variáveis inteiras.
            int a = Integer.parseInt(args[0]); // - Convertendo texto para inteiro.
            int b = Integer.parseInt(args[1]);

            System.out.println("Resultado: " + (a + b));
        }
    }
}