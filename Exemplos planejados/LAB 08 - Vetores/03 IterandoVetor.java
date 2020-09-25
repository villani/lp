public class IterandoVetor {
    public static void main(String[] args) {
                
        int i = 0;

        // For aprimorado (foreach) - Estrutura de repetição específica para vetores
        for (String arg: args) {
            System.out.println("Args["+ i++ +"] = " + arg);
        }

        System.out.println("i: " + i);
    }
}