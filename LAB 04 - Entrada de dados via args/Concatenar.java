public class Concatenar {
    
    public static void main(String[] args) {
        
        // Recebe dois argumentos do vetor args e concatena
        // - Verifica se a quantidade necessário de argumentos foi informada.
        if (args.length < 2) {
            System.out.println("Ao menos dois elementos devem ser informados.");
        }

        System.out.println("Resultado: " + (args[0] + args[1]));
    }
}