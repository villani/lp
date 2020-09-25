import java.util.Arrays;

public class DeclaraVetor {
    public static void main(String[] args) {
        
        // Declarando e inicializando vetores com os valores padrões.
        int[] fibo = new int[5];
        String[] presidentes = new String[5];

        // Declarando e inicializando vetores com valores predefinidos.
        int[] fibo2 = {0, 1, 1, 3, 5, 8}; // tamanho 6
        String[] ministerios = {"saúde", "educação", "segurança pública"}; // tamanho 3

        // Exibindo o conteúdo dos vetores.
        System.out.println(Arrays.toString(fibo));
        System.out.println(Arrays.toString(fibo2));
        System.out.println();
        System.out.println(Arrays.toString(presidentes));
        System.out.println(Arrays.toString(ministerios));
    }
}