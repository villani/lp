import java.util.Arrays;

public class PreencheVetor2 {
    public static void main(String[] args) {
        
        // Declarando e inicializando o vetor com os valores padrões.
        String[] ministerios = new String[5]; // valor padrão para String = null

        // 'fill' - preenche um vetor com o valor informado por parâmetro.
        Arrays.fill(ministerios, "indefinido");

        // 'toString' - monta uma string com os elementos do vetor.
        System.out.println(Arrays.toString(ministerios));

        // 'sort' - ordena os elementos de um vetor. Ordem crescente.
        int[] nums = {34, 76, 12, 8, 17, 34, 98};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}